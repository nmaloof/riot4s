import cats.effect._
import cats.implicits._
import org.http4s.client.blaze._
// import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext.global

import riot4s.RiotClient
import riot4s.domains.Champions

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {

    args match {
      case head :: next :: _ => {
        val sumName = head
        val devKey  = next
        // val blockingPool = Executors.newFixedThreadPool(5)
        // val blocker      = Blocker.liftExecutorService(blockingPool)

        BlazeClientBuilder[IO](global).resource.use { client =>
          // val httpClient = JavaNetClientBuilder[IO](blocker).resource
          // httpClient.use
          val riotClient = RiotClient(client, devKey)

          for {
            _ <- IO(println("Starting..."))
            // a <- client.expect[String]("https://www.google.com")
            a <- riotClient.league.summoner.byName(sumName)
            // _ <- IO(println(a))
            b <- riotClient.league.match_.byAccount(a.accountId)
            games <- b.matches.filter(x => x.champion == Champions("Pantheon")).take(15).traverse { x =>
              riotClient.league.match_.byMatchId(x.gameId)
            }
            _ <- IO(println(games.head))
            // _ <- IO(println(b.matches.head.gameId))
            // c <- riotClient.league.match_.byMatchId(b.matches(0).gameId)
            _ <- IO(println("...Finishing"))
          } yield ExitCode.Success
        }

      }
      case Nil => IO(println("Need inputs")).as(ExitCode.Error)
      case _   => IO(println("Not enough inputs specified")).as(ExitCode.Error)
    }

  }

}
