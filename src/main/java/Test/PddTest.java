package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by garen on 2018/8/30.
 */
public class PddTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int HP = sc.nextInt();
        int normalAttract = sc.nextInt();
        int buffedAttack = sc.nextInt();
        int n=0;
        if ((HP%normalAttract) == 0){
            n = HP / normalAttract ;
        }
        else
            n = HP/normalAttract + 1;

        List<Integer> sumList = new ArrayList<>();
        for (int i=0;i<=n;i++)
        {
            int m=0;
            if (((HP - i*normalAttract) % buffedAttack) ==0)
            {
                m = (HP - i*normalAttract) / buffedAttack;
            }
            else
            {
                m = (HP - i*normalAttract) / buffedAttack + 1;
            }
            int sum = i + 2* m;
            sumList.add(sum);
        }
        int temp=sumList.get(0);
        for (int i=1;i<sumList.size();i++)
        {
           if (temp>sumList.get(i))
           {
               temp = sumList.get(i);
           }
    }
        System.out.println(temp);
    }
}
