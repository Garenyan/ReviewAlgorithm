package JavaBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by garen on 2018/8/1.
 */
public class JavaLambda {
    public static void main(String[] args)
    {
        String s = "111";
        JavaLambda javaLambda = new JavaLambda();
        //javaLambda.func(() -> System.out.println("1111"));
        int count =0;
        long a =0;
        List<Student> students = new ArrayList<>();
        students.add(new Student("yjz","wenzhou"));
        students.add(new Student("wyy","wenzhou"));
        students.add(new Student("bzq","hangzhou"));
        students.add(new Student("zl","qqhe"));
        students.add(new Student("whq","taizhou"));
        students.add(new Student("xkh","lishui"));
        a = students.stream().filter((student -> student.getCity().equals("wenzhou"))).count();
        System.out.println(a);
    }

    public void func()
    {
        //System.out.println("1111");
    }

}
