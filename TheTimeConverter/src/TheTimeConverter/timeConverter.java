package TheTimeConverter;

import java.util.Scanner;

public class timeConverter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter minutes");
		float minutes=scan.nextFloat();
		convertToHours(minutes);
		System.out.printf("%.2f",convertToHours(minutes));
		
	}
	public static double convertToHours(float minutes) {
		return minutes*1/60;	
	}
}
