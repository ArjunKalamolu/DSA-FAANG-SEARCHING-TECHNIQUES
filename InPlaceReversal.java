import java.util.*;
public class InPlaceReversal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] s = new char[str.length()];
        for(int i=0; i<s.length; i++){
            s[i] = str.charAt(i);
        }
        System.out.println(Arrays.toString(inplaceReversal(s)));
    }
    static char[] inplaceReversal(char[] s){
        int i = 0;
        int j = s.length - 1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return s;
    }
}
