package chapterExercise.Homework08;

public class CheckAccount extends BankAccount{
    public CheckAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        setBalance(getBalance()-1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        setBalance(getBalance()-1);
    }
}
