package com.company;

public class gg3 {
    public static void main(String[] args) {
        int n=5, k=3;
        double sum = 0;
        for (int i=1;i<=n; i++){
            double pow = 1;
            for (int j=0; j<k; j++)
                pow= pow*i;
            sum+=pow;
        }
        System.out.println(sum);

    }

}
