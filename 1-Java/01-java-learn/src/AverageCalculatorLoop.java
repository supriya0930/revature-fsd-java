
public class AverageCalculatorLoop {

	public static void main(String[] args) {
		float[] scores = { 48, 55, 92, 78, 64 };

		float total = 0.0f;
	/*	for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			System.out.println(scores[i]);
		} */
		
		
		
		//enchanced for loop of previous version
		for (float score : scores) { //float score is variable : is separator and scores is array
			total += score;
		}
		System.out.println("Average = " + total / scores.length);

	}

}