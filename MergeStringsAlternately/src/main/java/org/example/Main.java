package org.example;

import stringmerge.AlternativeMerging;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word1 = new Scanner(System.in).nextLine();
        String word2 = new Scanner(System.in).nextLine();
        AlternativeMerging alternativeMerging = new AlternativeMerging(word1, word2);
        System.out.println(alternativeMerging.merge());
    }
}