// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sun May 13 10:27:31 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:16
package controllers {

  // @LINE:16
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:16
        case (file) if file == "index.html" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "index.html"))); _rrc
          Call("GET", _prefix)
      
        // @LINE:28
        case (file) if file == "indexTwo.html" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"), ("file", "indexTwo.html"))); _rrc
          Call("GET", _prefix + { _defaultPrefix } + "indexTwo.html")
      
      }
    
    }
  
  }


}
