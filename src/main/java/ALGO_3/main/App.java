/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ALGO_3.main;

import ALGO_3.menu.Menu;
import ALGO_3.stack.Stack;
import ALGO_3.data.Student;

public class App {
    public static void main(String[] args) {
        Stack<Student> stack = new Stack<>();
        Menu.choice(stack);
    }
}

