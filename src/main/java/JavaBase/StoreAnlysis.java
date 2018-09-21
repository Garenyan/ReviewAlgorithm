package JavaBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by garen on 2018/8/10.
 */
public class StoreAnlysis {
    public static void main(String[] args)
    {
        int N=0;
        List<Student> students = new ArrayList<>();
        while(N<500)
        {
            Student student = new Student("Yjz"+ N,"wenzhou"+N);
            students.add(student);
            N++;
        }
        int size = students.size();
        System.out.println(size);
        for (int i=0;i<size;i++)
        {
            //if (students.get)
            System.out.println(students.get(i));
        }
    }
}
