package models.Services

import com.avaje.ebean.Ebean
import models.data.User
import scala.collection.JavaConverters._
import models.Services._

/**
 * @author venkateshv
 */
object UserService extends GenericService(classOf[User]){

  def update(user: User): Unit =  {
       Ebean.update(user)
  }
  
  def findByEmail(email: String) : User = {
      finder.where().eq("email", email).findUnique();
  }
}
