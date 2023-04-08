/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;

     
import java.util.*;
/**
 *interface Editor which hava collection of abstract method using it by abstract class Person  
 * it provide methods working on the arraylist to manipulate on the data
 * @author Esra hussain saif
 */

public interface Editor {
    
   
   /**
    * abstract instance method add it  receive the id to add members  according to thier id
   * @param objName type Long object it is the id of the person
  
   *
   */ 
    void add( Long objName);
    
    
    
     /**
     * it method receive the id of person(mean member object or trainer object ) to remove it from the list of members or trainers 
     * @param obj of type Long object it is the id of the person
     */
    void  delete(Long obj);
    
     /**
     * instance method getList it return the list of person that we have in our gym
     * @return ArrayList of type Long
     */
    ArrayList<Long> getList();
    
     
    /**
     * instance method receive object of type Long whitch represent the id of person to search about its position in the list
     * @param obj it is object of type Long 
     * @return the position of the specific id in the list
     */
    int search(Long obj);//search about specific object and return its position
    
    
}