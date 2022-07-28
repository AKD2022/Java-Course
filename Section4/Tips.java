import java.util.Scanner;

public class Tips {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");

        System.out.println("How much percent do you want to pay in tips?!");
        double percentTips = scan.nextDouble();


        tips(bill, percentTips);
    
       scan.close();
    }

    public static void tips(double bill, double percentTips){
        percentTips = percentTips * 0.01;
        System.out.println("You payed the waiter: " + (bill * percentTips) + " in tips");
    }
} 