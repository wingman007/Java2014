package ex2;


import java.util.*;

// import MyJava.war2.App; how to do that

public class Ex2_10 {
	
	public static void main(String[] args) {
		
		float[] arr = popArrFloats2(10,8);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	/***
	 * Populate random array of floats
	 * @param float[]
 	 * @param int maximal Value of an element
 	 * 
 	 * @return float[]
	 */
	
	public static float[] popArrFloats(float[] array, int maxVal){
		for(int i = 0; i< array.length; i++){
			
			Random rand = new Random();
			array[i] = (float) (rand.nextFloat()%maxVal+1);
		}
		
		return array;
	}
	/***
	 * Populate random array of floats
	 * @param float[]
 	 * @param int maximal Value of an element
 	 * @param int number of elements
 	 * 
 	 * @return float[]
	 */
	public static float[] popArrFloats2(float maxVal, int numEl){
		
		float[] array = new float[numEl];
		for(int i = 0; i< array.length; i++){
			
			Random rand = new Random();
			array[i] = (float)rand.nextInt()%maxVal + 1; 
		}
		
		return array;
	}

}
