import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String value to reverse");
        String name = input.nextLine();
        System.out.println("The Reversed String result is = "+StringReverse(name));
        input.close();
    }
    static String StringReverse(String name){
        char[] ch = name.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String result = new String(ch);
        return result;
    }
    
}
