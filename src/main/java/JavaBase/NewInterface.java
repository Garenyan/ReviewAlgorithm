package JavaBase;

/**
 * Created by garen on 2018/8/3.
 */
public interface NewInterface {
    static void method1()
    {
        System.out.println("111");
    }

    void method2();

    default void method3()
    {
        System.out.println("222");
    }
}
