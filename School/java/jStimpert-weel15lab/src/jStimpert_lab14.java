//Joshua Stimpert
//lab 14
//dec 9, 2016
public class jStimpert_lab14 {

	public static void main(String[] args) {
		double array1[] = {2.1,3.2,4.3};
		double array2[] = {1,2,3,4,5};
		double array3[] = {2.0,110.12345};
		double array4[] = {10.0,12,13.1,4,5.2,6,7.3,8,9.4,100};
		
		//output
		System.out.println("Welcome to the array multiplication program.\n");
		System.out.printf("%s%,.3f%n", "Product of array1: ", calcProduct(array1));
		System.out.printf("%s%,.3f%n","Product of array2: ", calcProduct(array2));
		System.out.printf("%s%,.3f%n","Product of array3: ", calcProduct(array3));
		System.out.printf("%s%,.3f%n","Product of array4: ", calcProduct(array4));
		System.out.printf("%s%,.3f%n","Product of all arrays: ", calcProduct(array1,array2,array3,array4));
		System.out.println("\nThank you for using this program.\nNow exiting...");

	}
	
	//method to calculate product of held in an uncertain number of arrays.
	public static double calcProduct(double[]...myArrays){
		double product = 1;
		for(double[] currentArray: myArrays)//Loop to select array to be used
			for(double currentNumber: currentArray)//Loop to pull data from array found in previous loop
				product *= currentNumber;//multiply each number to find a running product
		return product;//once all arrays have been read, return product
			
	}

}
