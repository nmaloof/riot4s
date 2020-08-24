package riot4s.domains

final case class SummonerResponse(
    accountId: String,
    profileIconId: Int,
    revisionDate: Long,
    name: String,
    id: String,
    puuid: String,
    summonerLevel: Long
)
