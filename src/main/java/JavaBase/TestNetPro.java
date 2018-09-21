package JavaBase;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by garen on 2018/7/13.
 */
public class TestNetPro {
    public static void main(String[] args)
    {
        testProtocol("http://www.abc.org");
        testProtocol("ftp://ibiblio.org/pub/languages/java/javafaq/");
        testProtocol("nfs://utopia.poly.edu/usr/tmp/");
    }

    private static void testProtocol(String url) {
        try {
            URL u = new URL(url);
            System.out.println(u.getProtocol() + " is supported");
        } catch (MalformedURLException e) {
            String protocol = url.substring(0,url.indexOf(':'));
            System.out.println(protocol + " is not supported");
            //e.printStackTrace();
        }

    }
}
