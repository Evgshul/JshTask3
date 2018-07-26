package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parentheses, brackets and braces : ");
        String str = scanner.nextLine();


        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < str.length(); i++) {
            char bracket = str.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (bracket == '}') {
                    bracket = '{';
                } else if (bracket == ')') {
                    bracket = '(';
                } else if (bracket == ']') {
                    bracket = '[';
                }

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                if (bracket == stack.peek()) {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced) {
            System.out.println("is balanced");
        } else {
            System.out.println("is not balanced");
        }
    }
}

