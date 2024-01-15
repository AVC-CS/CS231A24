package com.example.project;

import java.util.*;
import java.io.*;

class A23 {
    static List<ArrayList<Integer>> makeValues(int rows, int cols) {
        /*****************************************
         * Code your program here
         *****************************************/

    }

    static void printValues(List<ArrayList<Integer>> numbers) {
        /*****************************************
         * Code your program here
         *****************************************/

    }

    static int getMax(List<ArrayList<Integer>> numbers) {
        /*****************************************
         * Code your program here
         *****************************************/
    }

    static ArrayList<Integer> getMaxRows(List<ArrayList<Integer>> numbers) {
        /*****************************************
         * Code your program here
         *****************************************/
    }

    static ArrayList<Integer> getMaxCols(List<ArrayList<Integer>> numbers) {
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the row and column numbers: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        List<ArrayList<Integer>> result = makeValues(rows, cols);
        printValues(result);

        // Find the max value in the numbers
        System.out.printf("The max valus in the list %d\n", getMax(result));

        // Find the max row values in the numbers
        var maxrows = getMaxRows(result);
        System.out.printf("The max values in each row %s\n", maxrows.toString());

        // Find the max colomn values in the numbers
        var maxcols = getMaxCols(result);
        System.out.printf("The max values in each column %s\n", maxcols.toString());
        sc.close();
    }
}
