package com.sparta.ml;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        int [] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arrayTwo = {11, 12, 13, 14, 15};

        int length = arrayOne.length + arrayTwo.length;

        int[] mergedArray = new int[length];
        int i = 0;
        for (int element: arrayOne){
            mergedArray [i] = element;
            i++;
        }
        for (int element: arrayTwo){
            mergedArray [i] = element;
            i++;
        }

        System.out.println(Arrays.toString(mergedArray));
    }
}
