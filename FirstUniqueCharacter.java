import java.util.*;
public class FirstUniqueCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(firstUniqueCharacter(s));
    }    
    static int firstUniqueCharacter(String s){
        if(s == null || s.isEmpty()){
            return -1;
        }
        int[] count = new int[256];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i) -'a'] == 1){
                return i;
            }
        }
        return -1;
    }
} 
