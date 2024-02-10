import java.util.Arrays;
import java.util.Scanner;

public class Collaboration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = arrayInitialize(10);
        do {
            System.out.println("Current Array: " + Arrays.toString(arr));
            menu();
            choice(scanner.nextLine(), arr);
        } while (cont);
        scanner.close();
    }

    public static boolean cont = true;

    public static void menu() {

        String options = """
                1- Find Minimum
                2- Find Maximum
                3- Find Average
                4- Average Differences
                5- Sum of Odd-numbered Indexes
                6- Sum of Even-numbered Indexes
                7- QUIT""";
        System.out.println(options);
    }

    public static void choice(String choice, int[] arr) {

        switch(choice) {
            case "1" -> System.out.println("Minimum: " + getMinimum(arr));
            case "2" -> System.out.println("Maximum: " + getMaximum(arr));
            case "3" -> System.out.println("Average: " + average(arr));
            case "4" -> System.out.println("Average Differences: " + Arrays.toString(averageDifferences(arr)));
            case "5" -> System.out.println("Sum of odd numbered indexes: " + sumOfOdd(arr));
            case "6" -> System.out.println("Sum of even numbered indexes: " + sumOfEven(arr));
            case "7", "QUIT" -> cont = false;
        }
    }

    public static int getMinimum(int[] arr) {



    }

    public static int getMaximum(int[] arr) {



    }

    public static int[] averageDifferences(int[] arr) {



    }

    public static int sumOfOdd(int[] arr) {
        



    }

    public static int sumOfEven(int[] arr) {
        



    }

    public static int average(int[] arr) {
        
        int average = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;

    }

    public static int[] arrayInitialize(int length) {

        int[] newArray = new int[length];
        int lowerLimit = 0;
        int upperLimit = 100;
        for ( int i = 0; i < newArray.length; i++){

            newArray[i] = (int) (Math.random() * (upperLimit - lowerLimit)) + lowerLimit;
        }
        return newArray;
    }

}
