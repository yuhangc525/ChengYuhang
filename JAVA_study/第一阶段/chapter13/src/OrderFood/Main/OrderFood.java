package OrderFood.Main;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/6/21
 * @describe:点餐系统主方法
 */

import OrderFood.luoji.Logic;

public class OrderFood {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.show_menu();
    }
}
