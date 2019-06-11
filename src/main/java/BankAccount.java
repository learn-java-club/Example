public class BankAccount {

    public String customerName;
    public float balance;

    BankAccount(String userName){
        this.customerName= userName;
        this.balance =0;
    }

    //Deposit method

    public void deposit(int amount){
        balance = balance + (amount * this.getRate());
    //    balance += amount;
    }

    public void withdraw(int amount){
           balance -= amount;
    }

    public float getRate() {
        return 1.0f;
    }

    public String statement(){

        return "This is a bank account";
    }

}
