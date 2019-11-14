package com.techsophy.akka.app

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.techsophy.akka.ApiObj

import scala.concurrent.ExecutionContext

object ApiLaunch extends App {
  //StudentQueryObj.create
  implicit val system: ActorSystem = ActorSystem()
  implicit val executor: ExecutionContext = system.dispatcher
  implicit val materializer: ActorMaterializer = ActorMaterializer()
  val port: Int = 8080
  val bindingFuture = Http().bindAndHandle(ApiObj.routes, "localhost", port)

}
