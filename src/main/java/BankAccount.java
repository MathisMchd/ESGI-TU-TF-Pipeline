public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.owner = owner;
        this.balance = initialBalance;
    }


    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le dépot ne doit pas etre négatif");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Le retrait doit etre positif.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Fonds insuffisants.");
        }
        balance -= amount;
    }
}
