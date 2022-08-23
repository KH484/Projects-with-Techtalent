
public class Week9JavaPt55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        for (int i=1; i<=6; i++){ 
		            // Making space next to the stars
		        	
		            for (int j=6; j>i; j--){
		                System.out.print(" ");
		               
			            }
			            	// Print the left side of the triangle 1-6
			            
			            	for (int k=1; k<=i; k++){
			                System.out.print("i");
			            	}
			            		//print the right side of the triangle 1-6
			            	
			            		for (int n=2; n<=i; n++) {
			            			System.out.print("i");
			            		}
			            		
			            System.out.println();
				}
				
			}

		}
