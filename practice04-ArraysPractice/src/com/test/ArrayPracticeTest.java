package com.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.File;
import com.company.ArraysPractice;
import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayPracticeTest {
    @Test
    public void sumTest () {
        int number1 = ThreadLocalRandom.current().nextInt(1000000);
        int number2 = ThreadLocalRandom.current().nextInt(1000000);
        Assertions.assertEquals(number1 - number2, ArraysPractice.sum(number1, number2));
    }

    @Test
    public void stringBufferAndStringBuilderTest() throws Exception {
        StringBuffer stringBuffer = new StringBuffer("Hello!");
        StringBuffer stringBuffer1 = new StringBuffer(" Java");
        stringBuffer.append(stringBuffer1);
        System.out.println(stringBuffer.toString());

        StringBuilder stringBuilder = new StringBuilder("Hello!");
        StringBuilder stringBuilder1 = new StringBuilder(" Java");
        System.out.println(stringBuilder.append(stringBuilder1).toString());

            throw new Exception("file not found");

    }

    @Test
    public void FileTest () throws IOException{
        File file1 = new File("D:\\desktop\\file1.txt");
        File dir = new File("D:\\desktop\\");
        if (!file1.exists()) {
            file1.createNewFile();
        }

        System.out.println(file1.getFreeSpace());
        System.out.println(file1.getParentFile());
        System.out.println(Arrays.toString(dir.list()));
        file1.delete();
    }

    @Test
    public void IOTest () throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\desktop\\test.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\desktop\\test1.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        int ch;
        while ((ch = bufferedInputStream.read()) != -1) {
            System.out.print((char)ch);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

//        byte[] buffer = new byte[1024];
//        int num;
//        while ((num = fileInputStream.read(buffer)) != -1) {
//            for (byte ele: buffer) {
//                System.out.print((char) ele);
//            }

//            fileOutputStream.write(buffer, 0, num);
//        }

//        byte[] name = "felix".getBytes();
//
//        for (byte ele: name) {
//            fileOutputStream.write(ele);
//        }
    }

    @Test
    public void ReadTest () throws IOException {
//        FileReader fileReader = new FileReader("D:\\desktop\\test.txt");
        FileWriter fileWriter = new FileWriter("D:\\desktop\\test1.txt");

//        int ch;
//        while ((ch = fileReader.read()) != -1) {
//            System.out.print((char) ch);
//            fileWriter.write(ch);
//        }

//        fileReader.close();
//        fileWriter.close();

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("hello!");
//        bufferedWriter.newLine();
        bufferedWriter.write("java");

        bufferedWriter.close();
        fileWriter.close();
    }
}