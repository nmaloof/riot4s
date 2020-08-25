package riot4s.domains

object Champions {

  private[riot4s] case class Champion(name: String) extends AnyVal
  val champs: Map[Int, Champion] = Map(
    266 -> Champion("Aatrox"),
    103 -> Champion("Ahri"),
    84  -> Champion("Akali"),
    12  -> Champion("Alistar"),
    32  -> Champion("Amumu"),
    34  -> Champion("Anivia"),
    1   -> Champion("Annie"),
    523 -> Champion("Aphelios"),
    22  -> Champion("Ashe"),
    136 -> Champion("AurelionSol"),
    268 -> Champion("Azir"),
    432 -> Champion("Bard"),
    53  -> Champion("Blitzcrank"),
    63  -> Champion("Brand"),
    201 -> Champion("Braum"),
    51  -> Champion("Caitlyn"),
    164 -> Champion("Camille"),
    69  -> Champion("Cassiopeia"),
    31  -> Champion("Chogath"),
    42  -> Champion("Corki"),
    122 -> Champion("Darius"),
    131 -> Champion("Diana"),
    36  -> Champion("DrMundo"),
    119 -> Champion("Draven"),
    245 -> Champion("Ekko"),
    60  -> Champion("Elise"),
    28  -> Champion("Evelynn"),
    81  -> Champion("Ezreal"),
    9   -> Champion("FiddleSticks"),
    114 -> Champion("Fiora"),
    105 -> Champion("Fizz"),
    3   -> Champion("Galio"),
    41  -> Champion("Gangplank"),
    86  -> Champion("Garen"),
    150 -> Champion("Gnar"),
    79  -> Champion("Gragas"),
    104 -> Champion("Graves"),
    120 -> Champion("Hecarim"),
    74  -> Champion("Heimerdinger"),
    420 -> Champion("Illaoi"),
    39  -> Champion("Irelia"),
    427 -> Champion("Ivern"),
    40  -> Champion("Janna"),
    59  -> Champion("JarvanIV"),
    24  -> Champion("Jax"),
    126 -> Champion("Jayce"),
    202 -> Champion("Jhin"),
    222 -> Champion("Jinx"),
    145 -> Champion("Kaisa"),
    429 -> Champion("Kalista"),
    43  -> Champion("Karma"),
    30  -> Champion("Karthus"),
    38  -> Champion("Kassadin"),
    55  -> Champion("Katarina"),
    10  -> Champion("Kayle"),
    141 -> Champion("Kayn"),
    85  -> Champion("Kennen"),
    121 -> Champion("Khazix"),
    203 -> Champion("Kindred"),
    240 -> Champion("Kled"),
    96  -> Champion("KogMaw"),
    7   -> Champion("Leblanc"),
    64  -> Champion("LeeSin"),
    89  -> Champion("Leona"),
    876 -> Champion("Lillia"),
    127 -> Champion("Lissandra"),
    236 -> Champion("Lucian"),
    117 -> Champion("Lulu"),
    99  -> Champion("Lux"),
    54  -> Champion("Malphite"),
    90  -> Champion("Malzahar"),
    57  -> Champion("Maokai"),
    11  -> Champion("MasterYi"),
    21  -> Champion("MissFortune"),
    82  -> Champion("Mordekaiser"),
    25  -> Champion("Morgana"),
    267 -> Champion("Nami"),
    75  -> Champion("Nasus"),
    111 -> Champion("Nautilus"),
    518 -> Champion("Neeko"),
    76  -> Champion("Nidalee"),
    56  -> Champion("Nocturne"),
    20  -> Champion("Nunu"),
    2   -> Champion("Olaf"),
    61  -> Champion("Orianna"),
    516 -> Champion("Ornn"),
    80  -> Champion("Pantheon"),
    78  -> Champion("Poppy"),
    555 -> Champion("Pyke"),
    246 -> Champion("Qiyana"),
    133 -> Champion("Quinn"),
    497 -> Champion("Rakan"),
    33  -> Champion("Rammus"),
    421 -> Champion("RekSai"),
    58  -> Champion("Renekton"),
    107 -> Champion("Rengar"),
    92  -> Champion("Riven"),
    68  -> Champion("Rumble"),
    13  -> Champion("Ryze"),
    113 -> Champion("Sejuani"),
    235 -> Champion("Senna"),
    875 -> Champion("Sett"),
    35  -> Champion("Shaco"),
    98  -> Champion("Shen"),
    102 -> Champion("Shyvana"),
    27  -> Champion("Singed"),
    14  -> Champion("Sion"),
    15  -> Champion("Sivir"),
    72  -> Champion("Skarner"),
    37  -> Champion("Sona"),
    16  -> Champion("Soraka"),
    50  -> Champion("Swain"),
    517 -> Champion("Sylas"),
    134 -> Champion("Syndra"),
    223 -> Champion("TahmKench"),
    163 -> Champion("Taliyah"),
    91  -> Champion("Talon"),
    44  -> Champion("Taric"),
    17  -> Champion("Teemo"),
    412 -> Champion("Thresh"),
    18  -> Champion("Tristana"),
    48  -> Champion("Trundle"),
    23  -> Champion("Tryndamere"),
    4   -> Champion("TwistedFate"),
    29  -> Champion("Twitch"),
    77  -> Champion("Udyr"),
    6   -> Champion("Urgot"),
    110 -> Champion("Varus"),
    67  -> Champion("Vayne"),
    45  -> Champion("Veigar"),
    161 -> Champion("Velkoz"),
    254 -> Champion("Vi"),
    112 -> Champion("Viktor"),
    8   -> Champion("Vladimir"),
    106 -> Champion("Volibear"),
    19  -> Champion("Warwick"),
    62  -> Champion("MonkeyKing"),
    498 -> Champion("Xayah"),
    101 -> Champion("Xerath"),
    5   -> Champion("XinZhao"),
    157 -> Champion("Yasuo"),
    777 -> Champion("Yone"),
    83  -> Champion("Yorick"),
    350 -> Champion("Yuumi"),
    154 -> Champion("Zac"),
    238 -> Champion("Zed"),
    115 -> Champion("Ziggs"),
    26  -> Champion("Zilean"),
    142 -> Champion("Zoe"),
    143 -> Champion("Zyra")
  )

  def apply(champName: String): Int = {
    champs
      .find { pair: (Int, Champion) =>
        pair._2.name == champName
      }
      .map(x => x._1)
      .getOrElse(-1)
  }
}
