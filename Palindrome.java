import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        if(s == null || s.isEmpty()){
            return true;
        }
        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else{
                if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
