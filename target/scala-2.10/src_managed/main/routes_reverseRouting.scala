// @SOURCE:/home/venkateshv/projects/ReportingManager/conf/routes
// @HASH:ec55a63265153e470509162adb88cb7203d3dc1a
// @DATE:Mon Jun 15 19:36:43 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:8
package controllers.GateKeeper {

// @LINE:8
class ReverseHome {
    

// @LINE:8
def loginAction(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signIn")
}
                                                
    
}
                          
}
                  

// @LINE:13
// @LINE:7
// @LINE:6
package controllers {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def signIn(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "main")
}
                                                
    
}
                          
}
                  


// @LINE:8
package controllers.GateKeeper.javascript {

// @LINE:8
class ReverseHome {
    

// @LINE:8
def loginAction : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GateKeeper.Home.loginAction",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
      }
   """
)
                        
    
}
              
}
        

// @LINE:13
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def signIn : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signIn",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:8
package controllers.GateKeeper.ref {


// @LINE:8
class ReverseHome {
    

// @LINE:8
def loginAction(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GateKeeper.Home.loginAction(), HandlerDef(this, "controllers.GateKeeper.Home", "loginAction", Seq(), "POST", """""", _prefix + """signIn""")
)
                      
    
}
                          
}
        

// @LINE:13
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:13
class ReverseAssets {
    

// @LINE:13
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def signIn(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signIn(), HandlerDef(this, "controllers.Application", "signIn", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """main""")
)
                      
    
}
                          
}
        
    