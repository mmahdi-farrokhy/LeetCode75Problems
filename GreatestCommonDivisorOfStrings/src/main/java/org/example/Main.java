package org.example;

import stringdivision.StringDivider;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1 = new Scanner(System.in).nextLine();
        String str2 = new Scanner(System.in).nextLine();
        System.out.println(new StringDivider(str1, str2).findGreatestDivisor());
    }
}