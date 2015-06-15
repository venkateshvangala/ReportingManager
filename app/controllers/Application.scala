package controllers

import play.api._
import play.api.mvc._
import models.data.User
import models.Services.UserService
import views.html.main

object Application extends Controller {

  def index = Action {
    Logger.info("user email id....." + UserService.findByEmail("venkatesh.vangala@imaginea.com").mobile);
    Ok(main.render())
  }

}