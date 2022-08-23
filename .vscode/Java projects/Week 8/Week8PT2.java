
public class Week8PT2 {

    public static void main(String[] args) {

        String[] wordList = { "Stressed", "Parts", "Straw", "Keep", "Wolf" };

        // for loop to get individual String.
        for (int i = 0; i < wordList.length; i++) {

            // convert String to character array by using toCharArray
            char[] reversedVersion = wordList[i].toCharArray();

            // Changing the letters around
            for (int j = reversedVersion.length - 1; j >= 0; j--) {

                // Changing to lower-case
                char reversedVersion2 = Character.toLowerCase(reversedVersion[j]);
                System.out.print(reversedVersion2);

            }

        }

    }

}
