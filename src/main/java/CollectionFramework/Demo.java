package CollectionFramework;

import java.util.*;

/**
 * Created by garen on 2018/8/8.
 */
public class Demo {
    public static void main(String[] args)
    {
        List<String> strings = new ArrayList<String>();
        Set<String> stringSet = new HashSet<String>();
        Map<String,String> stringMap = new LinkedHashMap<>();
        strings.add("1234");
        strings.add("123");
        strings.add("12");
        strings.add("1234");
        int size1 = strings.size();
        System.out.println(size1);

        stringSet.add("123");
        stringSet.add("1234");
        stringSet.add("123");
        stringSet.add("12");
        int size2 = stringSet.size();
        System.out.println(size2);
        //结果为3，说明add操作是可以允许重复的，也就是重复的在编译阶段是没问题的，只不过在读取时，set
        //把重复的去掉了
        for(int i=0;i<size1;i++)
        {
            System.out.println(strings.get(i));
        }

        for (String string:stringSet)
        {
            //无论第几次运行 ，结果都为12 123 1234
            System.out.println(string);
        }

        stringMap.put("1","12");
        stringMap.put("2","123");
        stringMap.put(null,"1234"); //hashMap,LinkedHashMap的键可以为空
        for (Map.Entry<String,String> entry :stringMap.entrySet())
        {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }



    }
}
