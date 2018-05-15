// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Tue May 15 15:38:45 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseExampleController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def exampleAddWithDefaultArgsAction(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("a", 2), ("b", 2))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "2plus2")
    }
  
    // @LINE:27
    def exampleResultAction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "example-result")
    }
  
    // @LINE:31
    def exampleAction(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "example")
    }
  
    // @LINE:17
    def exampleAddAction(a:Integer, b:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("a", a)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("b", b)))))
    }
  
    // @LINE:24
    def exampleAdditionAction(a:String, b:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("b", b)))
    }
  
    // @LINE:10
    def exampleAddWithMissingArgAction(c:Integer, d:Integer): Call = {
    
      (c: @unchecked, d: @unchecked) match {
      
        // @LINE:10
        case (c, d)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "addingagain" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("c", c)), if(d == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("d", d)))))
      
      }
    
    }
  
    // @LINE:33
    def exampleBodyAction(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "example-body")
    }
  
  }

  // @LINE:40
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:40
        case (file) if file == "index.html" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "index.html"))); _rrc
          Call("GET", _prefix)
      
        // @LINE:51
        case (file)  =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }


}
