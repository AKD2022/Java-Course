import java.util.Scanner;

public class Grocers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] store = {" ", "apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        String[] store2 =  {" ", "Apples", "Bananas", "Candy", "Chocolate", "Coffee", "Tea"};

        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String item = scan.nextLine(); 

        
        for (int i = 0; i < store.length; i++) {
          /* Task 2  
                if element equals user's response  {
                    println: \nWe have that in aisle:  <index>
                    break;
                }
          */

          if (store[i].equals(item) || store2[i].equals(item)) {
            System.out.println("We have that in aile " + i);
            break;
          }

          else {
            System.out.println("Sorry, we don't have those!");
          }
        }


        scan.close();
    }
}
