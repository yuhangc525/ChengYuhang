package CustomGeneric;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/10
 * @describe:
 */

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

//在接口中，静态成员不能使用泛型
//没有指定类型，默认为object
interface IUsb<U,R>{
    //普通方法中，可以使用接口泛型
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    //在idk8中，可以在接口中，使用默认方法，也是可以使用泛型
    default R method(U u){
        return null;
    }
}
//在继承接口时，指定泛型接口的类型
interface IA extends IUsb<String ,Double>{

}
class A implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}