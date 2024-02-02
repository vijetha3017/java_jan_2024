package com.careerit.jan2024.day2;

import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        System.out.println("this is a demo of if");
        Scanner i=new Scanner(System.in);
      int j=i.nextInt();

        if(j<10)
        {
            System.out.println(j+"  is less than 10");
        }
    }
}
