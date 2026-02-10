package problem1;

import java.util.Scanner;

public class Analyzer{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while(true){
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine().trim();

            if(input.equalsIgnoreCase("Q")){
                break;
            }

            try{
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number or Q.");
            }

        }
        System.out.println("Average = " + data.getAvg());
        System.out.println("Maximum = " + data.getMax());
        scanner.close();
    }
}