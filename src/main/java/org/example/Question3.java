package org.example;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
//3. write a method that can print out the array in Descending order
        Question3 sc = new Question3();
        int[] numbers1 = {40, 50, 78, 12, 6};
        sc.convertNumber(numbers1);
        System.out.println();
    }

    public void convertNumber(int[] array) {
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");


        }
    }
}
