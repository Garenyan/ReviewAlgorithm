package Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by garen on 2018/9/7.
 */
public class AtomicTest {

    public static void main(String[] args)
    {
        File file = new File("");
        System.out.println(getString());

    }
    public static String getString()
    {
        String str = "a";
        try
        {
            str = String.valueOf('b').concat(null);
        }catch (Exception e)
        {
            str = "c";

        }
        finally {
            str = "d";
        }
        return  str;
    }

}
