/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagmentsystem_442003697;


//import bulid in classes

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.lang.NumberFormatException ;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * abstract class Person implements interface Editor
 * this abstract class have the common and standard information to used for the member or for the trainer
 * All information is protected and have the method which provide the functionality and it deal with the data
 * this information used to handle with the process of storing member or trainer and to  be able to edit the list of people we will make it from them
 * @author Esra saif
 * @version 1
 * 
 */


public abstract class Person implements Editor {
    
    //fields
    
    
   /**
    * numberPhone  protected instance attribute belong to member or trainer object , represent the numberphone 
    */
    protected String numberPhone ;
   
   /**
    * name protected instance attribute belong to member or trainer object , represent the name of member or trainer object
    */
   protected String name ;
   
   
    /**
    * name  protected instance attribute belong to member or trainer object , represent the email address of member or trainer object
    */
    protected String email;
   
    /**
    *  protected instance attribute id its type from  Long Class and it  belong to member or trainer object , represent the id of member or trainer object
    *  we can access to the person which can be for member or trainer across its id 
    */
   protected Long id;
   
   
    /**
    * listPepole protected instance attribute belong to member or trainer object , represent the list of members or trainers 
    *  it represent the id of  members or  trainers that we have in our gym 
    */
   protected ArrayList<Long> listPepole = new ArrayList<Long>();
     
   
   //methods
   
   /**
    * Person is default constrctor
    */
   Person()
   {
   }
   
  
    /**
    * Person is parametrized constrctor which initilaize the name and the id of the person
    */
    Person(String name ,Long UserId)
    {
    
      this.name =name ;
      this.id=UserId;
    
    }
    
    
    /**
    * getNumberPhone instance method that return the numberPhone
    * @return numberPhone of the person
    */
    public String getNumberPhone() {
        return numberPhone;
    }

    /**
    * setNumberPhone instance method that set the interd NumberPhone from the user 
    * this method recive numberPhone of person which may be member object or trainer object and it use method mathes from String class to see if the enterd number mathces the regular format of number which i create it \\d{10} this character mean it allowed to inter numbers consist only digits from 0 to 9 and it must be with 10 digits not more or less than it
    * if it consist other than digits from 0 to 9 it will cause an exception of type NumberFormatException so i put the message that will apper when the exception occourd 
    * here i decleared the exception by using throw keyowrd and put the name of possible exceptions that may be occourd by using throws  keyowrd tha handling with this  possible exception will be in the main by using try-catch blocks
    * @param numberPhone  numberphone of the person
    * @throws InputMismatchException  this exciptions may cause
    * @throws NumberFormatException  this exciptions may cause
    */
    public void setNumberPhone(String numberPhone)throws NumberFormatException , InputMismatchException //argument which will send to this method may cause this  exceptions
    {
        
    
        
        if(numberPhone.matches("\\d{10}"))  //this method will see if the enterd number mathces the regular format of number which i create it \\d{10} this character mean it allowed to inter numbers consist only digits from 0 to 9 and it must be with 10 digits not more or less than it 
             this.numberPhone =numberPhone;
        else
             throw new NumberFormatException("invalid number , please enter numberPhone with  10 digits without any characters and only consist digits from 0 to 9 , Try again please! ");

    }

    
    /**
    * getName instance method that return the name of person 
    * @return String name 
    */
    public String getName() {
        return name;
    }

    
    
    /**
    * setName instance method that set the interd name from the user 
    * this method recive name of person which may be member object or trainer object 
    * it will using loop to throw over the indices of  name to check if any of indices have other than letters then will cause an exciption of type NumberFormatException else than this will mean there is no character in each index of the string have other than letters and then the interd name will saved in the private attribute (name)
    * here i decleared the exception by using throw keyowrd and put the name of possible exceptions that may be occourd by using throws  keyowrd,  the handling with this  possible exception will be in the main by using try-catch blocks
    * @param name  , name of the person
    * @throws InputMismatchException , NumberFormatException
    *
    */
    public void setName(String name)throws InputMismatchException , NumberFormatException //argument which will send to this method may cause an exception
    {
        loop:for(int i = 0 ; i <name.length() ; i++)
         {  
             switch(name.charAt(i))
             {
                case '0':
                case '1':    
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    this.name="";
                  throw new NumberFormatException("invalid name , you have to insert only alphapet letters");
     
                 default:
                          this.name = name;
  
           
           }
                         
         }
             
 
    }
    
     /**
    *  getEmail instance method that return the email address  of person 
    * @return String email 
    */
    public String getEmail() {
        return email;
    }

    
    
