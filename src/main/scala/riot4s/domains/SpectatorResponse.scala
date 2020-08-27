package riot4s.domains

final case class FeaturedGames(
    gameList: List[FeaturedGameInfo],
    clientRefreshInterval: Long
)

final case class FeaturedGameInfo(
    gameMode: String,
    gameLength: Long,
    mapId: Long,
    gameType: String,
    bannedChampions: List[BannedChampion],
    gameId: Long,
    observers: Observer,
    gameQueueConfigId: Long,
    gameStartTime: Long,
    participants: List[Participant],
    platformId: String
)

final case class BannedChampion(
    pickTurn: Int,
    championId: Long,
    teamId: Long
)

final case class Observer(encryptionKey: String) extends AnyVal

final case class Participant(
    bot: Boolean,
    spell2Id: Long,
    profileIconId: Long,
    summonerName: String,
    championId: Long,
    teamId: Long,
    spell1Id: Long
)

final case class CurrentGameInfo(
    gameId: Long,
    gameType: String,
    gameStartTime: Long,
    mapId: Long,
    gameLength: Long,
    platformId: String,
    gameMode: String,
    bannedChampions: List[BannedChampion],
    gameQueueConfigId: Long,
    observers: Observer,
    participants: List[CurrentGameParticipant]
)

final case class CurrentGameParticipant(
    championId: Long,
    perks: Perks,
    profileIconId: Long,
    bot: Boolean,
    teamId: Long,
    summonerName: String,
    summonerId: String,
    spell1Id: Long,
    spell2Id: Long,
    gameCustomizationObjects: List[GameCustomizationObject]
)

final case class Perks(
    perkIds: List[Long],
    perkStyle: Long,
    perkSubStyle: Long
)

final case class GameCustomizationObject(
    category: String,
    content: String
)
