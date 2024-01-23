package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Hedgehog hedgehog = new Hedgehog();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
        choice = scanner.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.println("What does the hedgehog say?");
                String message = scanner.nextLine(); 
                hedgehog.speak(message);
                System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
                choice = scanner.nextInt();
            }
            else if (choice == 2) {
                System.out.println("What is the name of the hedgehog?");
                String name = scanner.next();
                System.out.println("What is the age of the hedgehog?");
                try {
                    int age = scanner.nextInt();
                    hedgehog = new Hedgehog(name, age);
                    System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input for age. Please enter a valid integer.");
                    scanner.nextLine(); 
                }
            }
            else if (choice == 3) {
                System.out.println("How many laps does the hedgehog run?");
                int laps = scanner.nextInt();
                hedgehog.run(laps);
                System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
                choice = scanner.nextInt();
            }
            else if (choice == 0) {
                System.out.println("Thank you for using the program.");
                break;
            }
            else {
                System.out.println("Wrong input value");
                System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
                choice = scanner.nextInt();
            }
    }
    }
}
