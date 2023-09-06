/*
BMI Calculator (argumenter og parametre)
 */

import java.util.Scanner;

public class Opg5_BMICalculator {
    public static void main(String[] args) {
        new Opg5_BMICalculator().run(); //Creates new instance of 'Opg5' class that invokes 'run' method
    }

    public void run() { //Creates void run method
        Scanner scan = new Scanner(System.in); //Creates new Scanner var

        System.out.println("What is your height in cm?"); //Prints...
        int cmRun = scan.nextInt(); //Creates int var that prompts for user int input
        double mRun = cmRun * 0.01; //Creates double var that converts user input from cm to m

        System.out.println("What is your weight in kg?"); //Prints...
        double kgRun = scan.nextDouble(); //Creates double var that prompts user for double input


        System.out.printf("Your BMI is %.2f and ", calculateBmi(kgRun, mRun)); //Prints formatted string with the value of the calculated BMI with 2 decimals.


        if (calculateBmi(kgRun, mRun) < 18.5){ //If value of BMI is less than 18.5, print the following
            System.out.print("you're underweight");
        } else if (calculateBmi(kgRun, mRun) >= 18.5 && calculateBmi(kgRun, mRun) < 25) { //If value of BMI is between 18.15-24.9, print the following
            System.out.print("you're normal weight");
        } else if (calculateBmi(kgRun, mRun) >= 25 && calculateBmi(kgRun, mRun) < 30)  { //If value of BMI is between 25-29.9, print the following
            System.out.print("you're overweight");
        } else { //Else if it's 30 and above, print the following
            System.out.print("you're very overweight");
        }
    }

    ////////////////////////////////////////////////

    public double calculateBmi(double kg, double m) { //Creates a double method that takes two double parameters
        return kg / (m * m); //Calculates BMI, and returns result as a double
    }
}
