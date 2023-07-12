package arithmeticOperation;

public class ArithmeticOperation {
	public static void main(String[] args) {
		int res1=subtraction(20,5);
		int res2=multiplication(4,5);
		double res3=division(20,4);
		int res4=findremainder(10,3);
		System.out.println(res1);
		System.out.println(res2);
		System.out.printf("%.2f\n",res3);
		System.out.println(res4);
	}
	public static int subtraction(int num1,int num2) {
		return num1-num2;
	}
		
	public static int multiplication(int num1,int num2) {
		return num1*num2;
	}
	public static int division(int num1,int num2)
	{
		return num1/num2;
		
	}
	public static int findremainder(int num1,int num2)
	{
		return num1%num2;
		
	}
	
		
}	
		
		
		
		
		
		
		


