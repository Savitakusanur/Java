package temperatureConverter;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.printf("%.2f",temperatureConverter.convertFahrenheitToCelsius(f));
	}

}
