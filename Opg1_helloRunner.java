/*
Hello, Runner! (Metoder)
 */

public class Opg1_helloRunner {
    public static void main(String[] args) {
        new Opg1_helloRunner().run(); //Creates new instance of 'Opg1' class that invokes 'run' method.
    }

    public void run() { //Creates void method
        helloRunner(); //Invokes method 'helloRunner'
    }

    public void helloRunner () { //Creates void method
        System.out.println("Hello, Runner!"); //Prints...
    }
}

