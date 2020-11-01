package DCI.Java.BMICalcPrac;
import java.util.Scanner;

class Fitness{
    public static void main(String[] args) {
        
            //Welcome page, get info and call constructors based on input

            System.out.println("Welcome to the BMI calculator! Please enter the following:");

            /*
            ********************************************************

            Initial lines are about opening up a Scanner object to record
            user input and store them to local variables that will be set
            to the private variables of the Person class

            ********************************************************
            */
            Scanner scanObj = new Scanner(System.in);

            //instantiate Person object with default constructor
            var person = new Person();
            
            System.out.println("Please enter your first name and hit Enter:");

            String userFirst = scanObj.nextLine();
            while(userFirst.length() == 0){
                System.out.println("Sorry, you need to enter your first name:");
                userFirst = scanObj.nextLine();
            }

            System.out.println("Thank you, now enter your last name, or just hit Enter if you'd rather not provide it:");
            String userLast = scanObj.nextLine();
            
            /*
            *************************************************

            This block will need to be able to accept no input
            but no more than 1 character value, which will need
            to be grabbed with "middleInitialPlaceholder.charAt(0)"
            to be stored properly

            *************************************************
            */
            char middleInitial = ' ';

            System.out.println("Now enter your middle initial, if you don't want to provide, just hit space then enter:");
            String middleInitialPlaceholder = scanObj.nextLine();

            try{ //The try\catch may be no longer needed, was getting exception trying to take an empty string before
                while(middleInitialPlaceholder.length() != 1 && middleInitialPlaceholder.length() !=0){
                    System.out.println("Sorry, but you need to enter JUST the one letter initial or leave it blank:");
                    middleInitialPlaceholder = scanObj.nextLine();
                    
                    if(middleInitialPlaceholder.length() > 0){
                        middleInitial = middleInitialPlaceholder.charAt(0);
                    }
                }
            }  catch(StringIndexOutOfBoundsException e){
                System.out.println("Try again. If you don't want to provide middle initial, hit SPACE then ENTER:");
                middleInitialPlaceholder = scanObj.nextLine();
            } 

            System.out.println("Now enter your height in feet:");
            int userHeight = scanObj.nextInt();

            System.out.println("Now enter any remaining inches:");
            int userHeightInches = scanObj.nextInt();

            System.out.println("Next, enter your weight:");
            double userWeight = scanObj.nextDouble();

            System.out.println("Finally, enter your age:");
            int userAge = scanObj.nextInt();

            /*test
            // midTest = String.valueOf(middleInitial);
            System.out.println(userFirst);
            System.out.println(userLast);
            System.out.println(middleInitial);
            System.out.println(userAge);
            System.out.println(userHeight);
            System.out.println(userHeightInches);
            System.out.println(userWeight);
            end test*/

            person.setFirstName(userFirst);
            person.setHeightFeet(userHeight);
            person.setHeightInches(userHeightInches);
            person.setWeight(userWeight);

            //now for the optionals
            if(!userLast.isEmpty()){
                person.setLastName(userLast);
            }
            if(middleInitialPlaceholder.length() == 1){
                person.setMiddleInitial(middleInitial);
            }
            if(userAge > 0 && userAge < 120){
                person.setAge(userAge);
            } else {
                System.out.println("WE'VE GOT A VAMPIRE!! Calling the feds...");
            }

            //call the calculateBMI() method of Person
            person.calculateBMI();
            

            //Need to close the scanner object for program to run
            scanObj.close();

            //Test other constructors
            Person person1 = new Person("Tom", 'H', 152.2, 5, 6);
            Person person2 = new Person("Leslie", "Knope", 'K', 122.9, 4, 11, 32);
            Person man = new Person("Ron", "Swanson", 222.2, 6, 0);
            Person woman = new Person("April", "Ludgate", 110.5, 5, 5);

            person1.calculateBMI();
            person2.calculateBMI();
            man.calculateBMI();
            woman.calculateBMI();
    }
}
