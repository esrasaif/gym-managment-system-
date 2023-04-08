/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;

import java.util.ArrayList;
import java.util.Objects;

/**
 *concrete class Trainer extends abstract Person
 * To create an Object of Trainer class type
 * it Save Trainer information 
 * @author rafaa Alowaybidi
 */
public class Trainer extends Person {
    //attributes
    
    /**
     * counter private static attribute its value will differant from one object to another
     */
   private static long counter=100;
   
   /**
    * Trainer is default constrctor
    */
    public Trainer(){    
    }
    
     /**
     * Trainer is a constructor of class Trainer
     * initializing class fields the name of the Trainer
     * @param name as a Trainer name
     */
    public Trainer (String name){
        super(name,counter++);
        
    }
    
    /**
      * equals override method from abstract class person will test  the id between two objects 
      * @param o it is  object of type Object class ,  it will casting recive object to trainer object 
      * @return true or false according to the comparing between the attributes
      */
     @Override
     public boolean equals (Object o){
         Trainer T= (Trainer)o;
        if(Objects.equals(this.id, T.id)){
            return true;
        }
        else 
            return false;  
     }
    /**
      *  toString method represent information about objects from class Trainer
      * @return string 
      */
    
    @Override
    public String toString() {
        return ", Trainer: "+super.getName() +", Number phone: "+super.getNumberPhone()+", Id: "+super.getId()+", Email: "+super.getEmail();
    }

   
    
    
}

