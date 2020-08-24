package riot4s.domains

final case class Match(
    gameId: Long,
    role: String,
    season: Int,
    platformId: String,
    champion: Int,
    queue: Int,
    lane: String,
    timestamp: Long
)

final case class MatchResponse(
    startIndex: Int,
    totalGames: Int,
    endIndex: Int,
    matches: List[Match]
)
