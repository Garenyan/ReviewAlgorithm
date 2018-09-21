package JavaBase;

/**
 * Created by garen on 2018/7/10.
 */
public class Student {
    private String name;
    private String city;

    public Student(String name,String city)
    {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
