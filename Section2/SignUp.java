import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter your first name: ");
        String firstName = scan.nextLine();
        
        System.out.println("\nEnter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("\nEnter your age: ");
        String age = scan.nextLine();

        System.out.println("\nEnter your city: ");
        String city = scan.nextLine();

        System.out.println("\nEnter your country: ");
        String country = scan.nextLine();

        System.out.println("\nCreate a username: ");
        String username = scan.nextLine();



        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        System.out.println("Your JavaGram information");

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);

        scan.close();
    }
}