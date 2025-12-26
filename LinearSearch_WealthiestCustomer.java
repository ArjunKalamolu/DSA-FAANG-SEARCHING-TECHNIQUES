public class LinearSearch_WealthiestCustomer {
    public static void main(String[] args){
        int[][] accounts = 
        {{1,5},{7,3},{3,5}};
    System.out.println(Wealthiest_Customer(accounts));

    }
    static int Wealthiest_Customer(int[][] accounts){
        int max_wealth = 0;
        for(int customer = 0; customer < accounts.length; customer++){
            int current_amount = 0;
            for(int account = 0; account < accounts[customer].length; account++){
                current_amount += accounts[customer][account];
            }
            if(current_amount > max_wealth){
                max_wealth = current_amount;
            }
        }
        return max_wealth;
    }
    
}
