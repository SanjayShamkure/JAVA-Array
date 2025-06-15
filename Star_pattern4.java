package logical_programs;

public class Star_pattern4 {
	
	public static void main(String args[]) {
		
	for(int i=1;i<=6;i++) {
		
		for(int j=6;j>=i;j--) {
			
			System.out.print(" ");
	}
	
		for(int k=1;k<=i;k++) {
			
			System.out.print("*");
		}
		
		System.out.println();
			
	}
}
	}



