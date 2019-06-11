public class Example {


    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        BankAccount account = new BankAccount("Uli");

        System.out.println("Hello, " + account.customerName);
        System.out.println("Your Balance is " + account.balance);

        account.deposit(1000);
        System.out.println("Your Balance is " + account.balance);

        account.withdraw(500);
        System.out.println("Your Balance is " + account.balance);
        System.out.println(account.statement());



        BankAccount savingAccount = new SavingAccount("Sachini");

        System.out.println("Hello, " + savingAccount.customerName);
        System.out.println("Your Balance is " + savingAccount.balance);

        savingAccount.deposit(1000);
        System.out.println("Your Balance is " + savingAccount.balance);

        savingAccount.withdraw(500);
        System.out.println("Your Balance is " + savingAccount.balance);

        System.out.println(savingAccount.statement());
    }

}
