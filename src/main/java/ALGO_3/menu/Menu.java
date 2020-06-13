package ALGO_3.menu;

import ALGO_3.data.Student;
import ALGO_3.main.Console;
import ALGO_3.stack.Stackable;

import java.sql.SQLOutput;

public class Menu {
    public static void mainMenu() {
        System.out.println("Console-Application: Exercise-3             <Ekaterina><Krysenkova><573734>");
        System.out.println();
        System.out.println("1.Push student to stack");
        System.out.println("2.Pop student from stack");
        System.out.println("3.Peek student");
        System.out.println("4.Check if students are on the stack");
        System.out.println("5.Clear stack");
        System.out.println("6.Print all students from stack");
        System.out.println("7.Get size of the stack");
        System.out.println("0.Exit");
        System.out.println();

    }

    public static void choice(Stackable<Student> stack) {
        mainMenu();
        int choice = 1;
        while (choice != 0) {
            mainMenu();
            choice = Console.readIntFromStdin("Please enter a number for an option: ");
            switch (choice) {
                case 1:
                    Student studentToStack = Console.readStudentFromStdin();
                    stack.push(studentToStack);
                    break;
                case 2:
                    if (stack.size() == 0) {
                        System.out.println("Stack is already empty!");
                    }
                    if (stack.size() == 1) {
                        stack.clear();
                        System.out.println("The student was popped. Stack is empty now.");
                    } else {
                        stack.pop();
                        System.out.println("The student was popped.");
                    }
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                case 5:
                    stack.clear();
                    System.out.println("Stack was cleared.");
                    break;
                case 6:
                    stack.printAll();
                    break;
                case 7:
                    System.out.println("The size of the stack is " + stack.size());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong input. Try again!");

            }
        }
    }
}
