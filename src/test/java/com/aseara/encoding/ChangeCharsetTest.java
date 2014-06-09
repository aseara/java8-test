package com.aseara.encoding;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import static com.aseara.encoding.ChangeCharset.*;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/6/6
 * Time: 16:13
 */
public class ChangeCharsetTest {

    private static final ChangeCharset test = new ChangeCharset();

    private String str;
    private String charset;

    @Before
    public void before() {
        str = "This is a 中文的 String";
    }

    @Test
    public void testGBK()
            throws UnsupportedEncodingException {
        charset = GBK;
        str = test.toGBK(str);
    }

    @Test
    public void testASCII()
            throws UnsupportedEncodingException {
        charset = US_ASCII;
        str = test.toASCII(str);
    }

    @Test
    public void testISO88591()
            throws UnsupportedEncodingException {
        charset = ISO_8859_1;
        str = test.toISO_8859_1(str);
    }

    @Test
    public void testUTF8()
            throws UnsupportedEncodingException {
        charset = UTF_8;
        str = test.toUTF_8(str);
    }

    @Test
    public void testUTFBE()
            throws UnsupportedEncodingException {
        charset = UTF_BE;
        str = test.toUTF_BE(str);
    }

    @Test
    public void testUTFLE()
            throws UnsupportedEncodingException {
        charset = UTF_LE;
        str = test.toUTF_LE(str);
    }

    @Test
    public void testUTF16()
            throws UnsupportedEncodingException {
        charset = UTF_16;
        str = test.toUTF_16(str);
    }

    @After
    public void after()
            throws UnsupportedEncodingException {
        System.out.println("转换成" + charset + "码: " + str);
        String gbk = test.changeCharset(str, GBK);
        System.out.println("再把" + charset + "码的字符串转换成GBK码的字符串: " + gbk);
        System.out.println();
    }
}
