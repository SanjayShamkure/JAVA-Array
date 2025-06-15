package array_1D_log_pro;

public class Max_Number {

	public static void main(String[] args) {
		
		
	int a[] = {25,91,75,48,34,2};
	  
	 int max = 0;
	 
	 for(int i=0; i<a.length; i++) {
		 
		 if(a[i]>max) {
			 max=a[i];
		 }
	 }
	 System.out.println(max);
	 }
}
