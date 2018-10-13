package DesignPattern;

/**
 * Created by garen on 2018/10/12.
 */
public class Singleton2 {
    //private static Singleton2 singleton2 = new Singleton2();
    private Singleton2(){}
    private static class T{
        private static Singleton2 t = new Singleton2();
    }
    public static Singleton2 getInstance()
    {
        return T.t;
    }

}
