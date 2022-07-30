package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int[] array = {6, 25, 91, 23, 72, 9, 18, 6};
        int n = sc.nextInt();

        int[] mas = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            mas[i] = array[i];
        }

        mas[array.length] = n;

        // arrayni konsolga chiqrish
        System.out.println(Arrays.toString(mas));
    }
}
