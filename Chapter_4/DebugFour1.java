import java.util.Scanner;

public class DebugFour1 { 


       public static void main(String[] args) 
       {
        Scanner input = new Scanner(System.in);

        int radius;
        
        DebugCircle c = new DebugCircle(1);
        System.out.print("Enter a radius for a circle >> ");
         radius = input.nextInt();
         
        System.out.println("The radius is " + c.getRadius());
        System.out.println("The diameter is " + c.getDiameter());
        System.out.println("The area is " + c.getArea());
    }
}
