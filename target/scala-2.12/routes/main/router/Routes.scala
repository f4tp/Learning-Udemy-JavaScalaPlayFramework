// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sun May 13 18:23:27 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ExampleController_0: controllers.ExampleController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ExampleController_0: controllers.ExampleController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, ExampleController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ExampleController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """example""", """controllers.ExampleController.exampleAction()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """example-body""", """controllers.ExampleController.exampleBodyAction()"""),
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_ExampleController_exampleAction0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example")))
  )
  private[this] lazy val controllers_ExampleController_exampleAction0_invoker = createInvoker(
    ExampleController_0.exampleAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleAction",
      Nil,
      "GET",
      this.prefix + """example""",
      """A GET request with the URI /example will call what ever is in the exampleAction() in the given Controller""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ExampleController_exampleBodyAction1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example-body")))
  )
  private[this] lazy val controllers_ExampleController_exampleBodyAction1_invoker = createInvoker(
    ExampleController_0.exampleBodyAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleBodyAction",
      Nil,
      "POST",
      this.prefix + """example-body""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """""",
      """when a GET request is received...
...on the root context
call the method controllers.Assets.at the given address""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """file<.+>""",
      """wildcard pattern (* below) = can be used to capture parts of the URI path
if a GET request come in...
and its path matches a forward slash followed by any amount of text
store that extra text in a variable called file, and...
call the at method in the specified controller, with...
the public path, and the 'file' variable
doing the above allows you to view files in the public folder directly with a standard HTTP GET request
this thing below will fault any other direct route set, so needs to be added at the bottom to be teh last
toute checked""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_ExampleController_exampleAction0_route(params@_) =>
      call { 
        controllers_ExampleController_exampleAction0_invoker.call(ExampleController_0.exampleAction())
      }
  
    // @LINE:9
    case controllers_ExampleController_exampleBodyAction1_route(params@_) =>
      call { 
        controllers_ExampleController_exampleBodyAction1_invoker.call(ExampleController_0.exampleBodyAction())
      }
  
    // @LINE:16
    case controllers_Assets_at2_route(params@_) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:27
    case controllers_Assets_at3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_1.at(path, file))
      }
  }
}
