package com.connectionString;

public class mainTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1.concat(s2);
        System.out.println(s1.concat(s2) == s1 + s2);
    }
}
