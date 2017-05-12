package com.example.ht.common;

import android.util.Patterns;

/**
 * String  字符串
 */

public class StringUtil {

    public StringUtil() {
    }

    /**
     * 判断为空字符串
     *
     * @param cs 字符串
     * @return true: 空  false: 非空
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 判断为 非空字符串
     *
     * @param cs 字符串
     * @return true 非空字符串 false 空字符串
     */
    public static boolean isNotEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }

    /**
     * 判断是否是手机号
     *
     * @param phoneNum 手机号
     * @return true 是 false 不是手机号
     */
    public static boolean isPhone(String phoneNum) {
        return isNotEmpty(phoneNum) && phoneNum.matches(Patterns.PHONE.pattern());
    }

    /**
     * 判断两个字符串是否相等
     *
     * @param str1 str 1
     * @param str2 str 2
     * @return true 相同  false 不相同
     */
    public static boolean equals(String str1, String str2) {
        return (str1 == null && str2 == null) ||
                (isNotEmpty(str1) && str1.equals(str2));
    }

    /**
     * 是否是 Email
     *
     * @param email Email
     * @return true  是email false 非email
     */
    public static boolean isEmail(String email) {
        return isNotEmpty(email) && email.matches(Patterns.EMAIL_ADDRESS.pattern());
    }
}
