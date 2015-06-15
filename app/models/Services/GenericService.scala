package models.Services

import scala.collection.JavaConverters._

import com.avaje.ebean.Ebean

/**
 * @author venkateshv
 */
class GenericService[T](beanClass: Class[T]) {
   val finder = Ebean.find(beanClass);
   
   def all(): List[T] = {
     finder.findList().asScala.toList;
   }
   
   def findById(id: Any): T = {
     Ebean.find(beanClass, id);
   }
   
   def save(): Unit = {
     Ebean.save(beanClass);
   }
   
   def delete(): Unit = {
     Ebean.delete(beanClass);
   }
   
}