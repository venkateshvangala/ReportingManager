package controllers

import models.Services.UserService
import play.api.Logger
import play.api.mvc.Action
import play.api.mvc.Controller
import views.html.login
import views.html.main

object Application extends Controller {

  def signIn = Action {
    Ok(login.render());
  }
  
  def index = Action {
    Logger.info("Application is loaded...." + UserService.all().length);
    Logger.info("find user by email...." + UserService.findByEmail("venkatesh.vangala@imaginea.com").displayName); 
    Ok(main.render());
  }
}
