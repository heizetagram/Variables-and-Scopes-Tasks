/*
Donald's nephews (metoder)
*/

import java.util.Random;

public class Opg3 {
    public static void main(String[] args) {
        new Opg3().run(); //Creates new instance of 'Opg3' class that invokes 'run' method.
    }

    public void run() {
        Random random = new Random(); //Creates Random var
        int n = 0; //Creates int var with value 0

        for (int i = 0; i < 25; i++) { //Creates a for loop, that has to keep running until value of 'i' hits 25, and after each iteration, the value gets updated by +1.
            while(n < 3) { //While value of 'n' is less than 3, run the following code
                int randomNumber = random.nextInt(3); //Creates an int var that takes a random number between 0-2
                switch (randomNumber) { //Creates a switch statement for 'randomNumber'
                    case 0 -> { //If value of 'randomNumber' equals 0, run the following
                        if (n == 0) { //If the value of 'n' is 0, which is the first word, invoke the method
                            rip(); //Invokes method
                        } else if (n == 1) { //If value of 'n' is 1, which is the second word, print the following
                            System.out.print(", "); //Adds a comma before invoking method
                            rip(); //Invokes method
                        } else { //Else if the value isn't 0 or 1, it's 2, which is the third word. Then print the following
                            System.out.print(" og "); //Adds 'og' before invoking method
                            rip(); //Invokes method
                        }
                        n++; //Adds +1 to the value of 'n'
                    }
                    case 1 -> { //Same process as above ^, instead it's when 'randomNumber' == 1
                        if (n == 1) {
                            System.out.print(", ");
                            rap();
                        } else if (n == 2) {
                            System.out.print(" og ");
                            rap();
                        } else {
                            rap();
                        }
                        n++;
                    }
                    case 2 -> { //Same process as above ^, instead it's when 'randomNumber' == 2
                        if (n == 1) {
                            System.out.print(", ");
                            rup();
                        } else if (n == 2) {
                            System.out.print(" og ");
                            rup();
                        } else {
                            rup();
                        }
                        n++;
                    }
                } //Switch case end
            } //While loop end
            System.out.println(); //Prints a new line after each while loop iteration
            n = 0; //Sets value of n to 0, or else it would always stay 3, once the while loop has ended.
        } //For loop end
    } //Method end

    //////////////////////

    public void rip() { //Creates a void method
        System.out.print("Rip"); //Prints...
    }

    public void rap() { //Creates a void method
        System.out.print("Rap"); //Prints...
    }

    public void rup() { //Creates a void method
        System.out.print("Rup"); //Prints...
    }
}
