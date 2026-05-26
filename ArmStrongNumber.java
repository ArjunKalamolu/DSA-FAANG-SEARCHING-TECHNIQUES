import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        System.out.println(isArmStrong(no));
    }
    static boolean isArmStrong(int no){
        int t1 = no;
        int length = 0;
        while(t1 != 0){
            length = length + 1;
            t1 = t1/10;
        }
        int t2 = no;
        int arm = 0;
        while(t2 != 0){
            int mul = 1;
            int rem = t2 % 10;
            for(int i=0; i<length; i++){
                mul *= rem;
            }
            arm += mul;
            t2 = t2/10;
        }
        if(arm == no){
            return true;
        }else{
            return false;
        }
    }
}
