

public class CarMain {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
            new Car("Nissan", 5000, 2020, "Red", new String[] {"Tires", "Keys"}),
            new Car("Dodge", 8500, 2019, "Black", new String[] {"Tires", "Keys"}),
            new Car("Nissan", 5000, 2017, "Yellow", new String[] {"Tires", "Filters"}),
            new Car("Honda", 7000, 2017, "Orange", new String[] {"Tires", "Filters"}),
            new Car("Mercedes", 12000, 2015, "Jet Black", new String[] {"Tires", "Filters", "Transmission"}),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println(dealership);

   

    }

    

}
