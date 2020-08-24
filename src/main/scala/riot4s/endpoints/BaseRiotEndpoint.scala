package riot4s.endpoints

import org.http4s.{ Header, Headers, Uri }
import org.http4s.implicits._

trait BaseRiotEndpoint {
  final val baseEndpoint: Uri = uri"https://na1.api.riotgames.com"

  def riotHeaders(devKey: String): Headers =
    Headers(
      Header("X-Riot-Token", devKey),
      Header("Accept-Language", "en-US,en;q=0.5"),
      Header("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8")
    )

}
