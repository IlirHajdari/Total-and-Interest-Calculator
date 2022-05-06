import java.util.Scanner;

public class Mod4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[5];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the number: ");
			numbers [i] = input.nextDouble();
		}
		
		double total = 0;
		double max = numbers[0];
		double min = numbers[0];
		double average = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
			if (numbers[i] > max) {
				max = numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		average = total / numbers.length;
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Interest on total at 20%: " + (total * 0.2));
		
		input.close();
	}
	
}