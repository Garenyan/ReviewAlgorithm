package JavaBase;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by garen on 2018/7/12.
 */
public class InterProgram {
    public static void main(String[] args){
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String ip = inetAddress.getHostAddress();
            System.out.println(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
