package chapterExercise.Homework08;

public class SavingAccount extends BankAccount{
    private double rate = 0.01;
    private int count = 3;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if(count>0){
            super.deposit(amount);
        }else{
            super.deposit(amount-1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if(count>0){
            super.withdraw(amount+1);
        }else{
            super.withdraw(amount-1);
        }
        count--;
    }
    public void earnMonthlyinterest(){
        count = 3;
        super.deposit(getBalance()*rate);
    }
}
