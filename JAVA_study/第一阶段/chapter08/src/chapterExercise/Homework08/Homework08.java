package chapterExercise.Homework08;

public class Homework08 {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1000);
        checkAccount.deposit(100);
        System.out.println(checkAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.earnMonthlyinterest();
        System.out.println(savingAccount.getBalance());

    }
}
