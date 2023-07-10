class MinBalanceException extends Exception {
    public MinBalanceException(){
        System.out.println("Balance is low");
    }
}

public class balance {
    public static void main(String[] args) {
        try {
            int acc[] = { 100, 101, 102, 103, 104, 105 };
            double balance[] = {900, 2000, 1500, 1765.58};
            for(int i = 0; i<5; i++){
                System.out.println("Account no: " + acc[i] + "Balance: " + balance[i]);

                if(balance[i] < 1000){
                    throw new MinBalanceException(); // throwing user defined exception
                }

            }
        } catch (MinBalanceException e) {
            System.out.println("Exception caught");
        }
    }
}
// NOTE: CONSTRUCTOR AND CLASS NAME SHOULD BE SAME