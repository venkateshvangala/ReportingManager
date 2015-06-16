package controllers.GateKeeper

import models.data.helpers.SignIn
import play.api.Logger
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms.nonEmptyText
import play.api.mvc.Action
import play.api.mvc.Controller
import views.html.login
import views.html.main
/**
 * @author venkateshv
 */
object Home extends Controller{
    def loginAction = Action {  implicit request =>
      val loginForm = Form(
          mapping(
            "userName" -> nonEmptyText,
            "password" -> nonEmptyText
          )(SignIn.apply)(SignIn.unapply)
      );
      
      loginForm.bindFromRequest().fold(
        formWithErrors => {
          Logger.info("SignIn form has errors..." + formWithErrors.errors);
          BadRequest(login.render());
        }, 
        signInData => {
          val SignIn(userName, password) = loginForm.bindFromRequest().get;
          Logger.info("" + userName + "----" + password);
          Ok(main.render());
        } 
      );
  }
}
