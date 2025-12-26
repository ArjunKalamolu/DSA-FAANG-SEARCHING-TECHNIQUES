public class LinearSearch_General {
    public static void main(String[] args){
        String name = "Mathematics";
        char target = 'm';
        System.out.println(Linear_Search(name, target));
    }
    static int Linear_Search(String name,char target){
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
    
}
