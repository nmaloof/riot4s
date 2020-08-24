package riot4s.clients

import cats.effect._
import org.http4s.client._

import riot4s.endpoints.league._

class LeagueClient(client: Client[IO], devKey: String) {
  val summoner = new SummonerApi(client, devKey)
  val match_   = new MatchApi(client, devKey)
}
