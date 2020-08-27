package riot4s.endpoints.league

import cats.effect._
import org.http4s._
import org.http4s.client._
// import org.http4s.dsl.io._
import org.http4s.circe._

import riot4s.domains._
import riot4s.domains.encodings._

class SpectatorApi(client: Client[IO], devKey: String) extends LeagueEndpoint {
  protected val version: String = "v4"
  def spectatorUri: Uri         = leagueEndpoint.addPath(s"spectator/$version")

  implicit val deriveEntityDecoder: EntityDecoder[IO, FeaturedGames] =
    CirceEntityDecoder.circeEntityDecoder[IO, FeaturedGames]
  implicit val deriveEntityDecoder2: EntityDecoder[IO, CurrentGameInfo] =
    CirceEntityDecoder.circeEntityDecoder[IO, CurrentGameInfo]

  private def requestBuilder(url: Uri): Request[IO] = {
    Request[IO](
      Method.GET,
      url,
      headers = riotHeaders(devKey)
    )
  }

  def getListFeaturedGames(): IO[FeaturedGames] = {
    val listFeaturedGamesUri = spectatorUri.addPath("featured-games")
    client.expect[FeaturedGames](requestBuilder(listFeaturedGamesUri))
  }

  def getCurrentGameInfo(encryptedSummonerId: String): IO[CurrentGameInfo] = {
    val currentGameInfoUri = spectatorUri.addPath(s"active-games/by-summoner/$encryptedSummonerId")
    client.expect[CurrentGameInfo](requestBuilder(currentGameInfoUri))
  }

}
