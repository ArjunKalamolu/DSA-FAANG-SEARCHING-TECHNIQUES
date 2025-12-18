import java.util.Scanner;
public class String_Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value To check whether it's a Palindrome or Not");
        String value = input.nextLine();
        System.out.println(isPalindrome(value));
        input.close();

    }
    static boolean isPalindrome(String name){
        if(name.length() == 0 || name == null){
            return true;
        }
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
        if(result.equals(name)){
            return true;
        }
        return false;
    }
    
}
