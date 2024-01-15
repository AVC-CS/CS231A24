package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.*;

public class TestA23 {

  @Test
  public void testA23_1() {

    /* System output redirection */
    // PrintStream originalOut = System.out;
    // ByteArrayOutputStream bos = new ByteArrayOutputStream();
    // System.setOut(new PrintStream(bos));

    /* For Test */

    // action
    // Test 1
    List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    result.add(new ArrayList<Integer>(List.of(1, 2, 3)));
    result.add(new ArrayList<Integer>(List.of(4, 5, 6)));
    result.add(new ArrayList<Integer>(List.of(7, 8, 9)));

    A23.printValues(result);
    // Find the max value in the numbers
    System.out.printf("The max valus in the list %d\n", A23.getMax(result));
    int answer1 = 9;
    assertEquals(A23.getMax(result), answer1);

    // Find the max row values in the numbers
    var maxrows = A23.getMaxRows(result);
    ArrayList<Integer> answer2 = new ArrayList<Integer>(List.of(3, 6, 9));
    System.out.printf("The max values in each row %s\n", maxrows.toString());
    assertEquals(A23.getMaxRows(result), answer2);

    // Find the max colomn values in the numbers
    var maxcols = A23.getMaxCols(result);
    ArrayList<Integer> answer3 = new ArrayList<Integer>(List.of(7, 8, 9));
    System.out.printf("The max values in each column %s\n", maxcols.toString());
    assertEquals(A23.getMaxCols(result), answer3);
    // System.out.println("Answer " + ans.toString());

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    // assertEquals(result, ans);
  }

  @Test
  public void testA23_2() {

    /* System output redirection */
    // PrintStream originalOut = System.out;
    // ByteArrayOutputStream bos = new ByteArrayOutputStream();
    // System.setOut(new PrintStream(bos));

    /* For Test */
    int rows = 3;
    int cols = 3;

    // action
    // Test 1
    List<ArrayList<Integer>> result = A23.makeValues(rows, cols);
    A23.printValues(result);
    // Find the max value in the numbers
    System.out.printf("The max valus in the list %d\n", A23.getMax(result));
    int answer1 = getMax(result);
    assertEquals(A23.getMax(result), answer1);

    // Find the max row values in the numbers
    var maxrows = A23.getMaxRows(result);
    var answer2 = getMaxRows(result);
    System.out.printf("The max values in each row %s\n", maxrows.toString());
    assertEquals(A23.getMaxRows(result), answer2);

    // Find the max colomn values in the numbers
    var maxcols = A23.getMaxCols(result);
    var answer3 = getMaxCols(result);
    System.out.printf("The max values in each column %s\n", maxcols.toString());
    assertEquals(A23.getMaxCols(result), answer3);
    // System.out.println("Answer " + ans.toString());

    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    // assertEquals(result, ans);
  }

  public static int getMax(List<ArrayList<Integer>> numbers) {
    int maxval = numbers.get(0).get(0);
    for (ArrayList<Integer> row : numbers) {
      // Collections.sort(row);
      int maxrow = row.get(0);
      for (int val : row) {
        if (maxrow < val)
          maxrow = val;
      }
      if (maxrow > maxval)
        maxval = maxrow;
    }
    return maxval;
  }

  static ArrayList<Integer> getMaxRows(List<ArrayList<Integer>> numbers) {
    ArrayList<Integer> maxrows = new ArrayList<Integer>();
    for (int i = 0; i < numbers.size(); i++) {
      int maxval = numbers.get(i).get(0);
      for (int j = 0; j < numbers.get(i).size(); j++) {
        if (maxval < numbers.get(i).get(j))
          maxval = numbers.get(i).get(j);
      }
      maxrows.add(maxval);
    }
    return maxrows;
  }

  static ArrayList<Integer> getMaxCols(List<ArrayList<Integer>> numbers) {
    int cols = numbers.get(0).size();
    int rows = numbers.size();
    ArrayList<Integer> maxcols = new ArrayList<Integer>();

    for (int i = 0; i < cols; i++) {
      int maxval = numbers.get(0).get(i);
      for (int j = 0; j < rows; j++) {
        if (maxval < numbers.get(j).get(i)) {
          maxval = numbers.get(j).get(i);
        }
      }
      maxcols.add(maxval);
    }
    return maxcols;
  }
}
