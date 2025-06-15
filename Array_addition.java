package array_1D_log_pro;

public class Array_addition {

 public static void main(String[] args) {
	
	int[] a = {2, 4, 3, 1, 7, 6, 3, 9}; // length = 8
	  //index  0  1  2  3  4  5  6  7
	
	System.out.println(a.length);
	
	int sum =0;
	
	for(  int i=0;  i<a.length;  i++) { // to run the array
		//Index     Index
			
		sum = sum+a[i];	
	}
	
	System.out.println(sum);
}	
}
