package riot4s.endpoints.league

import cats.effect._
import org.http4s._
import org.http4s.client._
// import org.http4s.dsl.io._
import org.http4s.circe._

import riot4s.domains._
import riot4s.domains.encodings._

class SummonerApi(client: Client[IO], devKey: String) extends LeagueEndpoint {

  implicit val deriveEntityDecoder: EntityDecoder[IO, SummonerDTO] =
    CirceEntityDecoder.circeEntityDecoder[IO, SummonerDTO]

  protected val version: String      = "v4"
  protected val sumExtension: String = s"summoner/$version/summoners"

  private def requestBuilder(url: Uri): Request[IO] = {
    Request[IO](
      Method.GET,
      url,
      headers = riotHeaders(devKey)
    )
  }

  def summonerUri: Uri = leagueEndpoint.addPath(sumExtension)

  def byName(name: String): IO[SummonerDTO] = {
    val byNameUri = summonerUri.addPath(s"by-name/$name")
    client.expect[SummonerDTO](requestBuilder(byNameUri))
  }

  def byAccount(account: String): IO[SummonerDTO] = {
    val byAccountUri = summonerUri.addPath(s"by-account/$account")
    client.expect[SummonerDTO](requestBuilder(byAccountUri))
  }

  def byPuuid(puuid: String): IO[SummonerDTO] = {
    val byPuuidUri = summonerUri.addPath(s"by-puuid/$puuid")
    client.expect[SummonerDTO](requestBuilder(byPuuidUri))
  }

  def byId(id: String): IO[SummonerDTO] = {
    val byIdUri = summonerUri.addPath(s"$id")
    client.expect[SummonerDTO](requestBuilder(byIdUri))
  }

}
