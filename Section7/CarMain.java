import java.util.Scanner;
import java.util.concurrent.DelayQueue;

public class CarMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner (System.in);

        Car[] cars = new Car[]{
            new Car("Nissan", 5000, 2020, "Red", new String[] {"Tires", "Keys"}),
            new Car("Dodge", 8500, 2019, "Black", new String[] {"Tires", "Keys"}),
            new Car("Nissan", 5000, 2017, "Yellow", new String[] {"Tires", "Filters"}),
            new Car("Honda", 7000, 2017, "Orange", new String[] {"Tires", "Filters"}),
            new Car("Mercedes", 12000, 2015, "Jet Black", new String[] {"Tires", "Filters", "Transmission"}),
            new Car("Bentley", 120000, 2022, "Jet Black", new String[] {"Tires", "Filters", "Transmission", "Mats"}),
            new Car("Cadilac", 85000, 2019, "Black", new String[] {"Tires", "Filters", "Transmission", "Mats"}),
            new Car("Mercedes", 30000, 2021, "Navy Blue", new String[] {"Tires", "Filters", "Transmission", "Mats"}),
            new Car("Audi", 75000, 2022, "Navy Black", new String[] {"Tires", "Filters", "Transmission", "Mats", "Drivers Kit"}),
            new Car("Toyota", 25000, 2022, "White", new String[] {"Tires", "Filters", "Transmission"}),
            new Car("Ford", 20000, 2015, "Red", new String[] {"Tires", "Filters", "Transmission"}),
            new Car("Chevy", 25000, 2015, "Blue", new String[] {"Tires", "Filters", "Transmission"}),
            new Car("Mitshubishi", 38000, 2015, "Tan", new String[] {"Tires", "Filters", "Transmission"}),
            new Car("Hyundai", 45000, 2015, "Navy Black", new String[] {"Tires", "Filters", "Transmission", "Mats", "Drivers Kit"}),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();

        int car = dealership.search(make, budget);


       if (car == 404) {
        Thread.sleep(1000);
        System.out.println("Feel free to search through our database!: ");
        Thread.sleep(1000);
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
