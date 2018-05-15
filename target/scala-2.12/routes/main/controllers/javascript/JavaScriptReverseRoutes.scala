// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Tue May 15 15:38:45 BST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseExampleController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def exampleAddWithDefaultArgsAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAddWithDefaultArgsAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "2plus2"})
        }
      """
    )
  
    // @LINE:27
    def exampleResultAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleResultAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "example-result"})
        }
      """
    )
  
    // @LINE:31
    def exampleAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAction",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "example"})
        }
      """
    )
  
    // @LINE:17
    def exampleAddAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAddAction",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("a", a0), (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("b", b1)])})
        }
      """
    )
  
    // @LINE:24
    def exampleAdditionAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleAdditionAction",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("a", a0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
    // @LINE:10
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
  
    // @LINE:33
    def exampleBodyAction: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ExampleController.exampleBodyAction",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "example-body"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
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
