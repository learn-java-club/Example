public class SavingAccount  extends BankAccount{
    SavingAccount(String userName) {
        super(userName); // Parent constructor
    }

    public float getRate() {
        return 1.5f;
    }

    public String statement(){

        return "This is a saving account";
    }
}