    /**
    * setEmail instance method that set the interd email from the user 
    * by using class Pattern  i made object from it and recive the format  of the correct email adress whitch i want from user to insert like it,  across method compile the sympols in the string that i make it will understood by compile method
    * then by using matcher method from Pattren object and pass to it the string that the user interd will match it with the pattren whitch i make it and the value will set in the object of type Matcher class that i creat it 
    * by using method matches in if statment  we will know if the inters email match the correct format of email witch i selected or not if it correct then the interd email will put in attribute email which belong to mamber object or trainer object otherwise it wil cause an exception 
    * here i decleared the exception by using throw keyowrd and put the name of possible exceptions that may be occourd by using throws  keyowrd ,, the handling with this  possible exception will be in the main by using try-catch blocks
    * @param email  , set the email of the person
    * @throws InputMismatchException this exciptions may cause
    *  @throws NumberFormatException this exciptions may cause
    */
    
    
    public void setEmail(String email)throws InputMismatchException, NumberFormatException    //argument which will send to this method may cause an exception
    {  
                 
          //this string which i send it to compile method  represent which parts of emaill allowed in the emaill i mean it possible to found it in the email from user 
            Pattern p = Pattern.compile("^[\\w-\\.]{1,20}@\\w{2,10}\\.\\w{2,3}$"); //object from class called Pattern that i put the correct format witch have to insert from user
            
            Matcher m = p.matcher(email);    //object from class Matcher witch throw its method mather resposible to validate if the string valid to the basic format that i restrected or not
                                           //this method will return true if the string matches the basic format of email which i sellected
            
            if( m.matches() ==true)
            this.email = email;
            else
               throw new NumberFormatException("invalid email , you have to insert  correect format of email like ,xxxx@xxxx.com  ");
           
    }

    
    /**
    *  getEmail instance method that return the number  id  of the person 
    * @return Long object id 
    */
    public Long getId() {
        return id;
    }
    
    /**
    * setId instance method that insert the id of each object we created from member class or trainer class
    * the value of id we(programmers of the code) will created in the main class and we will send it throw this method to set the id of each new member or trainer
    * @param  id of the person
    */
    public void setId(Long id) {
        this.id = id;
    }

    
    /**
    * instance method add it  receive the id of person to add it in the list 
    * inside the method we used method add from ArrayList attribute (  listPepole ) that we creat it to take the  id of the member object or trainer object
     * @param objId of type Long object it is the id of the person
   */
    @Override
    public void add( Long objId)  //editing it from uml
    {
        listPepole.add(objId);
    }
  
    
    /**
     * it method receive the id of person(mean member object or trainer object) to remove it from the list of id
     *inside the method we used method remove  from ArrayList attribute (  listPepole ) that we creat it to take the id object and remove it 
     * @param obj of type Long object it is the id of the person
     */
   @Override
    public  void  delete(Long obj)
    {
       listPepole.remove(obj);
    }
    
    
 
    /**
     * instance method getList it return the list of person that we have in our gym
     * @return ArrayList of type Long
     */
   @Override
    public   ArrayList<Long> getList()
    {   
      return listPepole;
    }
    
    
    
    /**
     * instance method receive object of type Long whitch represent the id of person to search about its position in the list
     *inside the method we used indexOf(object) method from ArrayList class to take the position of the id in the list 
     * @param obj it is object of type Long 
     * @return the position of the specific id in the list
     */
   @Override
    public  int  search(Long obj)
    {
      return listPepole.indexOf(obj);
    }
   /**
      *  toString abstract method represent information about objects of members or trainers
      * @return string 
      */
   @Override
    public abstract  String toString();//abstract method which override it in the subclass according to its information that we want to represent it
    
    
    
     /**
      * equals abstract method will test  the id between two objects 
      * @param o it is  object of type Object class ,  it will casting the recived object to member object or trainer object 
      * @return true or false according to the comparing between the id 
      */
    
   @Override
   public abstract boolean equals(Object o);
  
  
    
}





    // check1: if(numberPhone.length()==10)
//        {
//            for(int i = 0 ; i <numberPhone.length() ; i++)
//               switch(numberPhone.charAt(i))
//             {
//                 case '0':
//                 case '1':    
//                 case '2':
//                 case '3':
//                 case '4':
//                 case '5':
//                 case '6':
//                 case '7':
//                 case '8':
//                 case '9':
//                           
//                
//                default:
//                        System.out.println("invalid number , please enter numberPhone with length of 10 and only consist digits from 0 to 9  ");
//                        break check1;             
//             }//end switch
//         this.numberPhone = numberPhone;
//         
//        }//end if block
//            else
//           {
//               System.out.println("invalid number , please enter numberPhone with length of 10 and only consist digits from 0 to 9  ");
//                  return;
//           }
// 