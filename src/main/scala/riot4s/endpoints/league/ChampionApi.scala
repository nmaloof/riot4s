package riot4s.endpoints.league

import cats.effect._
import org.http4s._
import org.http4s.client._

import riot4s.domains._
import riot4s.domains.encodings._
import org.http4s.circe.CirceEntityDecoder

class ChampionApi(client: Client[IO], devKey: String) extends LeagueEndpoint {

  implicit val deriveEntityDecoder: EntityDecoder[IO, ChampionInfo] =
    CirceEntityDecoder.circeEntityDecoder[IO, ChampionInfo]

  protected val version: String = "v3"
  def championUri: Uri          = leagueEndpoint.addPath(s"platform/$version/champion-rotations")

  private def requestBuilder(url: Uri): Request[IO] = {
    Request[IO](
      Method.GET,
      url,
      headers = riotHeaders(devKey)
    )
  }

  def getChampionRotations(): IO[ChampionInfo] = {
    client.expect[ChampionInfo](requestBuilder(championUri))
  }

}
