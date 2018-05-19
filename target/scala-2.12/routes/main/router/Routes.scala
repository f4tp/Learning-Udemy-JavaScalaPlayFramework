// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sat May 19 12:57:10 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ExampleController_0: controllers.ExampleController,
  // @LINE:44
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ExampleController_0: controllers.ExampleController,
    // @LINE:44
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.ExampleController.uploadAction()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ws""", """controllers.ExampleController.exampleWsAction()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """config""", """controllers.ExampleController.exampleConfigAction()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """2plus2""", """controllers.ExampleController.exampleAddWithDefaultArgsAction(a:Integer = 2, b:Integer = 2)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addingagain""", """controllers.ExampleController.exampleAddWithMissingArgAction(c:Integer, d:Integer ?= 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adding""", """controllers.ExampleController.exampleAddWithMissingArgAction(a:Integer, b:Integer ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.ExampleController.exampleAddAction(a:Integer, b:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""", """controllers.ExampleController.exampleAdditionAction(a:String, b:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """example-result""", """controllers.ExampleController.exampleResultAction()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """example""", """controllers.ExampleController.exampleAction()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """example-body""", """controllers.ExampleController.exampleBodyAction()"""),
    ("""GET""", this.prefix, """controllers.Assets.at(path:String = "/public", file:String = "index.html")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ExampleController_uploadAction0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_ExampleController_uploadAction0_invoker = createInvoker(
    ExampleController_0.uploadAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "uploadAction",
      Nil,
      "POST",
      this.prefix + """upload""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ExampleController_exampleWsAction1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ws")))
  )
  private[this] lazy val controllers_ExampleController_exampleWsAction1_invoker = createInvoker(
    ExampleController_0.exampleWsAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleWsAction",
      Nil,
      "GET",
      this.prefix + """ws""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ExampleController_exampleConfigAction2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("config")))
  )
  private[this] lazy val controllers_ExampleController_exampleConfigAction2_invoker = createInvoker(
    ExampleController_0.exampleConfigAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleConfigAction",
      Nil,
      "GET",
      this.prefix + """config""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ExampleController_exampleAddWithDefaultArgsAction3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("2plus2")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddWithDefaultArgsAction3_invoker = createInvoker(
    ExampleController_0.exampleAddWithDefaultArgsAction(fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleAddWithDefaultArgsAction",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """2plus2""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addingagain")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction4_invoker = createInvoker(
    ExampleController_0.exampleAddWithMissingArgAction(fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleAddWithMissingArgAction",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """addingagain""",
      """e.g. localhost:9000/addingagain?c=9""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adding")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction5_invoker = createInvoker(
    ExampleController_0.exampleAddWithMissingArgAction(fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleAddWithMissingArgAction",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """adding""",
      """b argument if not passed will pass null instead
below takes an integer through the params e.g. localhost:9000/adding?a=5""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ExampleController_exampleAddAction6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddAction6_invoker = createInvoker(
    ExampleController_0.exampleAddAction(fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleAddAction",
      Seq(classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """add""",
      """below takes Integers passed in as params in teh HTTP request, not through the URI""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ExampleController_exampleAdditionAction7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add/"), DynamicPart("a", """[^/]+""",true), StaticPart("/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ExampleController_exampleAdditionAction7_invoker = createInvoker(
    ExampleController_0.exampleAdditionAction(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleAdditionAction",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """add/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""",
      """arguments with variable names a and b passed in via the URI
below takes strings through the URI, i.e. http://localhost:9000/add/3/9""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ExampleController_exampleResultAction8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example-result")))
  )
  private[this] lazy val controllers_ExampleController_exampleResultAction8_invoker = createInvoker(
    ExampleController_0.exampleResultAction(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ExampleController",
      "exampleResultAction",
      Nil,
      "GET",
      this.prefix + """example-result""",
      """testing the Response object""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ExampleController_exampleAction9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example")))
  )
  private[this] lazy val controllers_ExampleController_exampleAction9_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_ExampleController_exampleBodyAction10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example-body")))
  )
  private[this] lazy val controllers_ExampleController_exampleBodyAction10_invoker = createInvoker(
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

  // @LINE:44
  private[this] lazy val controllers_Assets_at11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_Assets_at12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at12_invoker = createInvoker(
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
  
    // @LINE:6
    case controllers_ExampleController_uploadAction0_route(params@_) =>
      call { 
        controllers_ExampleController_uploadAction0_invoker.call(ExampleController_0.uploadAction())
      }
  
    // @LINE:7
    case controllers_ExampleController_exampleWsAction1_route(params@_) =>
      call { 
        controllers_ExampleController_exampleWsAction1_invoker.call(ExampleController_0.exampleWsAction())
      }
  
    // @LINE:9
    case controllers_ExampleController_exampleConfigAction2_route(params@_) =>
      call { 
        controllers_ExampleController_exampleConfigAction2_invoker.call(ExampleController_0.exampleConfigAction())
      }
  
    // @LINE:11
    case controllers_ExampleController_exampleAddWithDefaultArgsAction3_route(params@_) =>
      call(Param[Integer]("a", Right(2)), Param[Integer]("b", Right(2))) { (a, b) =>
        controllers_ExampleController_exampleAddWithDefaultArgsAction3_invoker.call(ExampleController_0.exampleAddWithDefaultArgsAction(a, b))
      }
  
    // @LINE:14
    case controllers_ExampleController_exampleAddWithMissingArgAction4_route(params@_) =>
      call(params.fromQuery[Integer]("c", None), params.fromQuery[Integer]("d", Some(0))) { (c, d) =>
        controllers_ExampleController_exampleAddWithMissingArgAction4_invoker.call(ExampleController_0.exampleAddWithMissingArgAction(c, d))
      }
  
    // @LINE:18
    case controllers_ExampleController_exampleAddWithMissingArgAction5_route(params@_) =>
      call(params.fromQuery[Integer]("a", None), params.fromQuery[Integer]("b", Some(null))) { (a, b) =>
        controllers_ExampleController_exampleAddWithMissingArgAction5_invoker.call(ExampleController_0.exampleAddWithMissingArgAction(a, b))
      }
  
    // @LINE:21
    case controllers_ExampleController_exampleAddAction6_route(params@_) =>
      call(params.fromQuery[Integer]("a", None), params.fromQuery[Integer]("b", None)) { (a, b) =>
        controllers_ExampleController_exampleAddAction6_invoker.call(ExampleController_0.exampleAddAction(a, b))
      }
  
    // @LINE:28
    case controllers_ExampleController_exampleAdditionAction7_route(params@_) =>
      call(params.fromPath[String]("a", None), params.fromPath[String]("b", None)) { (a, b) =>
        controllers_ExampleController_exampleAdditionAction7_invoker.call(ExampleController_0.exampleAdditionAction(a, b))
      }
  
    // @LINE:31
    case controllers_ExampleController_exampleResultAction8_route(params@_) =>
      call { 
        controllers_ExampleController_exampleResultAction8_invoker.call(ExampleController_0.exampleResultAction())
      }
  
    // @LINE:35
    case controllers_ExampleController_exampleAction9_route(params@_) =>
      call { 
        controllers_ExampleController_exampleAction9_invoker.call(ExampleController_0.exampleAction())
      }
  
    // @LINE:37
    case controllers_ExampleController_exampleBodyAction10_route(params@_) =>
      call { 
        controllers_ExampleController_exampleBodyAction10_invoker.call(ExampleController_0.exampleBodyAction())
      }
  
    // @LINE:44
    case controllers_Assets_at11_route(params@_) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at11_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:55
    case controllers_Assets_at12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at12_invoker.call(Assets_1.at(path, file))
      }
  }
}
