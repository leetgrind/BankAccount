public class BankAccount {
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        double temp = balance;
        temp = temp + amount;
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("after deposit balance = $" + temp);
        balance = temp;
    }

    public void withdraw(double amount) {

        if(balance < amount) {
            System.out.println("Insufficient funds");
            return;
        }

        double temp = balance;
        temp = balance - amount;
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("after withdraw balance = $" + temp);
        balance = temp;

    }
}
