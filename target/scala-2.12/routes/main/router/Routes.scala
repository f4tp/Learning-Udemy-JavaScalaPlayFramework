// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Tue May 15 15:38:45 BST 2018

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
  // @LINE:40
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ExampleController_0: controllers.ExampleController,
    // @LINE:40
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


  // @LINE:7
  private[this] lazy val controllers_ExampleController_exampleAddWithDefaultArgsAction0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("2plus2")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddWithDefaultArgsAction0_invoker = createInvoker(
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

  // @LINE:10
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addingagain")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction1_invoker = createInvoker(
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

  // @LINE:14
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adding")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddWithMissingArgAction2_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_ExampleController_exampleAddAction3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_ExampleController_exampleAddAction3_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_ExampleController_exampleAdditionAction4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add/"), DynamicPart("a", """[^/]+""",true), StaticPart("/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ExampleController_exampleAdditionAction4_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_ExampleController_exampleResultAction5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example-result")))
  )
  private[this] lazy val controllers_ExampleController_exampleResultAction5_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_ExampleController_exampleAction6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example")))
  )
  private[this] lazy val controllers_ExampleController_exampleAction6_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_ExampleController_exampleBodyAction7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("example-body")))
  )
  private[this] lazy val controllers_ExampleController_exampleBodyAction7_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_Assets_at8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
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
    case controllers_ExampleController_exampleAddWithDefaultArgsAction0_route(params@_) =>
      call(Param[Integer]("a", Right(2)), Param[Integer]("b", Right(2))) { (a, b) =>
        controllers_ExampleController_exampleAddWithDefaultArgsAction0_invoker.call(ExampleController_0.exampleAddWithDefaultArgsAction(a, b))
      }
  
    // @LINE:10
    case controllers_ExampleController_exampleAddWithMissingArgAction1_route(params@_) =>
      call(params.fromQuery[Integer]("c", None), params.fromQuery[Integer]("d", Some(0))) { (c, d) =>
        controllers_ExampleController_exampleAddWithMissingArgAction1_invoker.call(ExampleController_0.exampleAddWithMissingArgAction(c, d))
      }
  
    // @LINE:14
    case controllers_ExampleController_exampleAddWithMissingArgAction2_route(params@_) =>
      call(params.fromQuery[Integer]("a", None), params.fromQuery[Integer]("b", Some(null))) { (a, b) =>
        controllers_ExampleController_exampleAddWithMissingArgAction2_invoker.call(ExampleController_0.exampleAddWithMissingArgAction(a, b))
      }
  
    // @LINE:17
    case controllers_ExampleController_exampleAddAction3_route(params@_) =>
      call(params.fromQuery[Integer]("a", None), params.fromQuery[Integer]("b", None)) { (a, b) =>
        controllers_ExampleController_exampleAddAction3_invoker.call(ExampleController_0.exampleAddAction(a, b))
      }
  
    // @LINE:24
    case controllers_ExampleController_exampleAdditionAction4_route(params@_) =>
      call(params.fromPath[String]("a", None), params.fromPath[String]("b", None)) { (a, b) =>
        controllers_ExampleController_exampleAdditionAction4_invoker.call(ExampleController_0.exampleAdditionAction(a, b))
      }
  
    // @LINE:27
    case controllers_ExampleController_exampleResultAction5_route(params@_) =>
      call { 
        controllers_ExampleController_exampleResultAction5_invoker.call(ExampleController_0.exampleResultAction())
      }
  
    // @LINE:31
    case controllers_ExampleController_exampleAction6_route(params@_) =>
      call { 
        controllers_ExampleController_exampleAction6_invoker.call(ExampleController_0.exampleAction())
      }
  
    // @LINE:33
    case controllers_ExampleController_exampleBodyAction7_route(params@_) =>
      call { 
        controllers_ExampleController_exampleBodyAction7_invoker.call(ExampleController_0.exampleBodyAction())
      }
  
    // @LINE:40
    case controllers_Assets_at8_route(params@_) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("index.html"))) { (path, file) =>
        controllers_Assets_at8_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:51
    case controllers_Assets_at9_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_1.at(path, file))
      }
  }
}
