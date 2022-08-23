public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String Sentence = "Are you as excited as I am?";

        // Split the string into an array of strings

        String[] array = Sentence.split(" ", 7);

        array[0] = "are?"; // changing the capital A to a at index 0 of array

        array[6] = "Am"; // changing the lower-case a to A at index 6 of array

        String reverseSentence; // making a new variable

        // for loop to turn the array order backwards

        for (int i = array.length - 1; i >= 0; i--) {
            reverseSentence = array[i];

            // print the array
            System.out.println(reverseSentence);

        }
    }
}
