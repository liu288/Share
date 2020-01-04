package encode;

import com.utils.encode.MD5Utils;
import org.junit.Test;

public class EncodeTest {

    /**
     *  MD5加密测试
     */
    @Test
    public void test() {
        String s = "abc";

        String res = MD5Utils.MD5Encode(s);

        System.out.println(res);
    }

}
