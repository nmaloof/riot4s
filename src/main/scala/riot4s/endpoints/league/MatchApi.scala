package riot4s.endpoints.league

import cats.effect._
import org.http4s._
import org.http4s.client._

import riot4s.domains._
import riot4s.domains.encodings._
import org.http4s.circe.CirceEntityDecoder

class MatchApi(client: Client[IO], devKey: String) extends LeagueEndpoint {

  implicit val deriveEntityDecoder: EntityDecoder[IO, MatchlistDto] =
    CirceEntityDecoder.circeEntityDecoder[IO, MatchlistDto]
  implicit val deriveEntityMatchDto: EntityDecoder[IO, MatchDto] = CirceEntityDecoder.circeEntityDecoder[IO, MatchDto]
  implicit val deriverEntityMatchTimelineDto: EntityDecoder[IO, MatchTimelineDto] =
    CirceEntityDecoder.circeEntityDecoder[IO, MatchTimelineDto]

  protected val version: String        = "v4"
  protected val matchExtension: String = s"match/$version"
  def matchUri: Uri                    = leagueEndpoint.addPath(matchExtension)

  private def requestBuilder(url: Uri): Request[IO] = {
    Request[IO](
      Method.GET,
      url,
      headers = riotHeaders(devKey)
    )
  }

  def byMatchId(matchId: Long): IO[MatchDto] = {
    val byMatchURi = matchUri.addPath(s"matches/$matchId")
    client.expect[MatchDto](requestBuilder(byMatchURi))
  }
  def byAccount(accountId: String): IO[MatchlistDto] = {
    val byAccountUri = matchUri.addPath(s"matchlists/by-account/$accountId")
    client.expect[MatchlistDto](requestBuilder(byAccountUri))
  }

  def byMatchIdTimeline(matchId: Long): IO[MatchTimelineDto] = {
    val byMatchURi = matchUri.addPath(s"timelines/by-match/$matchId")
    client.expect[MatchTimelineDto](requestBuilder(byMatchURi))
  }

}
