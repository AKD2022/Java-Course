import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your length: ");
        double length = scan.nextDouble();

        System.out.println("What is your width: ");
        double width = scan.nextDouble();
        measureRectangle(length, width);

        scan.close();
    }

    public static void measureRectangle(double length, double width){
        double area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }

}