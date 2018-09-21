package JavaBase;

/**
 * Created by garen on 2018/7/9.
 */
public class Demo {
    static
    {
        System.out.println("静态块1");
    }

    public Demo()
    {
        System.out.println("构造块");
    }
    public static void main(String[] args)
    {
        //static int i =1; static不可以用来修饰局部变量
        //运行顺序是所有的static代码块 -- main函数里的方法（顺序执行，包括构造函数的代码块）
        //如果有继承父类的话，是先去加载父类的！！！但是加载优先，所以父类加载完后，会去加载子类，然后再执行父类的方法，
        //最后执行子类的方法。还有成员变量的初始化工作在main执行之前。
        System.out.println("主函数1");
        Demo demo = new Demo();

        System.out.println("主函数2");
    }

    static{
        System.out.println("静态块2");
    }
}
