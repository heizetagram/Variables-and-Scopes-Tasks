/*
TV Channels (variabler og scope)
 */

import java.util.Scanner;

public class Opg4 {
    public static void main(String[] args) {
        new Opg4().run(); //Creates a new instance of 'Opg4' class and calls its 'run' method.
    }

    public void run() { //Creates a new void method
        Scanner scan = new Scanner(System.in); //Creates a new Scanner var

        System.out.println("Which channel do you want to watch? \nDR, TV2, or MTV"); //Prints...
        String input = scan.nextLine().toLowerCase().strip(); //Creates String var that prompts for user String input, lowercases it and strips it from whitespaces

        if (input.equals("dr")) { //If user input is 'dr'
            Dr(); //Invoke method 'Dr'
        } else if (input.equals("tv2")) { //Else if user input is 'tv2'
            Tv2(); //Invoke method 'Tv2'
        } else if (input.equals("mtv")) { //Else if user input is 'mtv'
            Mtv(); //Invoke method 'Mtv'
        } else { //Else print the following:
            System.out.println("Invalid channel");
        }
    }

///////////////////////////////////////////////////////////////////////////////

    public void Dr() { //Creates void method
        System.out.println("You're watching the news on DR."); //Prints...
    }

    public void Tv2() { //Creates void method
        System.out.println("You're watching the Matrix on TV2."); //Prints...
    }

    public void Mtv() { //Creates void method
        System.out.println("You're watching Music Awards 2023 on MTV."); //Prints...
    }
}
