package OrderFood.luoji;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:打印菜单
 */

public class Menu {
    private String password = "688";

    public String getPassword() {
        return password;
    }

    public void showMenu(){
        System.out.println("==========================");
        System.out.println("1.水饺\t素三鲜\t12元/斤");
        System.out.println("2.\t\t酸菜油吱啦\t12元/斤");
        System.out.println("3.猪肉\t\t\t\t16元/斤");
        System.out.println("4.汤饺\t素\t\t5元");
        System.out.println("5.汤饺     肉         5元");
        System.out.println("6.米饭    小碗       2元");
        System.out.println("7.米饭     大碗       3元");
        System.out.println("8.面条    小碗       2元");
        System.out.println("9.面条     中碗        3元");
        System.out.println("10.面条    大碗        4元");
        System.out.println("11.罗豆子  小碗         2元");
        System.out.println("12.罗豆子  大碗         3元");
        System.out.println("13.鸡蛋炒面          6元");
        System.out.println("14.火腿炒面           6元");
        System.out.println("15.肉炒面             7元");
        System.out.println("16.鸡蛋炒饭           6元");
        System.out.println("17.扬州炒饭           7元");
        System.out.println("18.旦旦面     小碗        4元");
        System.out.println("19.旦旦面     大碗        5元");
        System.out.println("鱼类");
        System.out.println("20.鲤鱼(豆瓣、红烧、清蒸)   30元");
        System.out.println("21.刀鱼(干炸、红烧、家炖)   16元");
        System.out.println("22.小黄鱼(干炸、干煎)      30元");
        System.out.println("23.青鱼(干煎、家炖)        30元");
        System.out.println("24.点单完成,进行下一单");
        System.out.println("25.退出系统（所有数据将清零）");
        System.out.println("26.管理员管理页面(非工作人员请勿选择)");
        System.out.println("==========================");
    }
    public void AdminMenu(){
        System.out.println("==========================");
        System.out.println("1.设置优惠菜品");
        System.out.println("2.查看剩余供应量");
        System.out.println("3.统计菜品消费量");
        System.out.println("4.查看总营收金额、平均消费额");
        System.out.println("5.赠送菜品详情");
        System.out.println("6.查看所有会员信息");
        System.out.println("7.退出管理员系统，进入点单界面");
        System.out.println("==========================");
    }
    public void giveMenu(){
        System.out.println("==========================");
        System.out.println("您的消费已超过100元，可以免费赠送单价低于10元的菜品一份");
        System.out.println("1.肉汤饺");
        System.out.println("2.大碗米饭");
        System.out.println("3.大碗面条");
        System.out.println("4.大碗罗豆子");
        System.out.println("5.鸡蛋炒面");
        System.out.println("==========================");
    }
}
