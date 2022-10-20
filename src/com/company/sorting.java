package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;




public class sorting {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static   int size= 10;
   static int [] arr = new int[size];

    public static void main(String[] args) {
fillRandom();
//print();
//dummySort();
//shakerSort();
//selectionSort();
// bogoSort();
print();




    }
    static void shuffle(){
        Random random = new Random();
        for (int i=0; i<size; i++)
            swap(i,random.nextInt(size));
    }

    static boolean isSorted(){
        for (int i=1; i<size; i++)
            if (arr[i]<arr[i-1])
                return false;
        return true;
    }

    static void bogoSort(){
        while (!isSorted())
            shuffle();
    }
    static void fillRandom(){
        Random random = new Random();

        for(int i=0; i<size; i++){
            arr[i]= random.nextInt(90)+10;
}}
static void print (){
            System.out.println(Arrays.toString(arr));}
            public static void dummySort() {
                int i = 0;
                while (i < size - 1) {
                    if (arr[i] > arr[i + 1]) {
                        printColor(i, i + 1);
                        swap(i, i + 1);
                        i = 0;
                    } else i++;
                }}
                static void shakerSort () {
                    int left = 0, right = size - 1;
                    do {
                        for (int i = left; i < right; i++)
                            if (arr[i] > arr[i + 1]) {
                                printColor(i, i + 1);
                                swap(i, i + 1);
                            }
                        right--;
                        for (int i = right; i >= left; i--)
                            if (arr[i] > arr[i + 1]) {
                                printColor(i, i + 1);
                                swap(i, i + 1);
                            }
                        left++;
                    } while (left < right);
                }




    private static void swap(int i, int i1) {
    }
    public static void printColor(int first, int second) {
        for (int i = 0; i < size; i++) {
            if (i == first || i == second) {
                System.out.print(ANSI_RED);
                System.out.print(arr[i] + " ");
                System.out.print(ANSI_WHITE);
            } else System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void selectionSort(){
        for (int i=0; i<size; i++){
            int min = arr[i], index = 0;
            for (int j = i; j<size; j++)
                if (min>arr[j]){
                    min = arr[j];
                    index=j;
                }
            if (index!=0){
                printColor(i,index);
                swap(i,index);
            }
        }
    }
}


