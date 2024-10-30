import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Lab 1\n");

        performAdditionAndDivision();

        displayMultiplicationTable();

        calculateCircleAreaAndPerimeter();

        calculateAverageOfNumbers();

        checkSumOfThreeNumbers();
        try {
            reverseString();
        } catch (IllegalArgumentException illeg) {
            System.out.println(illeg.getMessage());

        }
        checkIfNumberIsEvenOrOdd();

        convertCelsiusToFahrenheit();

        getCharacterAtIndex();

        calculateRectangleAreaAndPerimeter();

        compareTwoNumbers();

        convertSecondsToTimeFormat();

        checkIfAllNumbersAreEqual();

        checkPositiveNegativeOrZero();

        printNumbersFromOneToTen();

        calculateFactorial();

        findLargestOfThreeNumbers();


        try {
            printFibonacciSeries();
        } catch (InputMismatchException misMach) {
            System.out.println(misMach.getMessage());
        } catch (IllegalArgumentException illegalArgu) {
            System.out.println(illegalArgu.getMessage());
        }
    }

    private static void performAdditionAndDivision() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       1");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter Your first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter Your second number: ");
            int num2 = input.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            if (num2 == 0) throw new ArithmeticException("Cannot divide by zero.");
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next(); // Clear the invalid input
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayMultiplicationTable() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       2");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter Your number: ");
            int num1 = input.nextInt();
            for (int count = 1; count <= 10; count++) {
                System.out.println(num1 + " x " + count + " = " + (num1 * count));
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
    }

    private static void calculateCircleAreaAndPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       3");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter Radius: ");
            double radius = input.nextDouble();
            if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative.");
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Area is = " + area);
            System.out.println("Perimeter is = " + perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calculateAverageOfNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       4");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter the count of numbers: ");
            int count = input.nextInt();
            if (count <= 0) throw new IllegalArgumentException("Count must be positive.");
            double sum = 0;

            for (int i = 1; i <= count; i++) {
                System.out.println("Enter an integer: ");
                sum += input.nextInt();
            }

            System.out.println("The average is: " + (sum / count));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkSumOfThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       5");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter Your first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter Your second number: ");
            int num2 = input.nextInt();
            System.out.println("Enter Your third number: ");
            int num3 = input.nextInt();
            boolean check = (num1 + num2 == num3);
            System.out.println("The result is: " + check);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next();
        }
    }

    private static void reverseString() throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       6");
        System.out.println("    ********************************************************");
        System.out.printf("Input a word: ");
        String myText = input.next();
        if (myText.isEmpty()) throw new IllegalArgumentException("Input cannot be empty.");
        StringBuilder myText2 = new StringBuilder(myText).reverse();
        System.out.println("Reverse word: " + myText2);
    }

    private static void checkIfNumberIsEvenOrOdd() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       7");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter a number: ");
            int num1 = input.nextInt();
            System.out.println("The number is " + (num1 % 2 == 0 ? "Even" : "Odd"));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
    }

    private static void convertCelsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       8");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter temperature in Centigrade: ");
            int num1 = input.nextInt();
            System.out.println("Temperature in Fahrenheit is: " + ((num1 * 1.8) + 32));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
    }

    private static void getCharacterAtIndex() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       9");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Input a string: ");
            input.nextLine(); // Consume newline
            String myText = input.nextLine();
            System.out.printf("Input a number: ");
            int index = input.nextInt();
            if (index < 0 || index >= myText.length())
                throw new StringIndexOutOfBoundsException("Index out of bounds.");
            System.out.println("Character at index " + index + ": " + myText.charAt(index));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid index.");
            input.next();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calculateRectangleAreaAndPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       10");
        System.out.println("    ********************************************************");
        try {
            System.out.printf("Enter Width: ");
            double width = input.nextDouble();
            System.out.printf("Enter Height: ");
            double height = input.nextDouble();
            if (width < 0 || height < 0) throw new IllegalArgumentException("Width and height cannot be negative.");
            double area = width * height;
            double perimeter = 2 * (width + height);
            System.out.println("Area is " + width + " x " + height + " = " + area);
            System.out.println("Perimeter is 2 x (" + width + " + " + height + ") = " + perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
            input.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void compareTwoNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       11");
        System.out.println("    ********************************************************");
        try {
            System.out.printf("Enter first number: ");
            int num1 = input.nextInt();
            System.out.printf("Enter second number: ");
            int num2 = input.nextInt();
            if (num1 > num2) {
                System.out.println(num1 + " is greater than " + num2);
            } else if (num1 < num2) {
                System.out.println(num1 + " is less than " + num2);
            } else {
                System.out.println(num1 + " is equal to " + num2);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next();
        }
    }

    private static void convertSecondsToTimeFormat() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       12");
        System.out.println("    ********************************************************");
        try {
            System.out.printf("Enter seconds: ");
            int seconds = input.nextInt();
            if (seconds < 0) throw new IllegalArgumentException("Seconds cannot be negative.");
            int hours = seconds / 3600;
            int minutes = (seconds % 3600) / 60;
            seconds = seconds % 60;
            System.out.printf("Time format: %d:%d:%d\n", hours, minutes, seconds);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            input.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkIfAllNumbersAreEqual() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       13");
        System.out.println("    ********************************************************");
        try {
            System.out.printf("Enter first number: ");
            int num1 = input.nextInt();
            System.out.printf("Enter second number: ");
            int num2 = input.nextInt();
            System.out.printf("Enter third number: ");
            int num3 = input.nextInt();
            boolean areEqual = (num1 == num2 && num2 == num3);
            System.out.println("All numbers are equal: " + areEqual);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next();
        }
    }

    private static void checkPositiveNegativeOrZero() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       14");
        System.out.println("    ********************************************************");
        try {
            System.out.printf("Enter a number: ");
            int num1 = input.nextInt();
            if (num1 > 0) {
                System.out.println(num1 + " is positive.");
            } else if (num1 < 0) {
                System.out.println(num1 + " is negative.");
            } else {
                System.out.println(num1 + " is zero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
    }

    private static void printNumbersFromOneToTen() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       15");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Numbers from 1 to 10:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void calculateFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       16");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter a positive integer: ");
            int num = input.nextInt();
            if (num < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a positive integer.");
            input.next();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findLargestOfThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       17");
        System.out.println("    ********************************************************");
        try {
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();
            System.out.println("Enter third number: ");
            int num3 = input.nextInt();
            int largest = Math.max(num1, Math.max(num2, num3));
            System.out.println("The largest number is: " + largest);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
            input.next();
        }
    }

    private static void printFibonacciSeries() throws InputMismatchException, IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        System.out.println("    ********************************************************");
        System.out.println("                       18");
        System.out.println("    ********************************************************");
        System.out.println("Enter the number of terms: ");
        int terms = input.nextInt();
        if (terms <= 0) throw new IllegalArgumentException("Number of terms must be positive.");

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

}
