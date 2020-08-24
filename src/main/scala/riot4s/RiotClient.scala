package riot4s

import cats.effect._
import org.http4s.client._

import riot4s.clients._
class RiotClient(client: Client[IO], devKey: String) {
  val league = new LeagueClient(client, devKey)
}

object RiotClient {
  def apply(client: Client[IO], devKey: String) = new RiotClient(client, devKey)
}
