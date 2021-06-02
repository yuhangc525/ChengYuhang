package chapterExercise.Homework13;

public class test {
    public static void main(String[] args) {
        A a = new A();
           a.B(10100);

    }
}
class A{
    public void daoxu(int num){
        if (num == 0){
            return;
        }else{
            System.out.print(num % 10);
            daoxu(num/10);
        }
    }

    public void B(int num){
        int n = 0;
        int number = num;
        do{
            number = number /10;
            n++;
            if(number == 0){
                break;
            }
        }while(true);
        for (int i = 0; i < n; i++) {
            System.out.print(num % 10);
            num = num / 10;
        }
//        System.out.println(n);
    }
}
