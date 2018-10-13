package DesignPattern;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by garen on 2018/10/12.
 * 单例模式双重校验锁
 */
public class Singleton {
    private static volatile Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            synchronized (Singleton.class)
            {
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
