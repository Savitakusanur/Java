import java.util.Scanner;

public class powerOfSqure {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a integer7");
		int num=scan.nextInt();
		System.out.println(squareNumber(num));
	}
	public static int squareNumber(int num)
	{
		return num*num;
	}
}
