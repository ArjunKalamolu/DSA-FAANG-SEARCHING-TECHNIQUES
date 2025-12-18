public class Comparator_Vs_Equals {
    public static void main(String[] args){
        String name1 = "TCS";
        String name2 = new String("TCS");
        System.out.println("Result of == is : "+ (name1 == name2));
        System.out.println("Result of .equals() is : "+ name1.equals(name2));

    }
    
}
