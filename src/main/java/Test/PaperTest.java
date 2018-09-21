package Test;

/**
 * Created by garen on 2018/9/1.
 */
public class PaperTest {
    public static void main(String[] args)
    {
        int x=13,y=3,z=5;
        PaperTest paperTest = new PaperTest();
        paperTest.switch_block();

    }

    public  void switch_block() {
        int i=6;
        int y=0;
        switch (i)
        {
            case 1:
                y=y+1;
                break;
            case 2:
                y=y+3;
                break;
            case 5:
                y=y+4;
                break;

        }

    }
}
