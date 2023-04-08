/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;
/**
class diets made to create objects of diets type that has a name and description, and also has setters and getters to this attributes, in addition to tostring method .
 * @author maramkhouqj
 * @version 1.0, 13 Apr 2022
 * @since 1.0
 */

public class Diets {
    // attributes
    
    private String dietName;
    private String dietDescription;
    
    //constructors
/** 
* Class constructor.
*/
    Diets(){}
    
    Diets(String name, String description ){
        dietName=name;
        dietDescription=description;
    }
    
    //setters..
    
    /**
    *@param name the name of the dietary program
    */
    public void setDietName(String name){dietName=name;}
    
    /**
    *@param description detailed description of the dietary program 
    */
    public void setDietDescription(String description){dietDescription=description;}
    
    //getters..
    
    /**
    *@return name the name of the dietary program
    */
    public String getDietName(){return dietName;}
    
    /**
    *@return description detailed description of the dietary program 
    */
    public String getDietDescription(){return dietDescription;}
    
    //other methods
    
    /**
    *@return String an informative description about the dietary program
    */
    @Override
    public String toString(){return dietName+ ", How it works: "+dietDescription;}
}