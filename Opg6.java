/*
Fitness center subscription (returværdier)
 */

import java.util.Scanner;

public class Opg6 {
    public static void main(String[] args) {
        new Opg6().run(); //Creates new instance of 'Opg6' class that invokes 'run' method.

    }

    //----------------RUN METHOD----------------\\
    public void run() { //Creates a new void method
        Scanner scan = new Scanner(System.in); //Creates a new Scanner method
        int standardPrice = 300; //Creates int var

        System.out.println("Do you have a gym membership?"); //Prints...
        String userMember = scan.nextLine().toLowerCase().strip(); //Creates string var that prompts user for string input, lowercases it, then strips it of whitespaces
        int isMember = hasMembership(userMember); //Creates int var that has the value of the invoked method 'hasMembership'


        System.out.println("Membership options: \nStandard, Student, or Pensioner "); //Prints...
        String userMembership = scan.nextLine().toLowerCase().strip(); //Creates string var that prompts user for string input, lowercases it, then strips it of whitespaces
        double finalPrice = membership(userMembership, standardPrice); //Invokes method 'membership' that takes two arguments: user input ^ and 'standardPrice' and creates a double var of the result


        System.out.println("\nWhat is your birth month? (1-12)"); //Prints...
        int userBirthMonth = scan.nextInt(); //Creates int var that prompts user for int input
        birthMonth(userBirthMonth, finalPrice); //Invokes 'birthMonth' method, that takes two arguments; user input^ and the new standard price of the membership



        System.out.println("\nWhich month would you like to start your membership? (1-12)"); //Prints...
        int userCurrentMonth = scan.nextInt(); //Creates int var that prompts user for int input
        int finalMonth = threeMonths(userCurrentMonth, finalPrice); //Invokes method 'threeMonths that takes two arguments, and saves the 'current month' value as a new integer var.


        sixMonths(finalMonth, finalPrice); //Invokes method 'sixMonths' that takes two arguments
        annual(finalMonth, finalPrice); //Invokes method 'annual' that takes two arguments
    }


    //----------------DISCOUNT METHODS----------------\\
    public double student(double finalPrice) { //Creates a double class with a single parameter
        return finalPrice * 0.6; //Returns 'finalPrice' 40% off as a double
    }

    public double pensioner(double finalPrice) { //Creates a double class with a single parameter
        return finalPrice * 0.8; //Returns 'finalPrice' with 20% off as a double
    }

    public double birthMonthDiscount(double finalPrice) { //Creates a double class with a single parameter
        return finalPrice * 0.85; //Returns 'finalPrice' with 15% off as a double
    }

    public double threeMonthDiscount(double finalPrice) { //Creates a double class with a single parameter
        return finalPrice * 0.95; //Returns 'finalPrice' with 5% off as a double
    }

    public double sixMonthDiscount(double finalPrice) { //Creates a double class with a single parameter
        return finalPrice * 0.9; //Returns 'finalPrice' with 10% off as a double
    }

    public double annualDiscount(double finalPrice) { //Creates a double class with a single parameter
        return finalPrice * 0.75; //Returns 'finalPrice' with 25% off as a double
    }


    //----------------ALREADY MEMBER METHOD----------------\\
    public int hasMembership(String userInput) { //Creates an int class with a single parameter
        int hasMembership = 0; //Creates an int var

        if (userInput.equals("yes")) { //If user input is 'yes', update 'hasMembership's value
            hasMembership = 1;
        }

        if (hasMembership == 1) { //If 'hasMembership' equals 1, invoke the following method
            activeMember();
        }
        return hasMembership; //Then returns the value of hasMembership as an int
    }

    //----------------MEMBERSHIP TYPE METHOD----------------\\
    public double membership(String membership, int price) { //Creates a double class with two parameters
        double finalPrice = 0.0; //Creates a double var

        switch (membership) { //Creates a switch-case, if user string input is:
            case "standard" -> { //Then print the following, and update the value of 'finalPrice'
                System.out.printf("A standard membership is %d kr.", price);
                finalPrice = 300;
            }
            case "student" -> { //Then print the following, and update the value of 'finalPrice'
                System.out.printf("A student gets 40%% off, so your price is %.0f kr.", student(price));
                finalPrice = student(price);
            }
            case "pensioner" -> { //Then print the following, and update the value of 'finalPrice'
                System.out.printf("A pensioner gets 20%% off, so your price is %.0f kr.", pensioner(price));
                finalPrice = pensioner(price);
            }
        } return finalPrice; //Return the value of 'finalPrice' as a double
    }


    //----------------EXTENSION METHOD----------------\\
    public void activeMember() { //Creates a void method
        Scanner scan = new Scanner(System.in); //Creates a Scanner var

        System.out.println("Is your membership active?"); //Prints...
        String userActive = scan.nextLine().toLowerCase().strip(); //Creates a string var that prompts for user String input

        if (userActive.equals("yes")) { //If user answered 'yes' end the code
            System.exit(0);
        } else if (userActive.equals("no")) { //Else if the user answered no, print the following... and end the code
            System.out.println("Your price is 25 kr. per month");
            System.exit(0);
        }
    }


    //----------------MONTH METHODS----------------\\
    public String intToMonth(int month) {
        String monthName = "";
        switch (month) {
            case 1, 13 -> { //13 is added, because some methods require using the same month since the month scale doesn't return to 1 after 12. Same rules apply for the following cases...
                return "January";
            }
            case 2, 14 -> {
                return "February";
            }
            case 3, 15 -> {
                return "March";
            }
            case 4, 16 -> {
                return "April";
            }
            case 5, 17 -> {
                return "May";
            }
            case 6, 18 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
        }
        return monthName; //Returns the 'monthName' as a String
    }


    public void birthMonth(int month, double finalPrice) { //Creates a void method with two parameters, and prints the following...
        System.out.printf("Next %s, you will receive a 15%% discount, bringing the membership cost down to %.0f kr. that month.", intToMonth(month), birthMonthDiscount(finalPrice));
    }

    public int threeMonths(int month, double finalPrice) { //Creates an int method with two parameters
        int finalMonth; //Creates an int var
        System.out.printf("Three months later, in %s, you will receive a 5%% discount on your membership, reducing the cost to %.0f kr.", intToMonth(month + 3), threeMonthDiscount(finalPrice));
        finalMonth = month; //Makes user input's month, the 'final' month
        return finalMonth; //Returns 'finalMonth' as an int
    }


    public void sixMonths(int finalMonth, double finalPrice) { //Creates a void method with two parameters and prints the following...
        System.out.printf("%nThen, starting %s, your discount increases to 10%%, and the membership will cost %.0f kr. thereafter.", intToMonth(finalMonth + 6), sixMonthDiscount(finalPrice));
    }


    public void annual(int finalMonth, double finalPrice) { //Creates a void method with two parameters and prints the following...
        System.out.printf("%nBeginning next year, your membership will be priced at %.0f kr. every %s.", annualDiscount(finalPrice), intToMonth(finalMonth));
    }

} //Main ends
