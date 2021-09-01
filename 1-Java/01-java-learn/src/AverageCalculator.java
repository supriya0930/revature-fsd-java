
public class AverageCalculator {

	public static void main(String[] args) {
		
	//	int scores[] = {48, 55, 92,78,64 };  
	//	int[] scores = {48, 55, 92,78,64 };  it can be written in both way
		
	    int scores[]= new int [5];
	//    float[] scores= new float[5]; if we write this line, then no need to write (float)in scores.length
	    scores[0] = 48;
	    scores[1] = 55;
	    scores[2] = 92;
	    scores[3] = 78;
	    scores[4] = 64;
	    
	    float average = (scores[0] +scores[1]+scores[2]+scores[3]+scores[4]) /5.0f; 
	                                                                        //(float) scores.length;..here float type casted.
	    System.out.println("Average = " + average);		
	    		
	 
		//System.out.println(scores[0]);
       // System.out.println(scores[1]);
	}

}

//scores is array variable name.
//[]- defines array