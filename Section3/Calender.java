
public class Calender {
    public static void main(String[] args) {
        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        switch (day) {
            case "Monday": System.out.println("Sorry, I'm busy!"); break;
            case "Tuesday": System.out.println("Sorry I have to walk my fish!"); break;
            case "Wednesday": System.out.println("I'm not sure, I might be busy. I'll text you later!"); break;
            case "Thursday": System.out.println("Yeah, i'm free!"); break;
            case "Friday": System.out.println("Sorry, I sleep the whole day!"); break;
            case "Saturday": System.out.println("I watch movies the whole day!"); break;
            case "Sunday": System.out.println("I'm free!"); break;
            default: System.out.println("Since when was that a day?");
        }

    }
}
