package concepts;

import java.util.Arrays;

public class SingleDimensional_Array {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,2,4,6,8};
	
	  // To find value at no. 4
		
		System.out.println(arr[3]); // n-1 i.e. 4-1=3 
	
	 // To find out the length of Array
	
	    System.out.println(arr.length);
	
	    // To Sort the Array
		
		   Arrays.sort(arr);
		      
	 // To print all data at a time use for loop    
	    
	   for(int i=0;i<arr.length;i++) {
		   
		   System.out.println(arr[i]);
	   }
	    
	
}

}
