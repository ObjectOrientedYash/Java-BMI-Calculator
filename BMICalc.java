import java.util.*;
import java.text.*;
public class BMICalc{
	final static double KG_TO_LBS = 2.20462;
	final static double M_TO_IN = 39.3701;
	private static DecimalFormat TWO_DECIMAL_PLACES = new DecimalFormat(".##");
	public static void main(String[] args) {
		double height, weight;
		System.out.println("The BMI Calculator by yash shukla");		
		System.out.println();
		Scanner askUser= new Scanner(System.in);
		System.out.println("What is your weight (kg)?");
		weight = askUser.nextDouble();
		System.out.println("What is your height (m)?");
		height = askUser.nextDouble();
		System.out.println();
		System.out.println("Your body weight is:");
		System.out.println("In Metric units: " + TWO_DECIMAL_PLACES.format(metricFormula(height, weight)) + " kg");
		askUser.close();
		System.exit(0);
	}
	public static double metricFormula(double m, double kg) {
		double result=0;
		result = kg / (Math.pow(m, 2));
		return result;
	}
	public static double imperialFormula(double m, double kg) {
		double result=0;
		double lbs = Math.round(kg * KG_TO_LBS);
		double in = Math.round((m * M_TO_IN) *100);
		result = (lbs / (Math.pow((in/100), 2)))* 703;
		return result;
	}
	public static String getCategory (double result) {
		String category;
		if (result < 15) {
			category = "very severely underweight";
		} else if (result >=15 && result <= 16) {
			category = "severely underweight";
		} else if (result >16 && result <= 18.5) {
			category = "underweight";
		} else if (result >18.5 && result <= 25) {
			category = "normal (healthy weight)";
		} else if (result >25 && result <= 30) {
			category = "overweight";
		} else if (result >30 && result <= 35) {
			category = "moderately obese";
		} else if (result >35 && result <= 40) {
			category = "severely obese";
		} else {
			category ="very severely obese";
		}
		return category;
	}	
}