package app;

public class App {
    public static void main(String[] args) throws Exception {
        Mustang m1 = new Mustang();
        m1.noOfSeats = 4;
        Man man = new Man();
        man.car = m1;
        man.goTOMarket();
    }
}

interface Vehicle {

    void drive();
}

class Mustang implements Vehicle {

    int noOfSeats;

    @Override
    public void drive() {
        System.out.println("I am driving a Mustang having " + noOfSeats + " seats");
    }

}

class Man {
    Vehicle car;

    void goTOMarket() {
        System.out.println("I am going to the market");
        car.drive();
    }
}