package riot4s.domains

import io.circe._
import io.circe.generic.semiauto._

object encodings {

  // -- Summoner Api
  implicit val summonerDTODecoder: Decoder[SummonerDTO] = deriveDecoder[SummonerDTO]

  // -- Match Api
  implicit val matchReferenceDtoDecoder: Decoder[MatchReferenceDto]           = deriveDecoder[MatchReferenceDto]
  implicit val matchlistDtoDecoder: Decoder[MatchlistDto]                     = deriveDecoder[MatchlistDto]
  implicit val playerDtoDecoder: Decoder[PlayerDto]                           = deriveDecoder[PlayerDto]
  implicit val participantIdentityDtoDecoder: Decoder[ParticipantIdentityDto] = deriveDecoder[ParticipantIdentityDto]
  implicit val teamBansDtoDecoder: Decoder[TeamBansDto]                       = deriveDecoder[TeamBansDto]
  implicit val runeDtoDecoder: Decoder[RuneDto]                               = deriveDecoder[RuneDto]
  implicit val masteryDtoDecoder: Decoder[MasteryDto]                         = deriveDecoder[MasteryDto]
  implicit val participantTimelineDtoDecoder: Decoder[ParticipantTimelineDto] = deriveDecoder[ParticipantTimelineDto]
  implicit val participantStatsDtoDecoder: Decoder[ParticipantStatsDto]       = deriveDecoder[ParticipantStatsDto]
  implicit val teamStatsDtoDecoder: Decoder[TeamStatsDto]                     = deriveDecoder[TeamStatsDto]
  implicit val participantDtoDecoder: Decoder[ParticipantDto]                 = deriveDecoder[ParticipantDto]
  implicit val matchDtoDecoder: Decoder[MatchDto]                             = deriveDecoder[MatchDto]
  implicit val matchPositionDtoDecoder: Decoder[MatchPositionDto]             = deriveDecoder[MatchPositionDto]
  implicit val matchEventDtoDecoder: Decoder[MatchEventDto]                   = deriveDecoder[MatchEventDto]
  implicit val matchParticipantFrameDtoDecoder: Decoder[MatchParticipantFrameDto] =
    deriveDecoder[MatchParticipantFrameDto]
  implicit val matchFrameDtoDecoder: Decoder[MatchFrameDto]       = deriveDecoder[MatchFrameDto]
  implicit val matchTimelineDtoDecoder: Decoder[MatchTimelineDto] = deriveDecoder[MatchTimelineDto]

  // -- Champion Api
  implicit val championInfoDecoder: Decoder[ChampionInfo] = deriveDecoder[ChampionInfo]

  // -- Spectator Api
  implicit val participantDecoder: Decoder[Participant]           = deriveDecoder[Participant]
  implicit val observerDecoder: Decoder[Observer]                 = deriveDecoder[Observer]
  implicit val bannedChampionDecoder: Decoder[BannedChampion]     = deriveDecoder[BannedChampion]
  implicit val featuredGameInfoDecoder: Decoder[FeaturedGameInfo] = deriveDecoder[FeaturedGameInfo]
  implicit val featuredGamesDecoder: Decoder[FeaturedGames]       = deriveDecoder[FeaturedGames]

  implicit val perksDecoder: Decoder[Perks]                                     = deriveDecoder[Perks]
  implicit val gameCustomizationObjectDecoder: Decoder[GameCustomizationObject] = deriveDecoder[GameCustomizationObject]
  implicit val currentGameParticipantDecoder: Decoder[CurrentGameParticipant]   = deriveDecoder[CurrentGameParticipant]
  implicit val currentGameInfoDecoder: Decoder[CurrentGameInfo]                 = deriveDecoder[CurrentGameInfo]
}
