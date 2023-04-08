/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;

/**
 *
 * @author Ahlam
 */

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * concrete class Member extends abstract Person
 * To create an Object of member class type
 * it Save member information the healthStatus, weight,length,startsub,endsub and age
 * @author Ahlam
 */
public class Member extends Person {

    //instant fields
    
    /**MYPACKAGES This attribute object from class Packages
    */
    private  Packages myPackages;
    
    /**WEIGHT This attribute holds the weight of the member  
    */
    //WEIGHT is an instant constant that belongs to an object
    //its value will differ from one object to another
    private double weight; 
    
    /**LENGTH This attribute holds the length of the member  
    */
    //LENGTH is an instant constant that belongs to an object
    //its value will differ from one object to another
    private double length;
    
    /**AGE This attribute holds the age of the member  
    */
    //AGE is an instant constant that belongs to an object
    //its value will differ from one object to another
    private int age;
    
    /**STARTSUB This attribute holds the start subscription of the member  
    */
    //STARTSUB is an instant constant that belongs to an object
    //its value will differ from one object to another
    private String startsub;
    
    /**ENDSUB This attribute holds the end subscription of the member  
    */
    //ENDSUB is an instant constant that belongs to an object
    //its value will differ from one object to another
    private String endsub;
    
    /**COUNTER This attribute Increases by one when creating a new object to give the user an ID number
    */
    static long counter=1;

    
    //methods
    
    /**Constructor without Argoment Increase the counter by one when creating a new object**/
    public Member()
    { 
       this.id= counter++;
    }
    
 
    public Member(String name, int age , String email , String numberPhone ,double weight, double length )
    {  
        super(name, counter++);
        
        this.email=email ;
        this.numberPhone= numberPhone;
        this.weight = weight;
        this.length = length;
        this.length = age;
    }
    
    public Member(String name, double weight, double length, int age)
    {  
          super(name, counter++);
        this.weight = weight;
        this.length = length;
        this.length = age;
    }
   //geters and seters
    public Packages getMyPackages()
    {
        return myPackages;
    }

    public void setMyPackages(Packages myPackages) {
        this.myPackages = myPackages;
    }
    
    /**
     * GETWEIGHT returns the weight of the member
     * @return WEIGHT weight
     */
    public double getWeight()
    {
        return weight;
    }
    
    /**
     * setWeight changes the Weight to a new Weight
     * @param weight as the new Weight
     */
    public void setWeight(double weight)
    {
        if (weight>30) 
        {
        this.weight = weight;   
        }
        else throw new NumberFormatException("Please enter the weight correctly");
    }

    /**
     * GETLENGTH returns the length of the member
     * @return LENGTH length
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * setLength changes the Length to a new Length
     * @param length as the new Length
     */
    public void setLength(double length)
    {
         if (length>120) 
         {
        this.length = length; 
        }
        else throw new NumberFormatException("Please enter the length correctly");
    }
    
    /**
     * GETAGE returns the age of the member
     * @return AGE age
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * setAge changes the age to a new age
     * @param age as the new age
     */
    public void setAge(int age)
    {
         if (age>=18&& age<=60) 
         {
        this.age = age;  
        }
        else throw new NumberFormatException("Sorry your age not allowed to enter our gym , Age allwerd to enter should  be between 18 to 60");  
    }
      /**
     * GETSTARTSUB returns the Start Date
     * @return String Start Date
     */
    public String getStartsub() {
        return startsub;
    }
     /**
     * setSTARTSUB changes the Start Date
     * @param startsub Date 
     */
    public void setStartsub(String startsub) {
        this.startsub = startsub;
    }
     /**
     * GETENDSUB returns the End Date
     * @return String End Date
     */
    public String getEndsub() {
        return endsub;
    }
      /**
     * setENDSUB changes the End Date
     * @param endsub it represent date of end of the subscribe in the string
     */
    public void setEndsub(String endsub) {
        this.endsub = endsub;
    }
    
    
    /**
     * subscriptionEnddate Shows the member the start date of the subscription and the date of the end of the subscription
     * @param d it is recive an integer represent the number of package that the user selceted
     */
    // I used the Date,SimpleDateFormat and GregorianCalendar classes from outside the slides    
    public void subscriptionEnddate(int d)
    { 
     Date date =new Date();//Object of Date class
     SimpleDateFormat dat = new SimpleDateFormat("dd/MM/yyyy");//Show start date
    
     if(d==1)
     {
      this.startsub = dat.format(date); //sent the object date that i want to put it in my spicifec format and it will return the date to put it in startsub attripute
     
     GregorianCalendar En = new GregorianCalendar();//GregorianCalendar Add the number of months
     En.add(GregorianCalendar.DATE,360);//12 month
     
     Date En2 = En.getTime();//transfer from GregorianCalendar to Date
     DateFormat D1 = DateFormat.getDateInstance();
     
     String E =D1.format(En2);//
     this.endsub = E;//Save the end date
     }
     
     if(d==2)
     {
      this.startsub = dat.format(date);
    
     GregorianCalendar En = new GregorianCalendar();//GregorianCalendar Add the number of months
     En.add(GregorianCalendar.DATE,180);//6 month
     Date En2 = En.getTime();//transfer from GregorianCalendar to Date
     DateFormat D1 = DateFormat.getDateInstance();
     String E =D1.format(En2);//
          this.endsub = E;

     }
     
     if(d==3)
     {
       this.startsub = dat.format(date);     
     GregorianCalendar En = new GregorianCalendar();//GregorianCalendar Add the number of months
     En.add(GregorianCalendar.DATE,90);//3month
     Date En2 = En.getTime();//transfer from GregorianCalendar to Date
     DateFormat D1 = DateFormat.getDateInstance(); 
     String E =D1.format(En2);//
     
     this.endsub = E;

     
     }
    
    }
    
     /**
      * equals override method from abstract class person will test  the id between two objects 
      * @param o it is  object of type Object class ,  it will casting recive object to Member object 
      * @return true or false according to the comparing between the attributes
      */
    @Override
     public boolean equals (Object o){
         Member M = (Member)o;
        if(this.id ==(M.id))
        {
            return true;
        }
        else 
            return false;
         
     }
     /**
      *  toString method represent information about objects from class Member
      * @return string 
      */
    @Override
    public String toString(){
        return "Name: "+super.getName()+ ", Id: "+super.getId()+", Email: "+super.getEmail()+",number Phone: "+super.getNumberPhone()+ ", age: "+this.age+ " weight: "+ this.weight+", length: "+this.length ;
 
    }
         
                
}

