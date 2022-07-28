import java.util.Scanner;

public class RockPapersScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.nextLine();

        if (answer.contains("y")) {
            System.out.println("Great!");
            System.out.println("Rock..... Paper........ Scissors.... shoot! (type one)"); 
            String yourChoice = scan.nextLine();
        
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);
        
        
        }    
    /*//
       • if the answer is yes: 
             – print: Great!
             – print: rock – paper – scissors, shoot!
             – pick up user's choice.
             – get the computer choice (can only be done after task 3).
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).

       • else:
             – print: Darn, some other time...!        
    */
              else {
                System.out.println("I guess some other time then :(");
              }

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */

    public static String computerChoice() {
        double number = Math.random() * 3;
        int integer = (int) number;

        
        switch (integer) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";  //default case not possible.
        }

    }


    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   1. result is "You win" if:
     * 
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     * 
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     * 
     *   3. result is "It's a tie" if:
     * 
     *       your choice equals computer choice.
     *   
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        }   else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        }  else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } 
        //Capitals
        else if (yourChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            result = "You win!";
        } else if (yourChoice.equals("Rock") && computerChoice.equals("Paper")) {
            result = "You lose!";
        } else if (yourChoice.equals("Paper") && computerChoice.equals("Rock")) {
            result = "You win!";
        } else if (yourChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            result = "You win!";
        }   else if (yourChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            result = "You lose!";
        }  else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie!";
        }  
        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

     public static String printResult(String yourChoice, String computerChoice, String result) {

        System.out.println("\nYou chose:\t " + yourChoice + ". I chose:\t " + computerChoice);
        System.out.println("With that being said.......");
        System.out.println(result);


        return result;
     }

}

