package CustomGeneric;/*
 * @author: 程宇航
 * @version: 1.0
 * @date: 2021/7/10
 * @describe:
 */

public class CustomGeneric {
    public static void main(String[] args) {

    }
}
class Tiger<T,R,M>{
    String name;
    R r;
    M m;
    T t;
//因为静态方法是和类相关的，在类加载时，对象还没有创建
    //所以，如果静态方法和静态属性使用了泛型，jvm就没法初始化】
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }
}