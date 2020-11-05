import java.util.Scanner;
import java.lang.Math;

class MathClassesExample {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner (System.in);
   
    System.out.println("Please enter 2 ints: ");
    int x = scan.nextInt();
    int y = scan.nextInt();
    
    System.out.println("Please enter 2 doubles: ");
    double a = scan.nextDouble();
    double b = scan.nextDouble();
    
    System.out.println("Answers: ");
    System.out.println(Math.abs(x - y));
    System.out.println(Math.abs(a - b));

    }
}