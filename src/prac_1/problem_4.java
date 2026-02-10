import java.util.Scanner;

import java.lang.Math;

public class problem_4{
    public static void calculate(int a,int b,int c){
        int d = b * b - 4 * a * c;
        if(d < 0){
            System.out.println("Impossible");
        }
        if(d == 0){
            double ans = (-b * 1.0) / (2 * a);
            System.out.println("answer: " + ans);
        }
        else{
            double ans_1 = (-b + Math.sqrt(d))/ (a + a);
            double ans_2 = (-b - Math.sqrt(d))/ (a + a);
            System.out.println("first answer: "+ ans_1);
            System.out.println("second answer: "+ ans_2);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        calculate(a,b,c);
    }
}