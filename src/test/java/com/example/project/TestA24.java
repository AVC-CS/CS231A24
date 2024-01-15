package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.*;

public class TestA24 {

  @Test
  public void testA24_1() {

    /* System output redirection */
    // PrintStream originalOut = System.out;
    // ByteArrayOutputStream bos = new ByteArrayOutputStream();
    // System.setOut(new PrintStream(bos));

    /* For Test */

    // action
    // Test 1
    String email = "John1@company.com";
    Boolean result = A24.emailValidate(email);
    // Find the max value in the numbers
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, true);

    // Test 1
    email = "1john@company.edu";
    result = A24.emailValidate(email);
    // Find the max value in the numbers
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, false);

    // Test 3
    email = "AAAA@company.org";
    result = A24.emailValidate(email);
    // Find the max value in the numbers
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, false);

    // Test 4
    email = "AAAAAAAAA1@compnaylongname.deptname.teamname.org";
    result = A24.emailValidate(email);
    // Find the max value in the numbers
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, false);
    // Test 5
    email = "A1@teamname.org";
    result = A24.emailValidate(email);
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, true);
    // Test 6
    email = "AAA1@com.team.net";
    result = A24.emailValidate(email);
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, true);
    // Test 7
    email = "A1B2.Lee@com.org.edu";
    result = A24.emailValidate(email);
    System.out.printf("The result is %s ", Boolean.toString(result));
    assertEquals(result, true);
    // assertion
    // assertEquals("Hello world!\n", bos.toString());
    // assertEquals(result, ans);
  }
}
