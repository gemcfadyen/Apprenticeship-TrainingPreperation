public class ConverterStep {

	public static void main(String[] args) {
		convert(Double.valueOf(args[0]),
			Double.valueOf(args[1]), 
			Integer.valueOf(args[2]));	
	}

	public static void convert(double start, double stop, int step) {
		
		while (start != stop) {
			double celcius = ((start - 32) * 5 )/ 9;
			System.out.println(start + "F = " + celcius + "C");
			start = start + step;
		}

	}
}