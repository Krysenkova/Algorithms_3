package ALGO_3.menu;

import ALGO_3.data.Student;
import ALGO_3.main.Console;
import ALGO_3.stack.Stackable;

import java.sql.SQLOutput;
import java.util.Iterator;

public class Menu {
    public static void mainMenu() {
        System.out.println();
        System.out.println("Console-Application: Exercise-3             <Ekaterina><Krysenkova><573734>");
        System.out.println();
        System.out.println("1.Push student to the stack");
        System.out.println("2.Pop student from the stack");
        System.out.println("3.Peek student");
        System.out.println("4.Check if students are on the stack");
        System.out.println("5.Clear the stack");
        System.out.println("6.Print all students from stack");
        System.out.println("7.Get size of the stack");
        System.out.println("8.Add preset students");
        System.out.println("0.Exit");
        System.out.println();

    }

    public static void choice(Stackable<Student> stack) {
        int choice = 1;
        while (choice != 0) {
            mainMenu();
            choice = Console.readIntFromStdin("Please enter a number for an option: ");
            switch (choice) {
                case 1:
                    var studentToStack = Console.readStudentFromStdin();
                    stack.push(studentToStack);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is already empty!");
                    } else if (stack.size() == 1) {
                        stack.clear();
                        System.out.println("The student was popped. The stack is empty now.");
                    } else {
                        stack.pop();
                        System.out.println("The student was popped.");
                    }
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("There are not any students on the stack. It's empty");
                    } else
                        System.out.println("There are some students on the stack");
                    break;

                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is already empty");
                    } else {
                        stack.clear();
                        System.out.println("The stack was cleared.");
                    }
                    break;
                case 6:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else
                        stack.printAll();
                    break;
                case 7:
                    System.out.println("The size of the stack is " + stack.size());
                    break;
                case 8:
                    var s1 = new Student("Watson", "John", 3456, 2);
                    var s2 = new Student("Holmes", "Sherlock", 7679, 4);
                    var s3 = new Student("Hooper", "Molly", 2673, 3);
                    stack.push(s1);
                    stack.push(s2);
                    stack.push(s3);
                    System.out.println("3 students were added to the stack");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong input. Try again!");

            }
        }
    }
}
