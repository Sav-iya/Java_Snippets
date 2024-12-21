package org.example;
import java.util.*;

 class Number_pattern
{
    public static void printpattern(int n)
    {
        int i, j, k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
                for (k=1;k<=i;k++)
                {
                    System.out.print(i + " ");
                }
            System.out.println();

        }

    }
    public static void main(String args[])
    {
        int n=6;
        printpattern(n);
    }
}

 /*class Number_pattern {
    public static void main(String[] args) {
        int n = 6; // Number of rows in the triangle

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for printing leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Printing space for alignment
            }

            // Inner loop for printing the numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "   "); // Printing the number with space for separation
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
*/