public class Week9JavaPt52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reset variable Star to 0 each time
		
		String Star = "";
		String starLight;
		String Starry = "*";
		
		// for loop 5 x through to add a star each time
		
		for (int i=0; i<6; i++) {
			starLight = Star += Starry;

			System.out.println(Starry);
		}
	}

}
