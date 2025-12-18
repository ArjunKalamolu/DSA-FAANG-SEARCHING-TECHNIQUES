import java.util.Scanner;
public class Vowels_Count {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to Count Number of Vowels in it...");
        String Value = input.nextLine();
        String Vowels = "AEIOUaeiou";
        System.out.println("Number of vowels are "+CountVowels(Value, Vowels));
        input.close();
    }
    static int CountVowels(String value,String vowels){
        int count = 0;
        for(int i=0; i<value.length(); i++){
            for(int j=0; j<vowels.length(); j++){
                if(value.charAt(i) == vowels.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
    
}
