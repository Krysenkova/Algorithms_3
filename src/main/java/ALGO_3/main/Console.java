package ALGO_3.main;

import ALGO_3.data.Student;

import java.util.Scanner;

public class Console {

    public static int readIntFromStdin(String text) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println(text);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            return number;
        } else
            return readIntFromStdin(scanner.next() + " is not a number. Try again!");
    }

    public static String readStringFromStdin(String text) {
        Scanner scanner = new Scanner(System.in);
        String someText;
        System.out.print(text);
        someText = scanner.next();
        return someText;
    }

    public static Student readStudentFromStdin() { //for options 1,2,3,4
        String surname = Console.readStringFromStdin("Please enter a surname: ");
        String prename = Console.readStringFromStdin("Please enter a prename: ");
        int course = Console.readIntFromStdin("Please enter a course number: ");
        int mNumber = Console.readIntFromStdin("Please enter a matriculation number: ");
        return new Student(surname, prename, course, mNumber);
    }
}
