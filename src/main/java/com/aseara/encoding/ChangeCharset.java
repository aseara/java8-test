package com.aseara.encoding;

import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * 字符串编码转换
 * User: aseara
 * Date: 2014/6/6
 * Time: 11:07
 */
public class ChangeCharset {
    /**
     * 7位ASCII字符，也叫ISO646-US，unicode字符集的基本拉丁块
     */
    public static final String US_ASCII = "US-ASCII";

    /**
     * ISO拉丁字母表No.1，也叫ISO-LATIN-1
     */
    public static final String ISO_8859_1 = "ISO-8859-1";

    /**
     * 8位 UCS 转换格式
     */
    public static final String UTF_8 = "UTF-8";

    /**
     * 16位 UCS 转换格式，Big Endian (最低地址存放高位字节) 字节顺序
     */
    public static final String UTF_BE = "UTF-BE";

    /**
     * 16位 UCS 转换格式，Little Endian (最高地址存放高位字节) 字节顺序
     */
    public static final String UTF_LE = "UTF-LE";

    /**
     * 16位 UCS 转换格式，字节顺序由可选的字节顺序标记标识
     */
    public static final String UTF_16 = "UTF-16";

    /**
     * 中文超大字符集
     */
    public static final String GBK = "GBK";

    /**
     * 将字符串编码转换成US-ASCII码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toASCII(String str) throws UnsupportedEncodingException {
        return changeCharset(str, US_ASCII);
    }

    /**
     * 将字符串编码转换成ISO-8859-1码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toISO_8859_1(String str) throws UnsupportedEncodingException {
        return changeCharset(str, ISO_8859_1);
    }

    /**
     * 将字符串编码转换成UTF-8码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toUTF_8(String str) throws UnsupportedEncodingException {
        return changeCharset(str, UTF_8);
    }

    /**
     * 将字符串编码转换成UTF-BE码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toUTF_BE(String str) throws UnsupportedEncodingException {
        return changeCharset(str, UTF_BE);
    }

    /**
     * 将字符串编码转换成UTF-BE码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toUTF_LE(String str) throws UnsupportedEncodingException {
        return changeCharset(str, UTF_LE);
    }

    /**
     * 将字符串编码转换成UTF-16码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toUTF_16(String str) throws UnsupportedEncodingException {
        return changeCharset(str, UTF_16);
    }

    /**
     * 将字符串编码转换成GBK码
     *
     * @param str 待转换编码的字符串
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String toGBK(String str) throws UnsupportedEncodingException {
        return changeCharset(str, GBK);
    }

    /**
     * 字符编码转换
     *
     * @param str        待转换编码的字符串
     * @param newCharset 目标编码
     * @return 转换编码后的字符串
     * @throws UnsupportedEncodingException
     */
    public String changeCharset(String str, String newCharset)
            throws UnsupportedEncodingException {
        if (str == null)
            return null;
        // 用默认字符编码解码字符串
        byte[] bs = str.getBytes();
        // 用新的字符编码生成字符串
        return new String(bs, newCharset);
    }
}
