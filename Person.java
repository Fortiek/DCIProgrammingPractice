package DCI.Java.BMICalcPrac;

public class Person {
    
    //person attributes with get/set

    //full first and last name values and handling
    private String firstName, lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    private char middleInitial;
    public char getMiddleInitial(){
        return middleInitial;
    }
    public void setMiddleInitial(char newInitial){
        this.middleInitial = newInitial;
    }

    private int age, feet, inches; //taking advantage of multiple declarations: does make code harder to read though
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }

    private double weight;
    public double getWeight(){
        return weight;
    }
    public void setWeight(double newWeight){
        this.weight = newWeight;
    }

    
    public int getHeightFeet(){
        return feet;
    }

    //try to make set only **won't work, need to get stats from main**
    public void setHeightFeet(int newHeightFeet){
        this.feet = newHeightFeet;
    }

    
    public int getHeightInches(){
        return inches;
    }

    
    public void setHeightInches(int newHeightInches){
        this.inches = newHeightInches;
    }

    //method for calculating BMI
    void calculateBMI(){
        //First get total height
        int totalHeight = (this.feet * 12) + this.inches;

        //Calculate BMI
        double BMI = (this.weight * 703) / (totalHeight * totalHeight);

        //placeholder for the BMI_level variable
        String BMI_level = new String();

        if(BMI < 18.5){
            BMI_level = "Underweight.";
        } else if (BMI >= 18.5 && BMI <= 24.9){
            BMI_level = "Normal.";
        } else if (BMI > 24.9 && BMI <= 29.9){
            BMI_level = "Overweight.";
        } else if (BMI > 29.9){
            BMI_level = "Obese.";
        } else {
            System.out.println("Something went wrong.");
        }

        String callBack = firstName + " " + Double.toString(BMI) + ": " + BMI_level;

        System.out.println(callBack);
    }

    //constructor overloads for practice
    Person(String fName, String lName, double weight, int hFeet, int hInches){
        this.firstName = fName;
        this.lastName = lName;
        this.weight = weight;
        this.feet = hFeet;
        this.inches = hInches;
    }

    Person(String fName, char midInitial, double weight, int hFeet, int hInches){
        this.firstName = fName;
        this.middleInitial = midInitial;
        this.weight = weight;
        this.feet = hFeet;
        this.inches = hInches;
    }

    Person(String fName, String lName, char midInitial, double weight, int hFeet, int hInches, int Age){
        this.firstName = fName;
        this.lastName = lName;
        this.middleInitial = midInitial;
        this.weight = weight;
        this.feet = hFeet;
        this.inches = hInches;
        this.age = Age;
    }

    //Need to specify a default constructor with the others present or it breaks the program.
    Person(){}

}
