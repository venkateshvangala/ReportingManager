package controllers

import play.api._
import play.api.mvc._
import models.data.User
import models.Services.UserService
import views.html.main

object Application extends Controller {

  def index = Action {
    Logger.info("Application is loaded...." + UserService.all().length);
    Logger.info("find user by email...." + UserService.findByEmail("venkatesh.vangala@imaginea.com").displayName); 
    Ok(main.render());
  }
}
