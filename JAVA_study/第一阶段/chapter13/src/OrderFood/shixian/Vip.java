package OrderFood.shixian;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/22
 * @describe:
 */

public class Vip {
    private String phone;
    private double balance;
    private String grade;
    private double rate;

    public String getPhone() {
        return phone;
    }

    public double getBalance() {
        return balance;
    }

    public String getGrade() {
        return grade;
    }

    public double getRate() {
        return rate;
    }

    public Vip(String phone, double balance) {//构造器
        this.phone = phone;
        this.balance = balance;
        renew();//判断等级及折扣系数
    }

    //消费方法，输入为总钱数，根据折扣系数进行打折
    //付款成功返回折扣后钱数，付款失败返回-1
    public double resume(double cost) {
        double fact_cost = cost * rate;
        if (fact_cost > balance) {
            System.out.println("余额不足");
            return -1;
        } else {
            this.balance -= fact_cost;
            System.out.printf("付款成功,实付款%.2f元\n",fact_cost);
            System.out.printf("余额为%.2f\n",getBalance());
            return fact_cost;
        }
    }

    public void recharge(double money) {//充值方法,判断更新等级、折扣系数
        this.balance += money;
        renew();
    }

    //更新等级，折扣系数的方法
    public void renew() {
        if (balance > 0 && balance <= 1000) {
            this.rate = 0.9;
            grade = "普通";
        } else if (balance > 1000 && balance <= 2000) {
            this.rate = 0.8;
            grade = "银卡";
        } else {
            this.rate = 0.7;
            grade = "金卡";
        }
    }

    @Override
    public String toString() {
        return String.format("会员%s为%s会员，余额%.2f，享受%.1f折",
                getPhone(),getGrade(),getBalance(),getRate());
    }
}
