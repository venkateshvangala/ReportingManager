package models.data

import javax.persistence._
import play.db.ebean._
import play.data.validation.Constraints._
import scala.collection.JavaConverters._
import java.sql.Timestamp
import play.db.ebean.Model._
import com.avaje.ebean.Ebean


/**
 * @author venkateshv
 */

@Entity
@Table(name = "rm_user")
class User{
  
  @Id
  @Column(name = "user_id")
  var userId: Long = 0;
  
  @Column(name="display_name")
  var displayName: String = null;
  
  @Column
  var email: String = null;
  
  @Column
  var password: String = null;
  
  @Column
  var mobile: String = null;
  
  @Column
  var firstName: String = null;
  
  @Column
  var lastName: String = null;
  
  @Column
  var gender: String = null;
  
  @Column
  var age: Int = 0;
  
  @Column
  var role: String = null;
  
  @Column
  var lastUpdated: Timestamp = null;
  
  @Column
  var updatedBy: String = null;
  
  @Column
  var createdBy: String = null;
  
  @Column
  var dateCreated: Timestamp = null;
  
}
