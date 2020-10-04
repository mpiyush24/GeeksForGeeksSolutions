package com.cssolutions.algorithm;

import java.util.Arrays;

public class MultiplyString {

    public String multiply(String num1, String num2) {

        if("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        char[] num1C = num1.toCharArray();
        char[] num2C = num2.toCharArray();

        char[] product = new char[m+n];

        Arrays.fill(product, '0');
        for(int i = m-1 ; i >= 0;i-- ) {
            int k = num1C[i] - '0';
            for(int j = n-1 ; j >= 0; j--) {
                int c;
                int l = num2C[j] - '0';
                int p1 = i+j;
                int p2 = i+j+1;
                int mul= k*l;
                int p2Sum = (product[p2] - '0') + mul;
                product[p2] = (char)(p2Sum%10 + '0');
                c = p2Sum/10;
                int p1Sum = (product[p1] - '0') + c;
                product[p1] = (char)(p1Sum%10 +'0');
                c = p1Sum/10;
                if(c > 0) {
                    product[p1 - 1]+=c;
                }
            }
        }
        return removeLeadingZeroes(new String(product));

    }

    public String removeLeadingZeroes(String s) {
        int index;
        for (index = 0; index < s.length(); index++) {
            if (s.charAt(index) != '0') {
                break;
            }
        }
        return s.substring(index);
    }

}
