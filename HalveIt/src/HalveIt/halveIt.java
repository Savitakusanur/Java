package HalveIt;

import java.util.Scanner;

public class halveIt {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number");
	float num=scan.nextFloat();
	halveTheNumber(num);
	System.out.println(halveTheNumber(num));
}
public static double halveTheNumber(double num)
{
	return num/2;
}
}
