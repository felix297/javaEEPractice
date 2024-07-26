package com.company;

import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Date;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringPractice {
    public static void main (String[] args) throws UnsupportedEncodingException {
        // constructor
//        String str = "hello";
//        String str1 = new String();
//        String str2 = new String(new byte[]{65, 97});
//        String str3 = new String(new byte[]{65, 66, 67}, 1, 2);
//        String str4 = new String(new byte[]{65, 66, 67}, Charset.forName("gbk"));
//        String str5 = new String(new byte[]{65, 66, 67, 68}, 2, 2, Charset.forName("utf-8"));
//        String str6 = new String(new byte[]{65, 66, 67}, "utf8");
//        String str7 = new String(new char[]{'a','b'});
//        String str8 = new String(new char[]{'a','b'}, 1, 1);
//        String str9 = new String(new int[]{96, 97, 98, 99}, 1, 3);
//        String str10 = new String(str);
//        StringBuffer stringBuffer = new StringBuffer("StringBuffer");
//        StringBuilder stringBuilder = new StringBuilder("StringBuilder");
//
//        String str11 = new String(stringBuffer);
//        String str12 = new String(stringBuilder);
//        System.out.println(str11.hashCode() == stringBuffer.hashCode());
//        System.out.println(str12.hashCode() == stringBuilder.hashCode());

        // method
        // charAt
//        System.out.println(str.charAt(1));
//        for (int index = 0; index < str.length(); index++) {
//            System.out.print(str.charAt(index));
//        }
//        System.out.println();

        // chars
//        IntStream intStream = str.chars();

        // IntStream usage 1: print the content
//        intStream.forEach(System.out::println);
//        intStream.forEach((ele) -> System.out.print((char)ele));

        // IntStream usage 2: filter
//        intStream.filter(Character::isLetter).forEach((ele) -> System.out.print((char)ele));
//        System.out.println(intStream.filter(ele -> ele == 'l').count());

        // codePointAt
//        for(int index = 0; index < str.length(); index++) {
//            System.out.println(str.codePointAt(index));
//        }

//        System.out.println("=================");
//        System.out.println(str.codePointBefore(1));
//        System.out.println(str.codePointCount(2, 3));

//        intStream.mapToObj((ele) -> (char)ele).forEach(System.out::println);

//        String str1 = "hell";
//        String str2 = "hell";
//        IntStream intStream = str1.codePoints();
//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareToIgnoreCase(str2));
//        System.out.println(str1.concat(str2));
//        System.out.println(str1.contains(str2));
//        System.out.println(str1.contentEquals(str2));
//        System.out.println(str1.equals(intStream));

//        char[] strArr = {'a', 'b', 'c'};
//        String str = String.copyValueOf(strArr); // this is a static method
//        String str2 = String.copyValueOf(strArr, 1, 2);
//        String str3 = String.valueOf(strArr);
//        String str4 = String.valueOf(strArr, 2, 1);
//        System.out.println(str4);

//        String str = "ffapple";
//        System.out.println(str.startsWith("app", 2));
//        System.out.println(str.startsWith("app"));
//        System.out.println(str.endsWith("le"));
//        str.endsWith("pp");

//        String str = "Str2";
//        String str1 = "str2";
//        System.out.println(str.equals(str1));
//        System.out.println(str.equalsIgnoreCase(str1));

//        String sentence = String.format("%s is %d years old", "tom", 23);
//        String sentence1 = String.format("%f plus %f is %f", 1.1, 1.2, 1.1+1.2);
//        String sentence1 = String.format("16 jinzhi of %d is %x", 12, 12);
//        String sentence1 = String.format("%d's eight 进制 is %o", 16, 16);
//        System.out.println(sentence1);

//        Date now = new Date();
//        String date = String.format(Locale.CHINA, "today is %tY %tB %te %tA", now, now, now, now);
//        String dateGem = String.format(Locale.GERMAN, "today is %tY %tB %te %tA", now, now, now, now);
//        System.out.println(date);

//        String name = "a汤姆";
//        byte[] res1 = name.getBytes();
//        for (byte res: res1) {
//            System.out.println(res);
//        }

//        byte[] res2 = name.getBytes("gbk");
//        for (byte res: res2) {
//            System.out.println(res);
//        }

//        String name = "tom";
//        char[] nameChar = new char[10];
//        name.getChars(0, name.length(), nameChar, 0);
//        for (char ele: nameChar) {
//            System.out.println(ele);
//        }

//        String name1 = "tom";
//        String name2 = "tom";
//        System.out.println(String.format("hash code of name1 is %d, and hash code of name2 is %d", name1.hashCode(), name2.hashCode()));

//        String path = "/desktop/test";
//        int index = path.indexOf((int)'d');
//        int index2 = path.indexOf((int) 'e', 3);
//        System.out.println(index);
//        System.out.println(index2);

//        String str1 = "hello";
//        String str2 = "hello";

//        String str3 = new String("hello");
//        String str4 = new String("hello");
//        str3 = str3.intern();
//        str4 = str4.intern();
//        System.out.println(str4 == str3);

//        String str1 = "1";
//        String str2 = "";
//        System.out.println(str1.isEmpty());
//        System.out.println(str2.isEmpty());

//        String name1 = "tom";
//        String name2 = "jerry";
//        String delimeter = " and ";
//        System.out.println(String.join(delimeter, name1, name2));
//        ArrayList<String> names = new ArrayList<>();
//        names.add(name1);
//        names.add(name2);
//        names.add("mick");

//        System.out.println(String.join(delimeter, names));

//        String sentence = "nihao, this is taom";
//        System.out.println(sentence.lastIndexOf((int) 'i'));
//        System.out.println(sentence.lastIndexOf((int) 'i', 1));
//        System.out.println(sentence.lastIndexOf((int) 'i', 0));
//        System.out.println(sentence.lastIndexOf("ao"));
//        System.out.println(sentence.lastIndexOf("ao", 5));

//        String name = "tom";
//        System.out.println(name.length());

//        String file = ".file";
//        System.out.println(file.matches(".*"));

//        String name = "a\uD835\uDD46b";
//        System.out.println(name);
//        System.out.println(name.charAt(name.offsetByCodePoints(0, 2)));

//        String name1 = "jerry lee";
//        String name2 = "tom lee";
//        int length = 3;
//        System.out.println(name1.regionMatches(true, name1.length() - length, name2, name2.length() - length, length));
//        System.out.println(name1.replace(new StringBuffer("lee"), new StringBuffer("wang")));
//        System.out.println(name2.replace(new StringBuffer("lee"), new StringBuffer("wang")));

//        String file = "f,l,i,e";
//        System.out.println(file.replaceAll(".*", "+"));
//        System.out.println(file.replaceFirst(".*", "+"));
//        String[] text = file.split(",");
//        String[] textWithLimit = file.split(",", 3);
//        for (String ele: textWithLimit) {
//            System.out.println(ele);
//        }

//        String word = "apple".toUpperCase(Locale.US);
//        StringBuffer wordbuf = (StringBuffer) word.subSequence(1, 3);
//        String prefix = word.substring(0, 3);
//        String prefix1 = word.substring(3);
//        System.out.println(prefix1);
//        char[] ele = word.toCharArray();
//        for (char le: ele) {
//            System.out.println(le);
//        }

//        System.out.println(word);
//        System.out.println(word.toLowerCase(Locale.CHINA));

//        String word = "    apple   ";
//        System.out.println(word.trim());

        char charVal = 'a';
        long longVal = 1L;
        int intVal = 2;
        float floatVal = 1.1f;
        double doubleVal = 1.1d;
        boolean booleanVal = true;
        char[] charArr = new char[]{'c', 'h',  'a', 'r'};
        System.out.println(String.valueOf(charVal));
        System.out.println(String.valueOf(longVal));
        System.out.println(String.valueOf(intVal));
        System.out.println(String.valueOf(floatVal));
        System.out.println(String.valueOf(doubleVal));
        System.out.println(String.valueOf(booleanVal));
        System.out.println(String.valueOf(charArr));
        System.out.println(String.valueOf(charArr, 1, 3));




    }
}