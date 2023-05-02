package Thread;

class EvenNumber extends Thread {
    public void run(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class OddNumber extends Thread {
    public void run(){
        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class EvenOddNumber {
    public static void main(String[] args) {
        EvenNumber t1 = new EvenNumber();
        t1.start();

        OddNumber t2 = new OddNumber();
        t2.start();
    }



}
