package Chapter1;

import java.util.Scanner;

public class Exercise4 {
    public void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give 2 integers successively");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1. +\n2. -\n3. *\n4. /\n5. %");
        System.out.print("Operation:");
        int Operation = scan.nextInt();
        switch (Operation){
            case 1:
                System.out.println("Output: " + a + " + " + b + " = " + (a+b));
                break;
            case 2:
                System.out.println("Output: " + a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println("Output: " + a + " * " + b + " = " + a*b);
                break;
            case 4:
                System.out.println("Output: " + a + " / " + b + " = " + (float)a/b);
                break;
            case 5:
                System.out.println("Output: " + a + " % " + b + " = " + a%b);
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
