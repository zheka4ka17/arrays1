package com.company;

public class avg
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 0};
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    flag = false;
            if (flag) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
        double avg = (double) sum / count;
        System.out.println(avg);
    }
}