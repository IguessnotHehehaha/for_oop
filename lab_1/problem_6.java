import java.util.Scanner;

import java.lang.Math;

public class scratch{
    public static void calculate(String val){
        String new_val = new StringBuilder(val).reverse().toString();
        if(val.equals(new_val)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        calculate(val);
    }
}