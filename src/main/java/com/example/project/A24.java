package com.example.project;

import java.util.*;
import java.io.*;

class A24 {
    static Boolean emailValidate(String email) {

        /*****************************************
         * Code Your program here
         *****************************************/

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the email string : ");
        String emailstr = sc.nextLine();

        Boolean result = emailValidate(emailstr);
        System.out.printf("Validation Result " + Boolean.toString(result));

        sc.close();
    }
}
