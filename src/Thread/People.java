package Thread;

//一个带显式构造函数的类
public class People{
    int age = 23;
    public void getAge(){
        System.out.print("the age is "+ age);
    }

    public People(){

    }

    // 显式声明一个带参数的构造函数，用于初始化年龄
    public People(int a){
        this.age = a;
    }

    public static void main(String[] args) {

        //用这个类来实例化一个对象
        People xiaoMing = new People(20); // 使用带参数的构造函数来实例化对象
        People xiaoMing2 = new People();  // ERROR：一旦显示定义了一个构造函数，就不会再生成默认的构造函数
        xiaoMing.getAge(); // 打印出来的年龄变为20

    }
}



