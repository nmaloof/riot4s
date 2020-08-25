package riot4s.domains

final case class MatchReferenceDto(
    gameId: Long,
    role: String,
    season: Int,
    platformId: String,
    champion: Int,
    queue: Int,
    lane: String,
    timestamp: Long
)

final case class MatchlistDto(
    startIndex: Int,
    totalGames: Int,
    endIndex: Int,
    matches: List[MatchReferenceDto]
)

final case class ParticipantStatsDto(
    item0: Int,
    item2: Int,
    totalUnitsHealed: Int,
    item1: Int,
    largestMultiKill: Int,
    goldEarned: Int,
    firstInhibitorKill: Option[Boolean],
    physicalDamageTaken: Long,
    nodeNeutralizeAssist: Option[Int],
    totalPlayerScore: Int,
    champLevel: Int,
    damageDealtToObjectives: Long,
    totalDamageTaken: Long,
    neutralMinionsKilled: Int,
    deaths: Int,
    tripleKills: Int,
    magicDamageDealtToChampions: Long,
    wardsKilled: Int,
    pentaKills: Int,
    damageSelfMitigated: Long,
    largestCriticalStrike: Int,
    nodeNeutralize: Option[Int],
    totalTimeCrowdControlDealt: Int,
    firstTowerKill: Option[Boolean],
    magicDamageDealt: Long,
    totalScoreRank: Option[Int],
    nodeCapture: Option[Int],
    wardsPlaced: Int,
    totalDamageDealt: Long,
    timeCCingOthers: Long,
    magicalDamageTaken: Long,
    largestKillingSpree: Int,
    totalDamageDealtToChampions: Long,
    physicalDamageDealtToChampions: Long,
    neutralMinionsKilledTeamJungle: Int,
    totalMinionsKilled: Int,
    firstInhibitorAssist: Option[Boolean],
    visionWardsBoughtInGame: Int,
    objectivePlayerScore: Int,
    kills: Int,
    firstTowerAssist: Boolean,
    combatPlayerScore: Int,
    inhibitorKills: Int,
    turretKills: Int,
    participantId: Int,
    trueDamageTaken: Long,
    firstBloodAssist: Boolean,
    nodeCaptureAssist: Option[Int],
    assists: Int,
    teamObjective: Option[Int],
    altarsNeutralized: Option[Int],
    goldSpent: Int,
    damageDealtToTurrets: Long,
    altarsCaptured: Option[Int],
    win: Boolean,
    totalHeal: Long,
    unrealKills: Int,
    visionScore: Long,
    physicalDamageDealt: Long,
    firstBloodKill: Boolean,
    longestTimeSpentLiving: Int,
    killingSprees: Int,
    sightWardsBoughtInGame: Int,
    trueDamageDealtToChampions: Long,
    neutralMinionsKilledEnemyJungle: Int,
    doubleKills: Int,
    trueDamageDealt: Long,
    quadraKills: Int,
    item4: Int,
    item3: Int,
    item6: Int,
    item5: Int,
    playerScore0: Int,
    playerScore1: Int,
    playerScore2: Int,
    playerScore3: Int,
    playerScore4: Int,
    playerScore5: Int,
    playerScore6: Int,
    playerScore7: Int,
    playerScore8: Int,
    playerScore9: Int,
    perk0: Int,
    perk0Var1: Int,
    perk0Var2: Int,
    perk0Var3: Int,
    perk1: Int,
    perk1Var1: Int,
    perk1Var2: Int,
    perk1Var3: Int,
    perk2: Int,
    perk2Var1: Int,
    perk2Var2: Int,
    perk2Var3: Int,
    perk3: Int,
    perk3Var1: Int,
    perk3Var2: Int,
    perk3Var3: Int,
    perk4: Int,
    perk4Var1: Int,
    perk4Var2: Int,
    perk4Var3: Int,
    perk5: Int,
    perk5Var1: Int,
    perk5Var2: Int,
    perk5Var3: Int,
    perkPrimaryStyle: Int,
    perkSubStyle: Int
)

final case class MatchDto(
    gameId: Long,
    participantIdentities: List[ParticipantIdentityDto],
    queueId: Int,
    gameType: String,
    gameDuration: Long,
    teams: List[TeamStatsDto],
    platformId: String,
    gameCreation: Long,
    seasonId: Int,
    gameVersion: String,
    mapId: Int,
    gameMode: String,
    participants: List[ParticipantDto]
)

final case class ParticipantIdentityDto(
    participantId: Int,
    player: PlayerDto
)

final case class PlayerDto(
    profileIcon: Int,
    accountId: String,
    matchHistoryUri: String,
    currentAccountId: String,
    currentPlatformId: String,
    summonerName: String,
    summonerId: Option[String],
    platformId: String
)

final case class TeamStatsDto(
    towerKills: Int,
    riftHeraldKills: Int,
    firstBlood: Boolean,
    inhibitorKills: Int,
    bans: List[TeamBansDto],
    firstBaron: Boolean,
    firstDragon: Boolean,
    dominionVictoryScore: Int,
    dragonKills: Int,
    baronKills: Int,
    firstInhibitor: Boolean,
    firstTower: Boolean,
    vilemawKills: Int,
    firstRiftHerald: Boolean,
    teamId: Int,
    win: String
)

final case class TeamBansDto(
    championId: Int,
    pickTurn: Int
)

final case class ParticipantDto(
    participantId: Int,
    championId: Int,
    runes: Option[List[RuneDto]],
    stats: ParticipantStatsDto,
    teamId: Int,
    timeline: ParticipantTimelineDto,
    spell1Id: Int,
    spell2Id: Int,
    highestAchievedSeasonTier: Option[String],
    masteries: Option[List[MasteryDto]]
)

final case class RuneDto(
    runeId: Int,
    rank: Int
)

final case class ParticipantTimelineDto(
    participantId: Int,
    csDiffPerMinDeltas: Option[Map[String, Double]],
    damageTakenPerMinDeltas: Map[String, Double],
    role: String,
    damageTakenDiffPerMinDeltas: Option[Map[String, Double]],
    xpPerMinDeltas: Map[String, Double],
    xpDiffPerMinDeltas: Option[Map[String, Double]],
    lane: String,
    creepsPerMinDeltas: Map[String, Double],
    goldPerMinDeltas: Map[String, Double]
)

final case class MasteryDto(
    rank: Int,
    masteryId: Int
)

final case class MatchTimelineDto(
    frames: List[MatchFrameDto],
    frameInterval: Long
)
final case class MatchFrameDto(
    participantFrames: Map[String, MatchParticipantFrameDto],
    events: List[MatchEventDto],
    timestamp: Long
)
final case class MatchParticipantFrameDto(
    participantId: Int,
    minionsKilled: Int,
    teamScore: Int,
    dominionScore: Int,
    totalGold: Int,
    level: Int,
    xp: Int,
    currentGold: Int,
    position: MatchPositionDto,
    jungleMinionsKilled: Int
)
final case class MatchPositionDto(
    x: Int,
    y: Int
)
final case class MatchEventDto(
    laneType: String,
    skillSlot: Int,
    ascendedType: String,
    creatorId: Int,
    afterId: Int,
    eventType: String,
    `type`: String,
    levelUpType: String,
    wardType: String,
    participantId: Int,
    towerType: String,
    itemId: Int,
    beforeId: Int,
    pointCaptured: String,
    monsterType: String,
    monsterSubType: String,
    teamId: Int,
    position: MatchPositionDto,
    killerId: Int,
    timestamp: Long,
    assistingParticipantIds: List[Int],
    buildingType: String,
    victimId: Int
)
