package logical_programs;

public class Star_pattern1 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) { // Row
			
			for(int j=1;j<=i;j++) { // Column
				
				System.out.print(" * ");
			}
			System.out.println();
		}	
	}
}
// i=1  1<=7 cond true enter in for loop
// j=1  1<=i  i=1 cond true enter in for loop 
//        print *
// re-enter in for loop j++ means j=2  j<1  cond falls 
// out from for loop and come to the next line  (System.out.println();)
// come to the row for loop and give i++ means i = 2