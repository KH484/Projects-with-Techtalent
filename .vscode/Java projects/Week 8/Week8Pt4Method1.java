
import java.util.Scanner;

public class Week8Pt4Method1 {

    // Create variables that I can use in both methods

    float finalTotalMarks;
    float percentageMark1;
    float percentageMark2;
    float percentageMark3;

    public void printInitialResults() { // method 1

        // Asking user to enter results for Physics

        Scanner Results1 = new Scanner(System.in);
        String Physics;

        System.out.println("Enter the result for Physics: ");
        Physics = Results1.nextLine();

        float finalResult1 = Float.parseFloat(Physics); // string to a float
        float percentageMark1 = (finalResult1 / 150 * 100); // working out the percentage of the mark

        System.out.println(
                "Result for Physics is: " + finalResult1 + '\n' + " Your percentage mark is: " + percentageMark1);

        // printing to the console

        // The same code for the next exam - Chemistry

        Scanner Results2 = new Scanner(System.in);
        String Chemistry;

        System.out.println("Enter the result for Chemistry: ");
        Chemistry = Results2.nextLine();

        float finalResult2 = Float.parseFloat(Chemistry);
        float percentageMark2 = (finalResult2 / 150 * 100);

        System.out.println(
                "Result for Chemistry is: " + finalResult2 + '\n' + " Your percentage mark is: " + percentageMark2);

        // The same code for the next exam - Biology

        Scanner Results3 = new Scanner(System.in);
        String Biology;

        System.out.println("Enter the result for Biology: ");
        Biology = Results3.nextLine();

        float finalResult3 = Float.parseFloat(Biology);
        float percentageMark3 = (finalResult3 / 150 * 100);

        System.out.println(
                "Result for Chemistry is: " + finalResult3 + '\n' + " Your percentage mark is: " + percentageMark3);
        finalTotalMarks = (finalResult1 + finalResult2 + finalResult3);
        System.out.println("Total marks for all three exams is: " + finalTotalMarks);

    }

    public void printFinalPercentage() { // method 2

        // working out the final percentage

        float finalPercentageOverall = (finalTotalMarks * 100 / 450);
        System.out.println("Total percentage for all three exams is: " + finalPercentageOverall);

        // if the final percentage is over 60:

        if (finalPercentageOverall > 60) {
            System.out.println("Congratulations you have PASSED! You can officially call yourself a GENIUS now!!");
        } else {
            System.out.println("You have failed. You will remember this moment and wonder where it all went wrong... ");
        }

    }

}
