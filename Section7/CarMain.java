

public class CarMain {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
            new Car("Nissan", 5000, 2020, "Red", new String[] {"Tires", "Keys"}),
            new Car("Dodge", 11000, 2019, "Black", new String[] {"Tires", "Keys"}),
            new Car("Nissan", 5000, 2017, "Yellow", new String[] {"Tires", "Parts"})
        };


        // nissan.setColor("Jet Black");
        // dodge.setColor("Jet Black");

        // nissan.setPrice(nissan.getPrice()/2);
        // dodge.setPrice(dodge.getPrice()/2);



        // nissan.drive();
        // dodge.drive();
        // nissan2.drive();
        Dealership dealership = new Dealership();

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        dealership.sell(2);
        System.out.println(dealership.search("Dodge", 10000));

    }

    

}
