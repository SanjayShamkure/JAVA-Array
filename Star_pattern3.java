package logical_programs;

public class Star_pattern3 {
	
	public static void main(String[] args) {
		
            for(int i=1;i<=7;i++) { // Row
			
			    for(int j=1;j<=i;j++) { // Column
				
				System.out.print(" * ");
			}
			
			    System.out.println();
	}
          
            for(int i=1;i<=7;i++) {
	
	          for(int j=6;j>=i;j--) {
		
		    System.out.print(" * ");
	}
	
	   System.out.println();
}
}}