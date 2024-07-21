public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
}
