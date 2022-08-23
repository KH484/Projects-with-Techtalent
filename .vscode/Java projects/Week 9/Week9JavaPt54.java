public class Week9JavaPt54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
		
        for (int i=1; i<=6; i++){ 
            // Making space next to the stars
        	System.out.print("");
        	
            for (int j=6; j>i; j--){
                System.out.print("x");
            }
            	// Print the left side stars
            
            	for (int k=1; k<=i; k++){
                System.out.print("i");
            	}
            		//print the right side stars
            	
            		for (int n=2; n<=i; n++) {
            			System.out.print("s");
            		}
            		
            System.out.println();
        }
    }
}

