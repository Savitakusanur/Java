package journeycalculater;

public class journeyCalculatorApp {

	public static void main(String[] args) {
		journeyCalulator j=new journeyCalulator();
		double res=j.calculateDistance(60.0, 1.5);
		System.out.printf("%.2f",res);
	}

}
