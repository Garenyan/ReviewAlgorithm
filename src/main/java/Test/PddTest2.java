package Test;

import java.util.Scanner;

/**
 * Created by garen on 2018/8/30.
 */
public class PddTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] c = new char[n][m];
        for(int i = 0; i < n; i++){
            String line = sc.next();
            c[i] = line.toCharArray();
        }
        // 判断每一列
        for (int i = 0; i < m; i++) {
            change(c,i,0,-1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
    //index1 列索引
    //index2 行索引
    // lastx 从上往下标记之前处理的 x
    // 递归处理碰到的 x
    public static void change(char[][] c,int index1,int index2,int lastx){
        if (index2 == c.length){
            for (int i = lastx + 1; i < index2; i++) {
                c[i][index1]  = '.';
            }
            return;
        }
        if (c[index2][index1] != 'x'){
            change(c,index1,++index2,lastx);
        }else {
            // index2 和 lastx 之间的元素 从下往上排列 o
            int count = 0;
            for (int i = lastx + 1; i < index2; i++) {
                if (c[i][index1] == 'o'){
                    count++;
                }
            }
            int tempCount = count;
            while (count > 0){
                c[index2-count][index1]  = 'o';
                count--;
            }
            // o 填完了，都填 .
            for (int i = lastx + 1; i < index2 - tempCount; i++) {
                c[i][index1]  = '.';
            }
            lastx = index2;
            change(c,index1,++index2,lastx);
        }
    }

}
