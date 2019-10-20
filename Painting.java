import java.util.Scanner;

public class Painting
{
     public static Scanner Keyboard = new Scanner(System.in);

     public static double promptDouble(String n)
     {
	System.out.println(n);
	return Keyboard.nextDouble();
     }   
     public static double perimeter(double length, double width)
     {
	return 2 * (length + width);
     }
     public static double area(double length, double width)
     {
	return length * width;
     }
     public static void main(String[] args)
     {
	double width, length, wallArea, ceilingArea;
	final double HEIGHT = 8;
	
	System.out.println("Calculation of Paint Requirements");

	length = promptDouble("Enter room length: ");
	width = promptDouble("Enter a room width: ");

	wallArea = perimeter(length, width) * HEIGHT;
	ceilingArea = area(length, width);

	System.out.println("The wall area is " + wallArea + " square feet.");
	System.out.println("The ceiling area is " + ceilingArea + " square feet.");
     }
}
