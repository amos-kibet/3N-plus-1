/**
* This program prints out a 3N+1 sequence starting from a positive
* integer specified by the user. It also counts the number of
* terms in the sequence, and prints out that number.

* This solution is my implementation, achieved through trial and error and a lot of reading.
* I am happy to say that I am starting to code like a software engineer.
*/

import java.util.Scanner;

public class ThreeNPlusOne {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int N = n.nextInt(); // Get user input
        int counter = 0;

        if (N <= 0) {
            System.out.println("\"N\" cannot be negative or zero. Please try again.");
        }
        while (N > 0) {
            if (N == 1) {
                return;
            }

            if (N % 2 == 0) {
                N = N / 2;
                System.out.print("\"N / 2\" = ");
                System.out.print(N +", ");
            } else {
                N = N * 3 + 1;
                System.out.print("\"3N+1\" = ");
                System.out.print(N +", ");
            }
            counter += 1;
            System.out.print("count = ");
            System.out.println(counter);
        }
    }
}