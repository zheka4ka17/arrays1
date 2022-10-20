package com.company;

public class gg {
    public static void main(String[] args) {
        /*
        int n =1;

        for (int i=0;i<8;i++  ){
            String left = String.format("%d * %d = ",n, n);
            long res = (long) n*n;
            System.out.printf("%s22%d%n ",left, res);
            n=n* 10+1;*/
       String c ="5";
        String s = "";
        for (int i=0;i<8;i++  ){
            s+=c;
            System.out.printf("%s * %s= %d%n", c ,s, (long)Integer.parseInt(s)*5);

        }
    }
}
