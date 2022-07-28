public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1. Square\n2. Rectangle\n3.  Triangle\n4. Circle\n");
        
    



        //Task 5 – Call area functions.
        double square = areaSquare(2);
        double rectangle = areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);

        

        printAreas(square, rectangle, triangle, circle);

    }

    
    public static double areaSquare(double side) {
        
        if (side < 0) {
            System.out.println("Not possible area");
        } 

        double area = side * side;
        return area;
    }


   
    public static double areaRectangle(double length, double width) {
        if (width < 0 || length < 0){
            System.out.println("Not possible area");
        }

        double area = length * width;
        return area;  
    } 

   
    public static double areaTriangle(double base, double height) {
        if (base < 0 || height < 0){
            System.out.println("Not possible area");
        }

        double area = (base * height)/2;
        return area;
    }

    
    public static double areaCircle(double radius) {
        if (radius < 0) {
            System.out.println("Area not possible");
        }

        double area = (radius * radius) * 3.14;
        return area;
    }



     public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("Square area: " + square);
        System.out.println("Rectangle area: " + rectangle);
        System.out.println("Triangle area: " + triangle);
        System.out.println("Circle area: " + circle);
     }


}
