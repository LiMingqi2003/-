package org.example;

import java.util.regex.Pattern;

public class EmailTest {
    public static void main(String[] args) {
        String str="1234@qq.com";
        System.out.println(isEmail(str));

        String str1="1234";
        System.out.println(isEmail(str1));
    }

    public static boolean isEmail(String email) {
        if (email == null || email.length() < 1 || email.length() > 256) {
            return false;
        }
        Pattern pattern = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
        return pattern.matcher(email).matches();
    }

}
