package gymmanagmentsystem_442003697;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Nowadays gyms are essential for everyone, to combats diseases, keep in good
 * shape or even to lift the mood and improve sleeping! And we all can see its
 * effect on our society since itأ¢â‚¬â„¢s an unneglectable part of everyoneأ¢â‚¬â„¢s
 * routine. This gym management system was designed using object-oriented
 * programming by applying all its concepts! The system was made to deal with
 * both the trainers and members. to manage the trainersأ¢â‚¬â„¢ affairs, to help
 * members in bookings, and to assist the new clients to join by taking their
 * personal information, the clients have different packages to choose from,
 * they differ in features, some of them offer a dietary plan and give access to
 * different number of sports. Each sport has a maximum number of trainees, only
 * one trainer, fixed durations. every trainer can train 1or 3 (at most) sports.
 * All to achieve the institutionأ¢â‚¬â„¢s goals with no mistakes
 * ..................................... members of group :esra saif,442003697 /
 * ahlam, 442002618 / maram, 442009326 / Raghad Al-Zaharani , 442017353 / rafaa
 * alowaybidi 442001914 in the beginning of the class
 * GymManagmentSystem_442003697 we created static objects of Workouts and Diets
 * and Packages classes , also we created an arraylist of type trainers class
 * and members class, also we created array of type Person abstract class its
 * length 8 to hold the object of trainers later in the main method
 *
 */
public class GymManagmentSystem_442003697 {

    //creating objects
    //Workouts
    static Workouts Cardio = new Workouts(30, "Cardio");
    static Workouts Zumba = new Workouts(60, "Zumba");
    static Workouts Pilates = new Workouts(50, "Pilates");
    static Workouts BootCamp = new Workouts(60, "Boot Camp");
    static Workouts Spinning = new Workouts(40, "Spinning");
    static Workouts CrossFit = new Workouts(30, "CrossFit");
    static Workouts Boxing = new Workouts(60, "Boxing");
    static Workouts Weightlifting = new Workouts(50, "Weightlifting");

    //Diets
    static Diets AtkinsDiet = new Diets("AtkinsDiet", "It focuses on controlling the levels of insulin, by avoiding carbohydrates and eating as much protein and fat as you like.");
    static Diets VegetarianDiet = new Diets("Vegetarian diet", "A Vegetarian should cut animal-based foods, except for eggs, dairy, and honey.");
    static Diets VeganDiet = new Diets("Vegan diet", "A vegan does not eat anything that is animal-based, including eggs, dairy, and honey.");
    static Diets glutenFreeDiet = new Diets("gluten-free diet", "A gluten-free diet excludes any foods that contain gluten, which is a protein found in wheat and several other grains. ");
    static Diets balancedDiet = new Diets("balanced diet", "balanced diet is a diet that contains differing kinds of foods in certain quantities and proportions so that the requirement for calories, proteins, minerals, vitamins and alternative nutrients is adequate");
    static Diets personal_selection = new Diets("personal selection", "Depends on your own preferences");

    //Packages
    static Packages GoldenPackage = new Packages("Golden Package", 12, 3000);
    static Packages PopularPackage = new Packages("Popular Package", 6, 1600);
    static Packages StandardPackage = new Packages("Standard package", 3, 900);

    static ArrayList<Trainer> trainers = new ArrayList<Trainer>();
    static ArrayList<Member> members = new ArrayList<Member>();//arraylist contains all the memeber objects

    //creating list of trainers
    static Person[] trainerArray = new Person[8];

