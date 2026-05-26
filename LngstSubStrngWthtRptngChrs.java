import java.util.*;
public class LngstSubStrngWthtRptngChrs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(lngstSubStrngWthtRptngchrs(s));
    }
    static int lngstSubStrngWthtRptngchrs(String s){
        if(s == null || s.isEmpty()){
            return -1;
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r < s.length()){
            char curr = s.charAt(r);
            if(hm.containsKey(curr)){
                l = Math.max(l,hm.get(curr)+1);
            }
            hm.put(curr,r);
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
