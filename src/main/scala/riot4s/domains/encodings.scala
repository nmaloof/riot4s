package riot4s.domains

import io.circe._
import io.circe.generic.semiauto._

object encodings {

  // -- Summoner Api
  implicit val summonerDecoder: Decoder[SummonerResponse] = deriveDecoder[SummonerResponse]
  implicit val summonerEncoder: Encoder[SummonerResponse] = deriveEncoder[SummonerResponse]

  // -- Match Api
  implicit val matchDecoder: Decoder[Match] = deriveDecoder[Match]
  implicit val matchEncoder: Encoder[Match] = deriveEncoder[Match]

  implicit val matchResponseDecoder: Decoder[MatchResponse] = deriveDecoder[MatchResponse]
  implicit val matchResponseEncoder: Encoder[MatchResponse] = deriveEncoder[MatchResponse]
}
