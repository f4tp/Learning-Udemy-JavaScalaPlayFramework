// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/play-essentials/conf/routes
// @DATE:Sat May 19 12:57:10 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
