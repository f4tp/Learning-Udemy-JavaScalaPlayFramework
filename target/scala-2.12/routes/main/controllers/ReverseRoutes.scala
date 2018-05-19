// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sat May 19 12:57:10 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseExampleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def exampleAddWithDefaultArgsAction(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("a", 2), ("b", 2))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "2plus2")
    }
  
    // @LINE:31
    def exampleResultAction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "example-result")
    }
  
    // @LINE:35
    def exampleAction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "example")
    }
  
    // @LINE:7
    def exampleWsAction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ws")
    }
  
    // @LINE:21
    def exampleAddAction(a:Integer, b:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("a", a)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("b", b)))))
    }
  
    // @LINE:6
    def uploadAction(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "upload")
    }
  
    // @LINE:28
    def exampleAdditionAction(a:String, b:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("b", b)))
    }
  
    // @LINE:9
    def exampleConfigAction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "config")
    }
  
    // @LINE:14
    def exampleAddWithMissingArgAction(c:Integer, d:Integer): Call = {
    
      (c: @unchecked, d: @unchecked) match {
      
        // @LINE:14
        case (c, d)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addingagain" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("c", c)), if(d == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("d", d)))))
      
      }
    
    }
  
    // @LINE:37
    def exampleBodyAction(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "example-body")
    }
  
  }

  // @LINE:44
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:44
        case (file) if file == "index.html" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "index.html"))); _rrc
          Call("GET", _prefix)
      
        // @LINE:55
        case (file)  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }


}
