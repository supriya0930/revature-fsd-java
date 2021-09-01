
public class FahrenheitConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Fahrenheit: " + toFarenheit(12));
	}

	public static float toFarenheit(float celsius) {
		float fahrenheit = (celsius * 9 / 5) + 32;
		return fahrenheit;
	}
}
