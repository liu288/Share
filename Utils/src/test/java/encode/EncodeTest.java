import com.utils.encode.MD5Utils;
import org.junit.Test;

public class EncodeTest {

    @Test
    public void test() {
        String s = "abc";

        String res = MD5Utils.MD5Encode(s, null);

        System.out.println(res);

        String res2 = MD5Utils.MD5Encode(s, null);

        System.out.println(res2);
    }

}
