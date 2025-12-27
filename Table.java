import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to generate its table");
        int table = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(table + " * " + i + " = " + table*i);
        }
        input.close();
    }
}