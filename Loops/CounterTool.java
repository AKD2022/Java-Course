import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("What do you want to count by?: ");
        int counter = scan.nextInt();

        System.out.print("Pick a number to start counting from?: ");
        int startingNumber = scan.nextInt();

        System.out.print("What number do you want to stop the counting?: ");
        int stoppingNumber = scan.nextInt();
        /* 


          1.   print : Pick a number to count by:
               pick up the user's answer
        
          2.   print : Pick a number to start counting from:
               pick up the user's answer

          3.    print : Pick a number to count to:
                pick up the user's answer 
                
        */
        

      /* Task 2 – Create a for loop that:
            1. starts from the second number.
            2. stops at the third number. 
            3. counts in steps of the first.
      */

      for (int i = startingNumber; i <= stoppingNumber; i += counter) {
        System.out.print(i + " ");
      }

        scan.close();
    }
}
