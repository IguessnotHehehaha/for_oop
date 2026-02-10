import java.util.Scanner;

import static java.lang.Math.sqrt;

public class problem_3{
    public static void calculate(int a){
        String mark = "";
        if(a>94){
            mark = "A";
        }
        else if(a > 89){
            mark = "A-";
        }
        else if(a > 84){
            mark = "B+";
        }
        else if(a > 79){
            mark = "B";
        }
        else if(a > 74){
            mark = "B-";
        }
        else if(a > 69){
            mark = "C+";
        }
        else if(a > 64){
            mark = "C";
        }
        else if(a > 59){
            mark = "C-";
        }
        else if(a > 54){
            mark = "D+";
        }
        else if(a > 49){
            mark = "D";
        }
        else {
            mark = "F";
        }
        System.out.println("your mark: " + mark);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        calculate(a);
    }
}