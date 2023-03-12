import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.println("This is a Quiz about the Philadelphia Eagles!");


        //Question One
        System.out.println("\n1: How many superbowls have the Eagles won? (type 'a', 'b', 'c', or 'd')");
        System.out.println("     a) 3");
        System.out.println("     b) 2");
        System.out.println("     c) 4");
        System.out.println("     d) 1");

        String questionOne = scan.nextLine();

        if (questionOne.contains("d")) {
            total = total + 5;
        }

        //Question Two
        System.out.println("\n2: How many times have the eagles been in the superbowl? (type 'a', 'b', 'c', or 'd')");
        System.out.println("     a) 3");
        System.out.println("     b) 2");
        System.out.println("     c) 4");
        System.out.println("     d) 1");

        String questionTwo = scan.nextLine();

        if (questionTwo.contains("a")) {
            total = total + 5;
        }


        //Question Three
        System.out.println("\n3: Who was the MVP of the 2017 superbowl? (type 'a', 'b', 'c', or 'd')");
        System.out.println("     a) Alshon Jeffery");
        System.out.println("     b) Jalen Hurts");
        System.out.println("     c) Devonta Smith");
        System.out.println("     d) Nick Foles");

        String questionThree = scan.nextLine();

        if (questionThree.contains("d")){
            total = total + 5;
        }

        //Question Four
        System.out.println("\n4: Who were the Eagles playing in the 2017 superbowl? (type 'a', 'b', 'c', or 'd')");
        System.out.println("     a) Patriots");
        System.out.println("     b) They didn't play in it!");
        System.out.println("     c) Bills");
        System.out.println("     d) Chiefs");

        String questionFour = scan.nextLine();

        if (questionFour.contains("a")) {
            total = total + 5;
        }

        //Question Five
        System.out.println("\n5: Who is the Eagles current quarterback  (type 'a', 'b', 'c', or 'd')");
        System.out.println("     a) Nick Foles");
        System.out.println("     b) Jalen Hurts");
        System.out.println("     c) Carson Wentz");
        System.out.println("     d) Tom Brady");
        
        String questionFive = scan.nextLine();

        if (questionFive.contains("b")){
            total = total + 5;
        }

        System.out.println("You got a " + total + "/20!");



    





        scan.close();
    }
}
