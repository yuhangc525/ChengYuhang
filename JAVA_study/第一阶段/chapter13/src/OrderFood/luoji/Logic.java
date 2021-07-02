package OrderFood.luoji;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:点餐系统逻辑层
 */

import OrderFood.Tools.Tools;
import OrderFood.shixian.Ways;

public class Logic {
    public void show_menu(){
        Menu menu = new Menu();
        Ways ways = new Ways();
        Boolean loop = true;
        int choice;
        do{
            menu.showMenu();
            System.out.println("请根据菜单前序号选择：");
            choice = Tools.getChoice(26);//得到菜单选项

            switch (choice){
                case 24:
                    //1.输出账单
                    if(ways.give()){
                        ways.show_give();
                    }
                    ways.Bill();
                    //2.总结总销量，,付款成功后初始化本次销售信息
                    if (ways.show_Vip()) {
                        ways.UpdateStock();
                    }
                    continue;
                case 25:
                    loop = false;
                    continue;
                case 26:
                    if (ways.Password()) {
                        ways.show_AdminMenu();
                    }
                    continue;
                default:
                    if (!ways.Order(choice)){
                        System.out.println("抱歉，库存不足，请重新选择");
                    }
            }
        }while(loop);
    }

}
