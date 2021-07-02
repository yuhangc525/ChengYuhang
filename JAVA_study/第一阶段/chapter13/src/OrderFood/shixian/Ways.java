package OrderFood.shixian;

import OrderFood.Tools.Tools;
import OrderFood.luoji.Menu;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Date;

/*
 * @author:程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:点餐系统方法层
 */


public class Ways {
    String[] names;//菜品名字
    double allMoney = 0;//总钱数
    double[] fact_money;//定义每个实际营收金额数组，默认值为0
    Menu smenu;
    double money = 0;//本次销售金额，每结束一笔订单，需要重置
    String str = "";//本次点单详情信息
    int orders = 0;//订单数量
    int[] prices = {12, 12, 16, 5, 5, 2, 3, 2, 3, 4, 2, 3, 6, 6, 7, 6, 7, 4, 5, 30, 16, 30, 30};//存储价格
    int[] nums;//储存点菜数量，默认0
    int[] all_nums;//储存每个菜品的总消费量，默认0
    double[] discount;//储存各菜品打折力度，默认为100%
    int[] stock = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5};//定义每个菜品的存量
    int[] sales;//定义每个菜品的总销量,，默认为0
    String password = "688";
    Vip[] vips;//存储会员对象信息
    int vip_num;//存储会员个数，数组内第一个为null的下标
    String[] give_food;
    int[] give_index = {4,6,9,11,12};
    int[] give_num = {0,0,0,0,0};//记录每次赠送的品种
    int[] give_allnum = {0,0,0,0,0};//记录赠送菜品总个数
    SimpleDateFormat df;

    public Ways() {
        names = new String[]{"素三鲜", "酸菜油吱啦", "猪肉", "素汤饺", "肉汤饺", "小碗米饭", "大碗米饭",
                "小碗面条", "中碗面条", "大碗面条", "小碗罗豆子", "大碗罗豆子", "鸡蛋炒面", "火腿炒面",
                "肉炒面", "鸡蛋炒饭", "扬州炒饭", "小碗旦旦面", "大碗旦旦面", "鲤鱼", "刀鱼", "小黄花",
                "青鱼"};
        nums = new int[23];
        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        discount = new double[23];
        sales = new int[23];
        fact_money = new double[23];
        all_nums = new int[23];
        vips = new Vip[10];
        smenu = new Menu();
        vips[0] = new Vip("123", 1280);
        vips[1] = new Vip("456", 500);
        give_food = new String[]{"肉汤饺","大碗米饭","大碗面条","大碗罗豆子","鸡蛋炒面"};
        //对点菜数量进行初始化
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
            sales[i] = 0;
            fact_money[i] = 0;
            all_nums[i] = 0;
            discount[i] = 1;
        }
        for (int i = 0; i < vips.length; i++) {
            if (vips[i] == null) {
                vip_num = i;
                break;
            }
        }
    }

    //进行点菜，输出菜品信息，并统计数量
    public boolean Order(int choice) {
        int index = choice - 1;
        System.out.printf("本次点菜商品为%s，单价（或每斤）为%.2f元\n", names[index], prices[index] * discount[index]);
        System.out.printf("本菜品库存:%d\n", stock[index]);
        System.out.println("请输入您要的数量（或斤）：");
        int num = Tools.getNum();
        if (num > stock[index]) {
            return false;
        }
        nums[index] = num;
        all_nums[index] += num;
        fact_money[index] += num * prices[index] * discount[index];
        money += num * prices[index] * discount[index];
        str += String.format("%s\t%d\n", names[index], num);//格式化订单详情信息
        return true;
    }

    //总结每个菜品的总销量,并重置销量数组,赠送数组,更新库存数组
    public void UpdateStock() {
        for (int i = 0; i < sales.length; i++) {
            sales[i] += nums[i];
            stock[i] -= nums[i];
            nums[i] = 0;
        }
        for (int i = 0; i < give_num.length; i++) {
            int index = give_index[i];
            stock[index] -= give_num[i];
            give_allnum[i] += give_num[i];
            give_num[i] = 0;
        }
        allMoney += money;
        money = 0;//重置单次钱数
        str = "";//重置商品详情
        System.out.println("初始化完成");
    }

    public boolean show_Vip() {
        System.out.println("金卡会员七折，银卡会员八折，普通会员七折");
        System.out.println("请问您是否为会员：");
        System.out.println("1.是\t2.否\t3.充值会员");
        int choice = Tools.getChoice(3);
        switch (choice) {
            case 1:
                System.out.println("请输入您的电话");
                String phone = Tools.getString();
                for (Vip vip : vips) {
                    if (vip != null) {
                        if (vip.getPhone().equals(phone)) {
                            double temp = vip.resume(money);
                            if (temp != -1) {
                                money = temp;
                                return true;
                            }
                        }
                        System.out.println("暂无该会员，付款失败");
                        return false;
                    }
                }

            case 2:
                System.out.println("请付款:");
                double pay = Tools.getDouble();
                if (pay >= money) {
                    System.out.println("付款成功，请叫号用餐");
                    return true;
                } else {
                    System.out.println("付款失败");
                    return false;
                }
            case 3:
                System.out.println("充值会员");
                System.out.println("请输入您的电话：");
                String vipphone = Tools.getString();
                System.out.println("请输入充值钱数：");
                double vipmoney = Tools.getDouble();
                vips[vip_num] = new Vip(vipphone, vipmoney);
                vip_num++;
                System.out.println("会员建立成功，将进行扣费");
                double temp = vips[vip_num].resume(money);
                if (temp != -1) {
                    System.out.println("付款成功");
                    money = temp;
                    return true;
                }
                return false;
            default:
                System.out.println("请重新点单");
                return false;
        }
    }

    public void Bill() {
        orders++;
        System.out.println("订单编号\t排队序号\t订单总金额(元)\t订单时间");
        System.out.printf("%d\t%d\t%.2f\t", orders, orders, money);
        System.out.println(df.format(new Date()));
        System.out.println("菜品详情：\n菜名\t数量");
        System.out.println(str);
    }

    public boolean Password() {
        System.out.println("请输入验证密码（只有一次机会）：");
        String verify = Tools.getString();
        return password.equals(verify);
    }

    public void show_AdminMenu() {
        boolean sloop = true;
        do {
            smenu.AdminMenu();
            int s_choice = Tools.getChoice(7);
            switch (s_choice) {
                case 1:
                    System.out.println("设置优惠菜品");
                    System.out.println("输入打折菜品编号：");
                    int forSale = Tools.getNum();
                    System.out.println("输入打折力度：");
                    double sale = Tools.getDouble();
                    discount[forSale - 1] = sale;
                    System.out.println("设置完成");
                    continue;
                case 2:
                    System.out.println("查看剩余供应量：");
                    System.out.println("菜名\t库存");
                    for (int i = 0; i < stock.length; i++) {
                        System.out.printf("%s\t%d\n", names[i], stock[i]);
                    }
                    System.out.println();
                    continue;
                case 3:
                    System.out.println("查看菜品消费量及实际营收：");
                    viewConsume();
                    continue;
                case 4:
                    System.out.println("查看总营收金额");
                    System.out.println("总营收金额\t平均消费额");
                    System.out.printf("%.2f\t%.2f\n", allMoney, allMoney / orders);
                    continue;
                case 5:
                    System.out.println("赠送菜品详情");
                    System.out.println("菜名\t\t数量");
                    for (int i = 0; i < give_food.length; i++) {
                        System.out.printf("%-8s%-5d\n",give_food[i],give_allnum[i]);
                    }
                    continue;
                case 6:
                    showvips();
                    continue;
                case 7:
                    sloop = false;
                    continue;
                default:
                    System.out.println("输入错误");
            }
        } while (sloop);
    }

    public void showvips() {
        for (Vip vip : vips) {
            if (vip != null) {
                System.out.println(vip.toString());
            }
        }
    }

    public void viewConsume() {
        System.out.println("1.菜品消费量正序");
        System.out.println("2.菜品消费量倒序");
        System.out.println("3.实际营收正序");
        System.out.println("4.实际营收倒序");
        System.out.println("请输入您的选择：");
        int cho = Tools.getChoice(4);
        switch (cho) {
            case 1:
                int[] sort_ = Tools.line(all_nums);
                print_(sort_,1);
                break;
            case 2:
                sort_ = Tools.line(all_nums);
                print_(sort_,2);
                break;
            case 3:
                sort_ = Tools.line(fact_money);
                print_(sort_,1);
                break;
            case 4:
                sort_ = Tools.line(fact_money);
                print_(sort_,2);
                break;
            default:
                System.out.println("选择错误");
        }


        System.out.println();
    }

    public void print_(int[] sort_, int way) {
        int n = sort_.length;
        if (way == 1) {
            System.out.println("菜名\t\t消费量\t实际营收");
            for (int index : sort_) {
                System.out.printf("%-8s%8d%8.2f\n", names[index], all_nums[index], fact_money[index]);
            }
        } else if (way == 2) {
            System.out.println("菜名\t\t消费量\t实际营收(元)");
            for (int i = 0; i < n; i++) {
                int index = sort_[names.length-1-i];
                System.out.printf("%-8s%8d%8.2f\n", names[index], all_nums[index], fact_money[index]);
            }
            System.out.println();
        }else {
            System.out.println("参数错误");
        }
    }
    //判断是否具有送菜资格
    public boolean give(){
        return !(money < 100);
    }
    public void show_give(){
        smenu.giveMenu();
        do {
            System.out.println("请输入您的选择：");
            int choice = Tools.getChoice(5);
            int index = choice - 1;
            int all_index = give_index[index];
            if (stock[all_index]>0){
                give_num[index] += 1;
                System.out.println("选择成功");
                return;
            }
            System.out.println("该商品库存不足，请重新选择");
        }while (true);
    }
}