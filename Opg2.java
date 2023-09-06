/*
Print my names (metoder)
 */

public class Opg2 {
    public static void main(String[] args) {
        new Opg2().run(); //Creates new instance of 'Opg6' class that invokes 'run' method.

    }

    public void run() { //Creates void 'run' method
        //First combination
        System.out.print("Combination 1: ");
        printFirstName();
        System.out.print(" ");
        printMiddleName();
        System.out.print(" ");
        printLastName();

        //Second combination
        System.out.print("\nCombination 2: ");
        printLastName();
        System.out.print(", ");
        printFirstName();
        System.out.print(" ");
        printMiddleName();

        //Third combination
        System.out.print("\nCombination 3: ");
        printFirstName();
        System.out.print(" (");
        printMiddleName();
        System.out.print(") ");
        printLastName();
    }
    public void printFirstName() { //Creates void method
        System.out.print("David");
    }

    public void printMiddleName() { //Creates void method
        System.out.print("JavaMaster");
    }

    public void printLastName() { //Creates void method
        System.out.print("Lu");
    }
}
