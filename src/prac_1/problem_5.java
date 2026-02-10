import java.util.Scanner;

import java.lang.Math;

public class problem_5{
    public static void calculate(int value, double interest){
        for (int a =0;a < 10;a++){
            System.out.println("current savings: " + value);
            value = (int)(value * (1 + interest));
        }
    }

    public static void main(String[] args){
        int value = 10000;
        double interest = 0.15;
    }
}