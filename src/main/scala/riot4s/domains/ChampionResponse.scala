package riot4s.domains

final case class ChampionInfo(
    maxNewPlayerLevel: Int,
    freeChampionIdsForNewPlayers: List[Int],
    freeChampionIds: List[Int]
)
