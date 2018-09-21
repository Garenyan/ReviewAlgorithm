package Test;

import SortAlgorithm.MySortAlgorithm;

/**
 * Created by garen on 2018/9/21.
 */
public class SortTest {
    public static void main(String[] args){
        //int[] a= {1,2,5,4,7,22,9,3,6,11,16,12,8,69,4,55,71};
        int[] a = new int[10000];
        for (int i=0;i<10000;i++)
        {
            a[i] = 10000- i ;
        }
        MySortAlgorithm mySortAlgorithm = new MySortAlgorithm();
        //先冒泡排序
        long s1 = System.currentTimeMillis();
        mySortAlgorithm.bubbleSort(a);
        long e1 = System.currentTimeMillis();
        System.out.println("冒泡排序时间为：" + (e1-s1)+"ms");
        //快速排序
        for (int i=0;i<10000;i++)
        {
            a[i] = 10000- i ;
        }


        long s2 = System.currentTimeMillis();
        mySortAlgorithm.QuickSort(a);
        long e2 = System.currentTimeMillis();
        System.out.println("快速排序时间为：" + (e2-s2)+"ms");

        //堆排序
        for (int i=0;i<10000;i++)
        {
            a[i] = 10000- i ;
        }


        long s3 = System.currentTimeMillis();
        mySortAlgorithm.HeapSort(a);
        long e3 = System.currentTimeMillis();
        System.out.println("堆排序时间为：" + (e3-s3)+"ms");

        //归并排序
        for (int i=0;i<10000;i++)
        {
            a[i] = 10000- i ;
        }


        long s4 = System.currentTimeMillis();
        mySortAlgorithm.bubbleSort(a);
        long e4 = System.currentTimeMillis();
        System.out.println("归并排序时间为：" + (e4-s4)+"ms");

        //希尔排序
        for (int i=0;i<10000;i++)
        {
            a[i] = 10000- i ;
        }


        long s5 = System.currentTimeMillis();
        mySortAlgorithm.bubbleSort(a);
        long e5 = System.currentTimeMillis();
        System.out.println("希尔排序时间为：" + (e5-s5)+"ms");

    }
}
