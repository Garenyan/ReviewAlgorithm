package Test;

/**
 * Created by garen on 2018/9/19.
 */
public class FigureTest1 {
    public static void main(String[] args)
    {
        int x=3;
        int y=4;
        int a = s(x,y);
        if (a>4)
        {
            a=a+2;
        }else
        {
            a = a-2;
        }
        System.out.println(a);
    }

    public static int s(int x, int y) {
        int sum = x+y;
        return sum;
    }
}