    /**
     * in the driver main method we set many different objects of class Workout
     * and class diets that we created in the class GymManagmentSystem_442003697
     * to set in each different type of packages in our gym we set objects of
     * Trainer class in trainerArray array of type Person class and We have
     * selected their numbers and email addresses then we set each trainer in
     * different objects of class Wourkouts by using loop we display the program
     * to the user beggining by welcome message then we display number of
     * services that the user may selected then according to its choice we will
     * call specific methos to do the jop the loop wil end and then the program
     * will end if the user Choose service number 4 "Exit" that will end the
     * program also we used try-catch to deal with any exciption that may occur
     *
     * @param args
     */
    public static void main(String[] args) {

        //set workouts  to  GoldenPackage
        GoldenPackage.setWorkout(Cardio);
        GoldenPackage.setWorkout(Zumba);
        GoldenPackage.setWorkout(Pilates);
        GoldenPackage.setWorkout(BootCamp);
        GoldenPackage.setWorkout(Spinning);
        GoldenPackage.setWorkout(CrossFit);
        GoldenPackage.setWorkout(Boxing);
        GoldenPackage.setWorkout(Weightlifting);

        //set workouts  to  PopularPackage
        PopularPackage.setWorkout(Cardio);
        PopularPackage.setWorkout(Pilates);
        PopularPackage.setWorkout(Zumba);
        PopularPackage.setWorkout(Spinning);
        PopularPackage.setWorkout(Weightlifting);

        //set diets to  GoldenPackage
        GoldenPackage.setDiet(AtkinsDiet);
        GoldenPackage.setDiet(VegetarianDiet);
        GoldenPackage.setDiet(VeganDiet);
        GoldenPackage.setDiet(glutenFreeDiet);
        GoldenPackage.setDiet(balancedDiet);

        //set diets to   PopularPackage
        PopularPackage.setDiet(AtkinsDiet);
        PopularPackage.setDiet(VegetarianDiet);
        PopularPackage.setDiet(balancedDiet);

        StandardPackage.setWorkout(Cardio);
        StandardPackage.setWorkout(Pilates);
        StandardPackage.setWorkout(Weightlifting);

        StandardPackage.setDiet(personal_selection);

        trainerArray[0] = new Trainer("Maram");
        trainerArray[1] = new Trainer("esraa");
        trainerArray[2] = new Trainer("rafaa");
        trainerArray[3] = new Trainer("raghad");
        trainerArray[4] = new Trainer("ahlam");
        trainerArray[5] = new Trainer("sara");
        trainerArray[6] = new Trainer("dana");
        trainerArray[7] = new Trainer("areej");

        //setting emails to the trainers
        trainerArray[0].setEmail("maram1@gmail.com");
        trainerArray[1].setEmail("esraas@gmail.com");
        trainerArray[2].setEmail("rafaa_02@gmail.com");
        trainerArray[3].setEmail("raghadz@gmail.com");
        trainerArray[4].setEmail("ahlam00@gmail.com");
        trainerArray[5].setEmail("sara_3@gmail.com");
        trainerArray[6].setEmail("dana@gmail.com");
        trainerArray[7].setEmail("areejk@gmail.com");

        //setting phone numbers to the trainers    
        trainerArray[0].setNumberPhone("0555501234");
        trainerArray[1].setNumberPhone("0519372973");
        trainerArray[2].setNumberPhone("0551937503");
        trainerArray[3].setNumberPhone("0559255570");
        trainerArray[4].setNumberPhone("0599958326");
        trainerArray[5].setNumberPhone("0599913329");
        trainerArray[6].setNumberPhone("0594413000");
        trainerArray[7].setNumberPhone("0588837503");

        Cardio.setTrainerObj((Trainer) trainerArray[0]);
        Zumba.setTrainerObj((Trainer) trainerArray[1]);
        Pilates.setTrainerObj((Trainer) trainerArray[2]);
        BootCamp.setTrainerObj((Trainer) trainerArray[3]);
        Spinning.setTrainerObj((Trainer) trainerArray[4]);
        CrossFit.setTrainerObj((Trainer) trainerArray[5]);
        Boxing.setTrainerObj((Trainer) trainerArray[6]);
        Weightlifting.setTrainerObj((Trainer) trainerArray[7]);

        GymManagmentSystem_442003697 object = new GymManagmentSystem_442003697();

        Scanner input = new Scanner(System.in);

        boolean test = true;

        loop:
        do {
            System.out.println("***** Hello, Welcome to the gym *********");

            System.out.println("Please enter your choice of these numbers:\n1-You are an old member \n2-You are a new member \n3-You are a trainer\n4-Exit");

            try {

                System.out.print("Your choice : ");
                int in = input.nextInt();

                switch (in) {
                    case 1:
                        EditingData();
                        break;
                    case 2:
                        try {
                            object.NewMember();
                        } catch (CloneNotSupportedException e) {
                            System.out.println(" ");
                        }

                        break;

                    case 3:
                        isTrainer();
                        break;

                    case 4:
                        Exit(false);
                        break loop;

                    default:

                        System.out.println("Error :you only need to enter a number represent one of these services  ");

                }//switch block
            }//try block
            catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Error :you only need to enter a number represent one of these services , Try again ");
            }

        } while (test);

    }//end main

    /**
     * EditingData instance method that Editing stored member data Edit the
     * userط£آ¢أ¢â€ڑآ¬أ¢â€‍آ¢s data by using the saved ID number in the ArrayList allow
     * the user to change the email when choosing the second case, and change
     * the phone number when choosing the third case.He can renew the
     * subscription when choosing the fourth case, and when choosing the fifth
     * case, the memberط£آ¢أ¢â€ڑآ¬أ¢â€‍آ¢s membership will be deleted and he will be
     * removed from the Arraylist
     */
    public static void EditingData() {

        System.out.println("Choose one of the services"
                + "\n1-Enquiry about subscription"
                + "\n2-change email"
                + "\n3-change phone number"
                + "\n4-subscription renew"
                + "\n5-cancel membership");

        Scanner input = new Scanner(System.in);

        int D = 0; // variable save the choise
        boolean test = true;

        try {

            do {

                try {
                    System.out.print("Your choice: ");
                    D = input.nextInt();
                    test = false;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Incorrect choice! Please enter one of these services. try again!");
                }

            } while (test);

            System.out.print("Enter your ID: ");

            Long ID = new Long(input.nextInt());

            int index = 0;
            boolean Existing = false;

            for (int i = 0; i < members.size(); i++) {
                Long getID = members.get(i).getId();

                if (getID.equals(ID)) {
                    index = i;
                    Existing = true;
                }

            }

            if (Existing == false) {
                System.out.println("you did not have a membership in our gym yet !!! ,First join to our gym by choosing the second choice from the menu  to create your membership in our Gym \n Thank you   ");
                return;
            }

            //------------------------------------------------------------------------------
            switch (D) {
                case 1:
                    System.out.println("Subscription start date: " + members.get(index).getStartsub() + " Subscription end date: " + members.get(index).getEndsub());
                    break;
                //---------------------------------------------------------------------------------          
                case 2:

                    System.out.print("Please enter the new email: ");
                    String email = input.next();
                    members.get(index).setEmail(email);
                    break;
                //---------------------------------------------------------------------------------          
                case 3:
                    System.out.println("Please enter the new phone number: ");
                    String numberphone = input.next();
                    members.get(index).setNumberPhone(numberphone);
                    break;
                //-----------------------------------------------------------------------------------      
                case 4:

                    try {

                        menu(); //calling this method to display all avilable packages

                        System.out.print("Please enter the number of your choice from these packages: ");

                        int choicce = input.nextInt();

                        switch (choicce) {

                            case 1:
                                members.get(index).setMyPackages((Packages) GoldenPackage.clone());
                                members.get(index).subscriptionEnddate(choicce);
                                break;

                            case 2:
                                members.get(index).setMyPackages((Packages) PopularPackage.clone());
                                members.get(index).subscriptionEnddate(choicce);
                                break;

                            case 3:
                                members.get(index).setMyPackages((Packages) StandardPackage.clone());
                                members.get(index).subscriptionEnddate(choicce);
                                break;

                        }
                        System.out.println("you got this packeage:" + members.get(index).getMyPackages());
                        //-------------------------------------------------------------------------------------       
                    } //end try   
                    catch (InputMismatchException e) {
                        System.out.println("Error :you only need to enter a number that represents one of these available packages ");
                    } catch (CloneNotSupportedException ex) {
//              System.out.println(ex.getMessage());
                    }
                    break;
                case 5:

                    try {
                        members.get(index).delete(members.get(index).getId());
                        members.remove(index);
                        Member.counter--;
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("you are not existed");
                    }
                    break;

                default:
                    System.out.println("Incorrect choice! Please enter one of these numbers to represent the service");

                //------------------------------------------------------------------------------------                
            }//end switch

        }//try
        catch (InputMismatchException e) {
            System.out.println("Incorrect Id! Please enter your id correctly");
        } catch (NullPointerException | IndexOutOfBoundsException e) {
            System.out.println("you did not have a membership yet !!! Please enter the second choice to create your membership in our Gym \n Thank you   ");
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }

    }  //end EditingData method

    /**
     * NewMember instance method that adding the new members to the gym by
     * creating object from class member then receive the required information
     * from the user and validate it in setter methods and by using try-catches
     * then after the user entered correct information our program will display
     * menu of all available packages that the member can choice it by calling
     * static method menu and at the end our program will save the id of the
     * member in the array list of id that for the members and will add the new
     * member object to the array list that of type members
     *
     * @throws CloneNotSupportedException may causing this
     */
    public void NewMember() throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);

        Member m = new Member();

        boolean test = true;
        do {

            try {
                System.out.print("Enter your name:");
                String n = input.next();
                m.setName(n);
                test = false;

            } catch (InputMismatchException e) {
                System.out.println("Error: invalid input, Please enter your name with letters only");

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            }

        } while (test);

        test = true;
        do {

            try {
                System.out.print("Enter your age:");
                int age = input.nextInt();

                m.setAge(age);
                test = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Error: invalid input, Please enter a whole number represents your age");

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                Exit(false);//to stop the loop
                return;  //return to the main method and stop the program for this new member

            }

        } while (test);

        test = true;
        do {

            try {

                System.out.print("Enter your phone number :");
                String phone = input.next();
                m.setNumberPhone(phone);
                test = false;

            }//try block
            catch (InputMismatchException e) {
                System.out.println("Error: invalid input, try again");
                //input.nextLine();
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            }

        } while (test);

        test = true;
        do {

            try {
                System.out.print("Enter your email address in the right format (xxxx@xxxx.com)");
                String email = input.next();
                m.setEmail(email);
                test = false;

            }//try block
            catch (InputMismatchException e) {
                System.out.println("Error: invalid input, try again");

            } catch (NumberFormatException | NullPointerException e) {
                System.out.println(e.getMessage());

            }

        } while (test);

        test = true;
        do {

            try {
                System.out.print("Enter your weight :");
                double w = input.nextDouble();
                m.setWeight(w);
                test = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Error: invalide input for weight , please try again the correct number of weight (45,50,55...)");

            } catch (NumberFormatException | NullPointerException e) {
                System.out.println(e.getMessage());

            }

        } while (test);

        test = true;
        do {

            try {
                System.out.print("Enter your height :");
                double L = input.nextDouble();
                m.setLength(L);
                test = false;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Error: invalid number of height, please try again (149,155,160...)");

            } catch (NumberFormatException | NullPointerException e) {
                System.out.println(e.getMessage());

            }

        } while (test);

        //add the id of the member in the list of od of the  members
        Long add = m.getId();
        m.add(add);
        //add the member in the list of members
        members.add(m);

        test = true;

        menu(); //calling this method to display all avilable packages
        do {

            try {

                System.out.print("Please enter your choice of these packages that you want to get: ");

                int choicce = input.nextInt();

                switch (choicce) {

                    case 1:
                        m.setMyPackages((Packages) GoldenPackage.clone());
                        m.subscriptionEnddate(choicce);
                        break;

                    case 2:
                        m.setMyPackages((Packages) PopularPackage.clone());
                        m.subscriptionEnddate(choicce);
                        break;

                    case 3:
                        m.setMyPackages((Packages) StandardPackage.clone());
                        m.subscriptionEnddate(choicce);
                        break;

                }

                System.out.println("You got this packeage : " + m.getMyPackages().toString());
                System.out.println("Your information :" + m.toString());
                test = false;

            } //end try   
            catch (InputMismatchException | NullPointerException e) {
                input.nextLine();
                System.out.println("Error :you only need to enter a number represent one of this available packages  ");
            }

        } while (test);

    }//end method

    /**
     * static method Exit it terminate the loop in the main method
     *
     * @param t this method from the main we send true or false when we want to
     * terminate the loop in the main method to terminate all the program we
     * send false
     */
    public static void Exit(boolean t) {
        t = false;

    }

    /**
     * static method menu it display the information of all the packages in our
     * gym to the user to make it chose one from it to subscribe to it
     */
    public static void menu() {
        System.out.println("\nMenu of Packages:");

        System.out.println("1- " + GoldenPackage.toString());
        GoldenPackage.print_dietsWorkouts();
        System.out.println("..................................");

        System.out.println("2- " + PopularPackage.toString());
        PopularPackage.print_dietsWorkouts();
        System.out.println("..................................");

        System.out.println("3- " + StandardPackage.toString());
        StandardPackage.print_dietsWorkouts();
        System.out.println("..................................");

    }

    /**
     *
     * Method isTrainer updates the trainer's data after making sure that he is
     * already a trainer in gym by entering his ID number If the ID number
     * already exists, several options will appear for her including displaying
     * the workouts she has today and updating his number phone or email, but if
     * If the ID is outside the specified range the program will print a message
     * to the trainer that we could not find the number entered
     *
     * We ask the trainer about her desire to display the worhouts she has today
     * If her answer is yes the workouts she is doing today will appear to her
     * according to the ID number she entered previously But if the answer is
     * no, another message will appear, and if her answer is not yes or no, then
     * it will have many attempts until a yes or no answer is entered We used
     * the while loop
     *
     * Then we ask the trainer if she wants to update her information If her
     * answer is yes the The options will appear If she chooses the number 1 or
     * number 2 and here used switch - case it will enable her to update her
     * phone number We used in this option parseInt method from wrapper class
     * and NumberFormatException and object from Trainer class to update the
     * number phone in setNumberPhone
     *
     * If she chooses the number 2, the second option appears for her, which is
     * to update her email and used if - else and object from Trainer class,
     * check from enterd string if has "@gmail.com" update new Email in setEmail
     * else another massage will appear      *
     * If the trainer enters the wrong phone number or the wrong email we give
     * her attempts to enter the correct number by using two diffrent loops
     *
     *
     *
     */
    public static void isTrainer() {
        System.out.println("hello trianer  ");
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter your ID to check: ");
        long Id = input.nextLong();
        int index = 0;
        boolean Existing = false;
        Long ID = new Long(Id);

        for (int i = 0; i < trainerArray.length; i++) {
            Long getID = trainerArray[i].getId();

            if (getID.equals(ID)) {
                index = i;
                Existing = true;
            }

        }

        if (Existing) {

            /*The Trainer  must enter the ID number to verify if he is really trained or not
 and we put the ID numbers in a certain range from 100 to 108
  If the ID does not exist in this field, he cannot use the services      
             */
            System.out.print("Do you want display that you have today? please answer with yes or no : ");
            String answer;
            answer = input.next();
            while (true) {
                //Enter the trainer an answer other than yes and do not try again
                if ("yes".equalsIgnoreCase(answer) || "Yes".equals(answer)) {

                    /*If the Trainer  wants to know what exercises he will train today, he will answer yes 
      According to the ID that he has, we will be able to know his name
      and thus show him the exercises he has today  
                    
                     */
                    if (Id == 100) {
                        System.out.println("hi Maram today you have following workout ..... Cardio   ");
                    } else if (Id == 101) {
                        System.out.println("hi Esra today you have following workout ..... Zumba ");
                    } else if (Id == 102) {
                        System.out.println("hi Rafaa today you have following workout ..... Pilates ");
                    } else if (Id == 103) {
                        System.out.println("hi Raghad today you have following workout .....BootCamp ");
                    } else if (Id == 104) {
                        System.out.println("hi Ahlam today you have following workout ..... Spinning  ");
                    } else if (Id == 105) {
                        System.out.println("hi Sara today you have following workout .....CrossFit ");
                    } else if (Id == 106) {
                        System.out.println("hi Dana today you have following workout ..... Boxing ");
                    } else if (Id == 107) {
                        System.out.println("hi Areej today you have following workout ..... Weightlifting  ");
                    }

                    System.out.print("Do you want to update your information ? ");
                    //We ask the Trainer if he wants to update one of his previously existing information
                    String change;
                    change = input.next();

                    while (true) {
                        //Enter the Trainer an answer other than yes and do not try again

                        if ("yes".equalsIgnoreCase(change) || "Yes".equals(change)) {
                            // if the user answer yes or YES or Yes , mean you want change the inforamtion     

                            //  The information he can update is his phone number and email
                            System.out.println("Enter number \"1\" to change your number phone ");
                            System.out.println("Enter number \"2\" to change your Email");
                            int option;
                            // object from class Trainer
                            System.out.print("Your choice: ");
                            option = input.nextInt();
                            switch (option) {

                                /*The coach will choose number 1 to update his mobile number 
                                              or 2 to update his email
                                 */
                                case 1:
                                    System.out.println("now you can change your number phone .");
                                    String newNumberPhone;
                                    String a;
                                    boolean ask;
                                    do {
                                        try {
                                            System.out.print(" please enter your new number: ");
                                            newNumberPhone = input.next();
                                            if (newNumberPhone.length() == 10) {
                                                /*We set a condition in the beginning that this String  be made up of 10 numbers, 
                                                if it is less or entered incorrectly, the else message will appear to the trainer
                                                 */
                                                int number = Integer.parseInt(newNumberPhone);
                                                trainerArray[index].setNumberPhone(newNumberPhone);
                                                System.out.println("Your  new number phone: " + trainerArray[index].numberPhone);
                                                ask = false;
                                                //we use parseInt from wrapper class to convert the number phone from String to int 
                                            } else {
                                                System.out.println("it is not ten numbers ");
                                                System.out.println(" the number is enterd incorrect , do you want try again ? ");
                                                System.out.println("please answer yes or no ");
                                                a = input.next();
                                                ask = "yes".equalsIgnoreCase(a) || "Yes".equals(a);

                                            }

                                        } catch (NumberFormatException ex) {
                                            //If the trainer enters trainer containing 10 inputs, but enters one or more alphabetic characters catch massage 
                                            // will appear 
                                            System.out.println("wrong number phone");
                                            System.out.println(" the number is enterd incorrect , do you want try again ? ");
                                            System.out.println("please answer yes or no ");
                                            a = input.next();
                                            ask = "yes".equalsIgnoreCase(a) || "Yes".equals(a);
                                        }

                                    } while (ask);

                                    break;

                                //________
                                /*The second option is for the user to change his email,
         and for this service we have set
         a specific format for the email that the program will accept
                                 */
                                case 2:
                                    System.out.println("Now you can update your email: ");
                                    boolean continue1 = true;
                                    String x = "@gmail.com";
                                    do {
                                        System.out.print("Enter your  new email: ");
                                        String newEmail = input.next();

                                        if (newEmail.indexOf(x) + x.length() == newEmail.length()) {
                                            trainerArray[index].setEmail(newEmail);
                                            System.out.println("Your new Email: " +    trainerArray[index].email);
                                            continue1 = false;
                                        } else {
                                            System.out.println(" the Email is enterd incorrect , do you want try again ? ");
                                            System.out.print("please answer yes or no ");
                                            a = input.next();
                                            continue1 = "yes".equalsIgnoreCase(a) || "Yes".equals(a);
                                        }
                                    } while (continue1);
                                    break;

                                // If the Trainer enters a number other than 1 and 2, it will show him the message Default 
                                default:
                                    System.out.println("this options is unavailable");
                            }//end of object 

                            break;
                        } // end the if for change - if trainer answer with yes

                        if ("no".equalsIgnoreCase(change) || "No".equals(change)) {
                            // means do not want change your information  , print this massage
                            System.out.println(" your information will remain the same ");
                            break;
                        } // end for if  

                        // if user enter any words or number except yes or no , print this massage
                        System.out.print("what do you mean by " + change + " please anwser \"yes\" or \"no\": ");
                        System.out.print("Please try again: ");
                        change = input.next();
                    } //end for while loop
                    break;
                }// end the if statment 
                // end the if for ask the Tranier Does he want to know what his worhouts are or not?
                if ("no".equalsIgnoreCase(answer) || "No".equals(answer)) {
                    System.out.println("you can follow your work , good luck and have a nice day");
                    //  This means that he does not want to know what exercises he should do
                    break;
                }// end the while loop
                // if user enter any words or number except yes or no , print this massage
                System.out.println("what do you mean by " + answer + " , please anwser \"yes\" or \"no\" ");
                System.out.print("Please try again");
                answer = input.next();
                // end the if for range
                //end while loop
            }

        } //end the if for condition of range ID 
        // if the ID does not exist 
        else {
            System.out.println("Sorry , we couldn't find your ID , make sure from your Id");
        }

        //-----------------------------------------------------------------------
    }

} ///end the class