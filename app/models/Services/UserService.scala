package models.Services

import com.avaje.ebean.Ebean
import models.data.User
import scala.collection.JavaConverters._
import models.Services._

/**
 * @author venkateshv
 */
object UserService extends GenericService(classOf[User]){

  /*Finder Class for writing join and where condition purpose*/
  val finder = Ebean.find(classOf[User]);
  
  def all(): List[User] = {
      Ebean.find(classOf[User]).findList().asScala.toList; 
  }
  
  def findById(id:Any):User = {  
      Ebean.find(classOf[User], id)  
  }  

  def delete(user: User): Unit = {
       Ebean.delete(user);
  }
  
  def save(user: User): Unit = user.userId match {
       case 0 => Ebean.save(user)
       case _ => Ebean.update(user)
  }
  
  def findByEmail(email: String) : User = {
      finder.where().eq("email", email).findUnique();
  }

}