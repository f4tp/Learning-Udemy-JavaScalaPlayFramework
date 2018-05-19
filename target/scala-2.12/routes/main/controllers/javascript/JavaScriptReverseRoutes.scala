// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sat May 19 12:57:10 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseExampleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def exampleAddWithDefaultArgsAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAddWithDefaultArgsAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "2plus2"})
        }
      """
    )
  
    // @LINE:31
    def exampleResultAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleResultAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "example-result"})
        }
      """
    )
  
    // @LINE:35
    def exampleAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "example"})
        }
      """
    )
  
    // @LINE:7
    def exampleWsAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleWsAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ws"})
        }
      """
    )
  
    // @LINE:21
    def exampleAddAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAddAction",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("a", a0), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("b", b1)])})
        }
      """
    )
  
    // @LINE:6
    def uploadAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.uploadAction",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:28
    def exampleAdditionAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAdditionAction",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("a", a0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
    // @LINE:9
    def exampleConfigAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleConfigAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "config"})
        }
      """
    )
  
    // @LINE:14
    def exampleAddWithMissingArgAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAddWithMissingArgAction",
      """
        function(c0,d1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addingagain" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("c", c0), (d1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("d", d1))])})
          }
        
        }
      """
    )
  
    // @LINE:37
    def exampleBodyAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleBodyAction",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "example-body"})
        }
      """
    )
  
  }

  // @LINE:44
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
        
          if (file1 == """ + implicitly[play.api.mvc.JavascriptLiteral[String]].to("index.html") + """) {
            return _wA({method:"GET", url:"""" + _prefix + """"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }


}
