package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Mustang m1 = new Mustang();
        m1.noOfSeats = 4;
        m1.drive();
        Mustang m2 = new Mustang();
        m2.noOfSeats = 6;
        m2.drive();
    }
}

class Mustang {
    int noOfWheels;
    int noOfSeats;

    void drive() {
        System.out.println("I am driving a Mustang having " + noOfSeats + " seats");
    }
}