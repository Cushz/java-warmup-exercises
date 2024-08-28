package Chapter1;

import java.util.Scanner;
public class Exercise3 {
    public int[] conditionalCalculation(int a, int b){
        int[] ans = new int[2];
        if (a % 2 == 0 && b % 2 == 0) {  // Both a and b are even
            ans[0] = a + b;
            ans[1] = 0;  // Optional: Initialize ans[1] for clarity
        } else if (a % 2 != 0 && b % 2 != 0) {  // Both a and b are odd
            ans[0] = a * b;
            ans[1] = 0;  // Optional: Initialize ans[1] for clarity
        } else {  // One is even and the other is odd
            ans[0] = a * a;
            ans[1] = b * b;
        }
        return ans;
    }

    public int[] scannerCalculation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first input");
        int a = scan.nextInt();
        System.out.println("Enter your second input");
        int b = scan.nextInt();
        return conditionalCalculation(a,b);
    }
}
