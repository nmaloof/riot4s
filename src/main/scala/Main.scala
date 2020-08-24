import cats.effect._
import org.http4s.client._

import riot4s.RiotClient
import java.util.concurrent.Executors

object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = {

    args match {
      case head :: next :: _ => {
        val sumName      = head
        val devKey       = next
        val blockingPool = Executors.newFixedThreadPool(5)
        val blocker      = Blocker.liftExecutorService(blockingPool)

        val httpClient = JavaNetClientBuilder[IO](blocker).resource

        httpClient.use { client =>
          val riotClient = RiotClient(client, devKey)

          for {
            _ <- IO(println("Starting..."))
            // a <- client.expect[String]("https://www.google.com")
            a <- riotClient.league.summoner.byName(sumName)
            _ <- IO(println(a))
          } yield ExitCode.Success
        }

      }
      case Nil => IO(println("Need inputs")).as(ExitCode.Error)
      case _   => IO(println("Not enough inputs specified")).as(ExitCode.Error)
    }

  }

}
