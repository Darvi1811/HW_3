package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // ex 1
        byte a = 3;
        short b = 214;
        int c = 174189;
        long d = 2222222L;
        float e = 421.2344441f;
        double f = 10000.214514;
        char j = 'B';
        boolean h = true;
        System.out.println("byte: " + a + "\nshort: " + b + "\nint: " + c + "\nlong: " + d + "\nfloat: " + e + "\ndouble: " + f + "\nchar: " + j + "\nboolean: " + h);

        // ex 2
        System.out.println(10_000_000);
        System.out.println(100.066_123_455);
        System.out.println(15_500_088.4_433_112_201);

        // ex 3
        char aa = '\u00A9'; // ©
        System.out.println(aa);
        char ab = '\u00B5'; // µ
        System.out.println(ab);
        char ac = '\u00AE'; // ®
        System.out.println(ac);
    }
}
