/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;


import java.util.*;

/**
 * concrete class  Workouts 
 * this class order any thing related to the workouts classes in our gym 
 * @author  Raghad Al-Zaharani
 * 
 */
public class Workouts{
    /**
     * trainerObj is private object from class trainer 
     */
    private Trainer trainerObj;
    /**
     * classDuration is private instance attribute from type int
     * is storing duration for each class
     * 
     */
    private int classDuration;
    /**
     * className is private instance attribute from type String 
     * is storing name for classes
     * */
    private String className;
   
    
    
     /**
      * default constructor  
      * it is means no attribute
      */
    public Workouts() {
    }
    
    
    /**
     * constructor and initailzes two attribute
     * @param class_duration it is represnt the duration of the class
     * @param class_name  it is represnt the name of the class
     */
    public Workouts(int class_duration, String class_name) {
        classDuration = class_duration;
        className = class_name;
    }
    
    
    /**
     * constructor and initailzes three attribute
     * @param trainer it is object of class Trainer
     * @param class_duration it is represnt the duration of the class
     * @param class_name   it is represnt the name of the class
     */
    public Workouts(Trainer trainer, int class_duration, String class_name) {
        trainerObj = trainer;
        classDuration = class_duration;
        className = class_name;
    }
    
    
   /**
    * getter method for classDuration 
    * @return int
    * to access for classDuration attribute
    */ 
    public int getClassDuration() {
        return classDuration;
    }
    
    
    /**
     * setter method for classDuration
     * @param class_duration from type int
     * to update calssDuration attribute
     */
    public void setClassDuration(int class_duration) {
        classDuration = class_duration;
    }
    
    /**
     * getter method for className
     * @return String
     * to access for classNmae attribute
     */
    public String getClassName() {  
        return className;
    }
    
    /**
     * sette method for className
     * @param class_name from type String
     * to update calssNmae attribute
     */
    public void setClassName(String class_name) {
        className = class_name;
    }
    
    /**
     * getter method for trianerObj
     * @return Object from trainer class
     * to access for trainerObj attribute
     */
    public Trainer getTrainerObj() {
        return trainerObj;
    }
    
    /**
     * setter method for trainerObj
     * @param trainer from type trainer class
     * to update trainerObj attribute
     */
    public void setTrainerObj(Trainer trainer) {
        trainerObj = trainer;
    }
    
    /**
     * override for method toString
     * to repersent useful information about trainerObj , classDuration and classNamw
     * @return String 
     */
    @Override
    public String toString() { 
        return "- " +"class: " + className +", classDuration: " + classDuration + trainerObj  ;
    }
    
    /**
     * version 1.0
     * @param obj from type workouts class
     * @return boolean
     *  is compare between instance attribute className and the object from class Workouts 
    */
    public boolean equals( Workouts obj ){
        return this.className.equals(obj.className);
}
    
 
  /**
   * version 1.0
   * method clone to copy the object 
   * @return Object
   */ 
    @Override
    public Object clone(){
        Workouts objClone = new Workouts (classDuration,className);
        return objClone;
    }

  

}