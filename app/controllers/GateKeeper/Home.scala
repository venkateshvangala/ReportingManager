package controllers.GateKeeper

import play.api.mvc._
/**
 * @author venkateshv
 */
object Home extends Controller{
    def loginAction = Action {  implicit request =>
      Ok("");
  }
}
