package withoutide;

public class Converter {

	public static void main(String[] args) {
		convert(Double.valueOf(args[0]));	
	}

	public static double convert(double farenheit) {
		double celcius = ((farenheit - 32) * 5 )/ 9;
		System.out.println(farenheit + "F = " + celcius + "C");
		return celcius;
	}
}