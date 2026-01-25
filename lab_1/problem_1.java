public class problem_1{
    puslic static void PrintMyName(String name){
        int width = name.length() + 2;
        String border = "+" + "-".repeat(width) + "+";
        String nameLine = "| " + name + " |";
        System.out.println(border);
        System.out.println(nameLine);
        System.out.println(border);
    }

    public static void main(String[] args){
        PrintMyName("Timur");
    }
}