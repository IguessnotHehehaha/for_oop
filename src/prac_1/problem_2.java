import java.util.Scanner;

import static java.lang.Math.sqrt;

public class problem_2{
    public static void calculate(int a){
        int area = a * a;
        int perimeter = a * 4;
        double diagonal = a * sqrt(2);
        System.out.println("squares area: " + area);
        System.out.println("squares perimeter: " + perimeter);
        System.out.println("squares diagonal: " + diagonal);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        calculate(a);
    }
}