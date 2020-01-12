package lang;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StringUtilsTester {

    /**
     * 字符串拼接
     */
    @Test
    public void join() {
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("");
        list.add(null);
        list.add("qwe");
        list.add(null);

        String s = StringUtils.join(list, "|");

        System.out.println(s);  // => abc|||qwe|
    }

    /**
     * 字符串缩略
     */
    @Test
    public void abbreviate() {
        String s = "abcdefg";

        // 字符串缩略
        String s1 = StringUtils.abbreviate(s, 2,5);
        System.out.println(s1);

        String s2 = StringUtils.substring(s,-2, -1);
        System.out.println(s2);
    }

    @Test
    public void test() {
        // 判断是否是纯字符串，不包括任何符号或数字
        boolean a = StringUtils.isAlpha("你好");
        System.out.println(a); // true
        boolean b = StringUtils.isAlpha("abc456");
        System.out.println(b); // false

        // 去除换行字符串 如：“\n”,“\r”，“\r\n”
        String chomp = StringUtils.chomp("abc\r\n");
        System.out.println(chomp); // abc

    }

}
