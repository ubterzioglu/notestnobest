package sample_java_encapsulation;

class BankAccount {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        System.out.println(acc.getBalance());
    }
}

