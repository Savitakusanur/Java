package TheHeightConverter;

import java.util.Scanner;

public class heightConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter inches");
		float inches=scan.nextFloat();
		HeightConverter converter = new HeightConverter();
		converter.convertInchesToFeet(inches);
		System.out.printf("%.2f",converter.convertInchesToFeet(inches));
	}

}
