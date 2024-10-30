import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Call methods as needed
        convertSeconds();
        checkFourIntegers();
        checkNumberSign();
        countNumbers();
        reverseDigits();
        largestAndSmallest();
    }

    public static void convertSeconds() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  12\n    ********************************************************");
        try {
            System.out.println("Enter seconds: ");
            int seconds = input.nextInt();
            int minutes = seconds / 60;
            int hours = minutes / 60;
            minutes = minutes % 60;
            seconds = seconds % 60;
            System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer value.");
            input.next(); // Clear the invalid input
        }
    }

    public static void checkFourIntegers() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  13\n    ********************************************************");
        try {
            System.out.println("Enter four integers: ");
            int[] nums = new int[4];
            for (int i = 0; i < 4; i++) {
                nums[i] = input.nextInt();
            }
            boolean allPositive = true;
            for (int num : nums) {
                if (num < 0) {
                    allPositive = false;
                    break;
                }
            }
            System.out.println("All numbers are positive: " + allPositive);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integer values.");
            input.next(); // Clear the invalid input
        }
    }

    public static void checkNumberSign() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  14\n    ********************************************************");
        try {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number > 0) {
                System.out.println("Positive number");
            } else if (number < 0) {
                System.out.println("Negative number");
            } else {
                System.out.println("Zero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer value.");
            input.next(); // Clear the invalid input
        }
    }

    public static void countNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  15\n    ********************************************************");
        int count = 0;
        System.out.println("Enter numbers (enter -1 to stop): ");
        while (true) {
            try {
                int number = input.nextInt();
                if (number == -1) break;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer value.");
                input.next(); // Clear the invalid input
            }
        }
        System.out.println("Total numbers entered: " + count);
    }

    public static void reverseDigits() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  16\n    ********************************************************");
        try {
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            int reversed = 0;
            while (number != 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }
            System.out.println("Reversed number: " + reversed);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer value.");
            input.next(); // Clear the invalid input
        }
    }

    public static void largestAndSmallest() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************\n\t\t\t\t\t\t\t" +
                "question  17\n    ********************************************************");
        System.out.println("Enter numbers (enter -1 to stop): ");
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            try {
                int number = input.nextInt();
                if (number == -1) break;
                if (number > largest) largest = number;
                if (number < smallest) smallest = number;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer value.");
                input.next(); // Clear the invalid input
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
