package com.company;

import java.util.Arrays;
import java.util.Random;

public class sorting1 {
  static int  size;
    static int[] arr;

    public static void main(String[] args) {
        size = 20;
        arr = new int[size];
        fillRandom();
        print();
        quickSort(0,size-1);
       // mergeSort(0,size-1);
        print();
    }
    static void fillRandom(){
        Random random = new Random();

        for(int i=0; i<size; i++){
            arr[i]= random.nextInt(90)+10;
        }}
    static void print (){
        System.out.println(Arrays.toString(arr));}

    public static void quickSort(int low, int high) {
        if (arr.length == 0)
            return;//завершить выполнение если длина массива равна 0
        if (low >= high)
            return;//завершить выполнение если уже нечего делить
        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = arr[middle];
        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < opora) {
                i++;
            }
            while (arr[j] > opora) {
                j--;
            }
            if (i <= j) {//меняем местами
                swap(i,j);
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(low, j);
        if (high > i)
            quickSort(i, high);
    }
    static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void merge(int l, int m, int r){
            // Original array is broken in two parts
            // left and right array
            int len1 = m - l + 1, len2 = r - m;
            int[] left = new int[len1];
            int[] right = new int[len2];
            for (int i = 0; i < len1; i++)
                left[i] = arr[l + i];
            for (int i = 0; i < len2; i++)
                right[i] = arr[m + 1 + i];
            int i = 0;
            int j = 0;
            int k = l;

            // After comparing, we
            // merge those two array
            // in larger sub array
            while (i < len1 && j < len2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            // Copy remaining elements of left, if any
            while (i < len1) {
                arr[k] = left[i];
                k++;
                i++;
            }

            // Copy remaining element of right, if any
            while (j < len2) {
                arr[k] = right[j];
                k++;
                j++;
            }}

        public static void mergeSort(int l, int r) {
            if (l >= r) return;
            int m = l + (r - l) / 2;
            mergeSort(l, m);
            mergeSort(m + 1, r);
            merge(l, m, r);
        }
    }


