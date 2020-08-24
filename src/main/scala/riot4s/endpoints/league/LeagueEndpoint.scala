package riot4s.endpoints.league

import org.http4s.Uri

import riot4s.endpoints.BaseRiotEndpoint

trait LeagueEndpoint extends BaseRiotEndpoint {
  final val leagueEndpoint: Uri = baseEndpoint / "lol"
}
