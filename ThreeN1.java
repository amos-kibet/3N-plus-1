/**
* This program prints out a 3N+1 sequence starting from a positive
* integer specified by the user. It also counts the number of
* terms in the sequence, and prints out that number.

* This solution is the same as the one in the book: Introduction to Programming Using Java, 
* by David J. Eck of Hobart and William Smith Colleges
* used as a coursework material by University of the People
*/

import java.util.Scanner;

public class ThreeN1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int N = n.nextInt(); // Get user input
        int counter; // for counting the terms
        System.out.println("Starting point for sequence: ");
        while (N <= 0) {
            System.out.print("The starting point must be positive. Please try again: ");
            return;

        }
        // At this point, we know that N > 0
        counter = 0;
        while (N != 1) {
            if (N % 2 == 0)
            N = N / 2;
            else
            N = 3 * N + 1;
            System.out.println(N);
            counter = counter + 1;
        }
        System.out.println();
        System.out.print("There were ");
        System.out.print(counter);
        System.out.println(" terms in the sequence.");
    } // end of main()
} // end of class ThreeN1