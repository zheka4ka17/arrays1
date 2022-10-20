package com.company;

import java.util.Arrays;
import java.util.Random;

public class arrays1 {
    static int size =5;
  static   int[] arr = new int [5];
    public static void main(String[] args) {
        //fillOrder();
        fillRandom();

            System.out.println(Arrays.toString(arr));
        }
        static void fillOrder (){
            for(int i=0; i<size; i++){
                arr[i]= i+1;}
        }
        static void fillRandom(){
            Random random = new Random();

            for(int i=0; i<size; i++){
                arr[i]= random.nextInt(90)+10;
            }

        }
    }

