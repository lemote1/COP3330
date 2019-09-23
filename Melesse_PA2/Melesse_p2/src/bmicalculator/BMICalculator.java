package bmicalculator;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double pounds;
		double inches;
		double kilograms;
		double meters;
		double BMI;
		
		System.out.println("Select which method of BMI calculation you prefer: \n1. Imperial \n2. Metric");
		int method = scnr.nextInt();
		
		if (method == 1)
		{
			System.out.println("Weight in pounds:");
			pounds = scnr.nextDouble();
			
			System.out.println("Height in inches:");
			inches = scnr.nextDouble();
		
			BMI = (703 * pounds) / (inches * inches);
			System.out.printf("%.1f\n", BMI);
			System.out.println();
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		
		else if (method == 2)
		{
			System.out.println("Weight in kilograms:");
			kilograms = scnr.nextDouble();
			
			System.out.println("Height in meters:");
			meters = scnr.nextDouble();
			
			BMI = (kilograms) / (meters * meters);
			System.out.printf("%.1f\n", BMI);
			System.out.println();
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		
		else
		{
			System.out.println("Invalid selection");
		}
		

		
	}

}
