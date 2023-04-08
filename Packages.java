/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;
//import bulid in classes
import java.util.ArrayList;
import java.util.Collections;


/**
 * class Packages 
 * To create an Object of Packages class type
 * it save Packages information the listWorkout, namePackage, durationPackage, pricePackage, Diet_Available
 * @author rafaa alowaybidi
 * @version 1
 */
public class Packages implements Cloneable {
    //attributes
    
    /**
     * listworkout private instance attribute hold object from class Workouts
     */
    private ArrayList<Workouts> listWorkout = new ArrayList<Workouts>() ; 
    
    /**
     * namePackage private instance attribute holds name of package
     */
    private String namePackage;
    
    /**
     * durationPackage private instance attribute holds duration of package
     */
    private int durationPackage; 
    
    /**
     * pricePackage private instance attribute holds price of package
     */
    private double pricePackage; 
    
    /**
     * Diet_Available private instance attribute hold object from class Diets
     */
     private  ArrayList<Diets>  Diet_Available = new ArrayList<Diets>();
    
    //default constrctor
    public Packages(){
    } 
   
    /**
     * Packages is a constructor of class Packages
     * initializing class fields
     * @param name_package as a package name
     * @param duration_package as a package duration
     * @param Price as a package price
     */
    public Packages(String name_package,int duration_package,double Price){
        this.namePackage=name_package;
        this.durationPackage=duration_package;
        this.pricePackage=Price;
    }
    
     //setters

    /**
     * set the namePackage attribute
     * @param name_package name of package
     */
    public void setName(String name_package){
          this.namePackage = name_package; 
         }
    
    /**
     * set the durationPackage attribute
     * @param duration_package duration of package
     */
    public void setDuration(int duration_package) { 
        if(duration_package>0){//muste be month positive integer
        this.durationPackage = duration_package;     
        }
    }

    /**
     * set the pricePackage attribute
     * @param price_package price of package
     */    
    public void setPrice(double price_package) {
        this.pricePackage = price_package;
    }
    
    /**
     * set the Diet_Available attribute
     * @param type_diet type of diet
     */
    public void setDiet(Diets type_diet) {
        Diet_Available.add(type_diet);
    }
    
    /**
     * set the listWorkout attribute
     * @param workout workout of Workouts
     */
    
    public void setWorkout(Workouts workout) {
       listWorkout.add(workout);
    }
    //getters
    
    /**
    * getName instance method that return the name of package 
    * @return String namePackage 
    */
    public String getName() {
        return namePackage;
    }
    
    /**
    * getDuration instance method that return the duration of package 
    * @return int durationPackage 
    */

    public int getDuration() {       
        return durationPackage;
    }
    
    /**
    * getDiet instance method that return the Diet Available
    * @return Diets Diet_Available 
    */
    public ArrayList<Diets> getDiet() {
        return Diet_Available;
    }
    
    /**
    * getWorkout instance method that return the list of workout
    * @return Workouts listWorkout 
    */
    
   public ArrayList<Workouts> getWorkout() {
        return listWorkout;
    }
   
   /**
    * priceOfSubscription instance method that return the price of package
    * @return double pricePackage 
    */
     public double priceOfSubscription(){
         return pricePackage;
     }
     
     /**
      *  toString method represent information about objects from class Packages
      * @return string 
      */

    @Override
    public String toString() {
        
        return namePackage + ", duration: " + durationPackage + " month,"+" price: " + pricePackage +" SR" ;
           
    }
    
    /**
     * print_dietsWorkouts method represent print information 
     * about Available Diets and Available workouts  
     */
    
    public void print_dietsWorkouts()
    {   
          System.out.println(" Available Diets: "); 
         for (int i =0 ; i<Diet_Available.size();i++)
            {
               System.out.println(Diet_Available.get(i));
            }
         
           System.out.println(" Available workouts: "); 
        for (int i =0 ; i<listWorkout.size();i++)
            {
               System.out.println(listWorkout.get(i));
            }
    } 
    
    /**
     * clone method copies the package information including durationPackage and namePackage
     * and pricePackage and listWorkout and Diet_Available   
     * @return Object p
     * @throws CloneNotSupportedException it is may caused this exciption 
     */       
                   
    @Override
    public Object clone()throws CloneNotSupportedException
    {
      Packages p = (Packages)super.clone();
       p.durationPackage=durationPackage ;
       p.namePackage = namePackage;
       p.pricePackage = pricePackage;
       
      Collections.copy(  p.listWorkout, listWorkout); // copy the same list of workouts in this package
      
      Collections.copy(  p.Diet_Available, Diet_Available); // copy the same type of diet
        
       return p ;
      //return super.clone();
    
    }
 
}
