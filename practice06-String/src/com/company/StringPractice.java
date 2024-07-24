package com.company;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringPractice {
    public static void main (String[] args) throws UnsupportedEncodingException {
        // constructor
        String str = "hello";
        String str1 = new String();
        String str2 = new String(new byte[]{65, 97});
        String str3 = new String(new byte[]{65, 66, 67}, 1, 2);
        String str4 = new String(new byte[]{65, 66, 67}, Charset.forName("gbk"));
        String str5 = new String(new byte[]{65, 66, 67, 68}, 2, 2, Charset.forName("utf-8"));
        String str6 = new String(new byte[]{65, 66, 67}, "utf8");
        String str7 = new String(new char[]{'a','b'});
        String str8 = new String(new char[]{'a','b'}, 1, 1);
        String str9 = new String(new int[]{96, 97, 98, 99}, 1, 3);
        String str10 = new String(str);
        StringBuffer stringBuffer = new StringBuffer("StringBuffer");
        StringBuilder stringBuilder = new StringBuilder("StringBuilder");

        String str11 = new String(stringBuffer);
        String str12 = new String(stringBuilder);
//        System.out.println(str11.hashCode() == stringBuffer.hashCode());
//        System.out.println(str12.hashCode() == stringBuilder.hashCode());

        // method
        // charAt
        System.out.println(str.charAt(1));
        for (int index = 0; index < str.length(); index++) {
            System.out.print(str.charAt(index));
        }
        System.out.println();

        // chars
        IntStream intStream = str.chars();

        // IntStream usage 1: print the content
//        intStream.forEach(System.out::println);
//        intStream.forEach((ele) -> System.out.print((char)ele));

        // IntStream usage 2: filter
//        intStream.filter(Character::isLetter).forEach((ele) -> System.out.print((char)ele));
        System.out.println(intStream.filter(ele -> ele == 'l').count());


    }
}