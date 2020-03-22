package datatype;

import org.apache.commons.io.FileUtils;
import util.JedisUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 放了一张图片进去
 */
public class BytesTest {
    public static void main(String[] args) throws IOException {
        System.out.println(Charset.defaultCharset());
        File file = new File("D:/1.png");
        byte[] bytes = FileUtils.readFileToByteArray(file);

        String str = new String(bytes);
        System.out.println(str);

        JedisUtil.getJedisUtil().set("mybytes", str);
    }
}
