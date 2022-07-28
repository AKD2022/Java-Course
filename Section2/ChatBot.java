import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("\nHi! I am the chat bot. What is your name?");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + " what's your age? (don't worry, not stealing any info)");
        int age = scan.nextInt();

     
        int chatBotAge = 1000;
        System.out.println("\nWow, your " + age + "!! I am " + chatBotAge + "! I'm " + (chatBotAge/age) + " times older than you");

        System.out.println("\nWell I liked this chat, I hope you did too. Talk to you later!");
      

        
















        scan.close();
    }
}
