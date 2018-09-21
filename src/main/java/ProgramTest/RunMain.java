package ProgramTest;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by garen on 2018/7/9.
 */
public class RunMain {
    //有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
    //要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
    //输入描述:
    //每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，
    //接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。
    //接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
    //输出描述:
    //输出一行表示最大的乘积。
    //示例：输入：
    //3
    //7 4 7
    //2 50
    //输出：49
    public static void main(String[] args)
    {
        //首先获取所有合法输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n<1) || (n>50))
        {
            return;
        }
        int[] array = new int[n];
        for (int i=0;i<n;i++)
        {
            int ai = scanner.nextInt();
           if ((ai>=-50) && (ai<=50))
           {
               array[i] = ai;
           }
           else
               return;
        }

        int k = scanner.nextInt();
        if ((k<1) || (k>10) || (k>n))
        {
            return;
        }
        int d = scanner.nextInt();
        if ((d<1) || (d>50))
        {
            return;
        }

        //开始正式处理数据，得出结果
        long s = System.currentTimeMillis();
        RunMain runMain = new RunMain();
        int maxValue = runMain.getMaxValue(n,array,k,d);
        long e = System.currentTimeMillis();
        System.out.println(e-s);
        System.out.println(maxValue);

    }

    private int getMaxValue(int n, int[] array, int k, int d) {
      return 0;
    }

}
