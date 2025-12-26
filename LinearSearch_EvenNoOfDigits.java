public class LinearSearch_EvenNoOfDigits {
    public static void main(String[] args){
        int[] arr = {12,345,2,6,7896};
        System.out.println(Number_EvenDigits(arr));
    }
    static int Number_EvenDigits(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(Even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean Even(int num){
        int Number_Digits = Digits(num);
        return Number_Digits % 2 == 0;
    }
    static int Digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
    
}
