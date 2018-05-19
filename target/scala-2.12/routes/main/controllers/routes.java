// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sat May 19 12:57:10 BST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseExampleController ExampleController = new controllers.ReverseExampleController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseExampleController ExampleController = new controllers.javascript.ReverseExampleController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
