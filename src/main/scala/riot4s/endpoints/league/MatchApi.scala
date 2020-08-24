package riot4s.endpoints.league

import cats.effect._
import org.http4s._
import org.http4s.client._

import riot4s.domains._
import riot4s.domains.encodings._
import org.http4s.circe.CirceEntityDecoder

class MatchApi(client: Client[IO], devKey: String) extends LeagueEndpoint {

  implicit val deriveEntityDecoder: EntityDecoder[IO, MatchResponse] =
    CirceEntityDecoder.circeEntityDecoder[IO, MatchResponse]

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

  def byAccount(accountId: String): IO[MatchResponse] = {
    val byAccountUri = matchUri.addPath(s"matchlists/by-account/$accountId")
    client.expect[MatchResponse](requestBuilder(byAccountUri))
  }

}
