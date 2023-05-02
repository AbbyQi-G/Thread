package Thread;
// 1.创建一个继承Thread的子类
class PrintNumber extends Thread{

    // 2.重写Thread的run()方法,将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class EvenNumberTest {

    public static void main(String[] args) {
        // 3.新建当前Thread的子类的对象
        PrintNumber t1 = new PrintNumber();

        // 4.通过对象调用start()方法
        t1.start();
    }

}

// v2.0