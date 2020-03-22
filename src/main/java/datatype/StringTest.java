package datatype;

import util.JedisUtil;

public class StringTest {
    public static void main(String[] args) {
        JedisUtil.getJedisUtil().set("qingshan", "2673");
        // JedisUtil.getJedisUtil().incr("qingshan");

        String qs = JedisUtil.getJedisUtil().get("qingshan");
        System.out.println(qs);


    }
}
