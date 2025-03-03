package part1;

import java.util.Scanner;
public class Strings
{
// --------------------------------------------
// Reads in an array of integers, sorts them,
// then prints them in sorted order.

// !!! selection sort accepts comparable data types, 
//since comparable is a class, we have to use wrapper classes
// --------------------------------------------
    public static void main (String[] args)
    {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        String[] strList = new String[size];
        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            strList[i] = scan.next();
            Sorting.insertionSort(strList);
            
            System.out.println ("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println ();
    }
}