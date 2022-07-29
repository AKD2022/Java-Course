import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class CarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        Car[] cars = new Car[]{
            new Car("Nissan", 5000, 2020, "Red", new String[] {"Tires", "Keys"}),
            new Car("Dodge", 8500, 2019, "Black", new String[] {"Tires", "Keys"}),
            new Car("Nissan", 5000, 2017, "Yellow", new String[] {"Tires", "Filters"}),
            new Car("Honda", 7000, 2017, "Orange", new String[] {"Tires", "Filters"}),
            new Car("Mercedes", 12000, 2015, "Jet Black", new String[] {"Tires", "Filters", "Transmission"}),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();

        int car = dealership.search(make, budget);


       if (car == 404) {
        System.out.println("Feel free to search through our database!: ");
        System.out.println(dealership);
       } else {
        String decision = scan.nextLine();
        if (decision.equalsIgnoreCase("yes")) {
            dealership.sell(car);
        }
       }



        scan.close();
    }

    

}
