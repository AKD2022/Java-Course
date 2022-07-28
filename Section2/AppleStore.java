public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profitMade = 0;
        double price = 0.40;


        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples = 500;
        
        System.out.println("Time for business! You're selling each apple for 40 cents");


        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples = numOfApples - 4;
        numOfCustomers = 1;
        profitMade = price * 4;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples = numOfApples - 4 - 20;
        numOfCustomers = numOfCustomers + 1;
        profitMade = price * 20 + price * 4;

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples = numOfApples - 4 - 20 - 200;
        numOfCustomers = numOfCustomers + 1;
        profitMade = price * 4 + price * 4 + price * 200;

        System.out.println("Wow! So far, you made: $" + profitMade + "!");
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " +  numOfApples +  " apples left. We'll sell more tomorrow!");




    }

}
