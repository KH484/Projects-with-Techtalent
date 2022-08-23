
public class Week9JavaPt54Alternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Star  = "     ";
		String Star1 = "    ";
		String Star2 = "   ";
		String Star3 = "  ";
		String Star4 = " ";
		String Star5 = "";
		
		// making star symbols 
		
		String starLight;	
		String Starry  = "*";
		String Starry1 = "***";
		String Starry2 = "*****";
		String Starry3 = "*******";
		String Starry4 = "*********";
		String Starry5 = "***********";
		
		// loops to add each new line with it's corresponding space
		
		for (int i=0; i<1; i++) {
			starLight = Starry += Star;

			System.out.println(starLight);
			
			for (int j=0; j<1; j++) {
				starLight = Star1 += Starry1;

				System.out.println(starLight);
				
				for (int k=0; k<1; k++) {
					starLight = Star2 += Starry2;

					System.out.println(starLight);
					
					for (int l=0; l<1; l++) {
						starLight = Star3 += Starry3;

						System.out.println(starLight);
						
						for (int n=0; n<1; n++) {
							starLight = Star4 += Starry4;

							System.out.println(starLight);
							
							for (int o=0; o<1; o++) {
								starLight = Star5 += Starry5;

								System.out.println(starLight);
						
							}
						}
					}
				}
			}
		}
	}

}


