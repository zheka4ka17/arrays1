package com.company;

import java.util.Random;
import java.util.Scanner;

/*Дан массив чисел от 1 до 10. На каждом ходе выбрасывается случайное число.
        Игрок может вычеркнуть из массива одно или более чисел, сумма которых равна случайному числу.
        Игра прекращается, когда нельзя зачеркнуть ни одно из чисел.
        Выигрывает тот, кто набрал больше очков.
        */
public class gg2 {
    public static void main(String[] args) {
int size = 9;
int [] arr = new int[size];
for (int i =0; i<size; i++ ){
    arr[i]= i+1;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean move = true;
    do {
    int rang = random.nextInt(11)+2;}
    while (sum(arr)>0);
}
    }
    static int sum(int[] arr){
        int result = 0;
        for (int i =0; i<arr.length; i++)
            result+=arr[i];
        return result;
    }
}
