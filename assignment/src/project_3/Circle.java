package project_3;
import java.util.Scanner;
public class Circle {
	 private double radius;
	 private String colour;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	 public void getInput() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the circle: ");
	        setRadius(scanner.nextDouble()); 
	        scanner.nextLine();  
	        System.out.print("Enter the colour of the circle: ");
	        setColour(scanner.nextLine());  
	    }	    
	    public double calculateArea() {
	        
	        return Math.PI * radius * radius;
	    }
	    	    public void displayDetails() {
	        System.out.println("\nCircle Details:");
	        System.out.println("Radius: " + getRadius());  
	        System.out.println("Colour: " + getColour());  
	        System.out.printf("Area: %.2f\n", calculateArea());  
	    }

}
