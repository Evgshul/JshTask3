package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String str;
        int count1 = 0;
        int count2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parentheses, brackets and braces : ");
        str = scanner.next();


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count1++;
            } else if (str.charAt(i) == ')') {
                count1--;
            }
            if (str.charAt(i) == '[') {
                count2++;
            } else if (str.charAt(i) == ']') {
                count2--;
            }
            if (str.charAt(i) == '{') {
                count2++;
            } else if (str.charAt(i) == '}') {
                count2--;
            }

        }

        if ((count1 == 0) && (count2 == 0)) {
            System.out.println("is balanced");
        } else {
            System.out.println("is not balanced");
        }
    }

}

