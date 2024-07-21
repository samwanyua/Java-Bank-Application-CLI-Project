public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = -amount;
        }
    }

    public void withdraw(int amount){
        if(previousTransaction != 0){
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    public void getPreviousTransaction(){
        if(previousTransaction  > 0){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction) );
        }
        else{
            System.out.println("No transaction happened");
        }
    }


}
