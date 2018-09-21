package JavaBase;

import java.util.Scanner;

/**
 * Created by garen on 2018/7/10.
 */
public class Demo1 {
    public static void main(String[] args)
    {
        final String b = "123";
        String c= "123";
        String a = "1234";
        System.out.println(a == (b + 4));
        System.out.println(a == (c + 4));
        Scanner scanner = new Scanner(System.in);
    }

}
