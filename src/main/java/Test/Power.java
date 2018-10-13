package Test;

import java.util.Scanner;

/**
 * Created by garen on 2018/9/26.
 */
public class Power {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Boolean a = IsPower(16*16*16*16);
        System.out.println(a);
    }

    //这个是判断一个数（number）是否是另一个数的powerNumber次方的问题

         private static boolean IsPower(int number)
         {
             boolean result = false;
             if (number <= 0 || number % 4 != 0) return false;

             if (number / 4 > 1)
             {
                 result = IsPower(number / 4);
             }
             else
             {
                 result = number % 4 == 0;
             }
             return result;
         }

}
