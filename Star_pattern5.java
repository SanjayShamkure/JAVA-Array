package logical_programs;

public class Star_pattern5 {
	
	public static void main(String[] args) {
		
		for(int r=1;r<=6;r++) {
			
			for(int c=1;c<=r;c++) {
				
				System.out.print(" ");
			}
			
			for(int k=6;k>=r;k--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
