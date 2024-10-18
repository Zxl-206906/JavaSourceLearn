package com.testIO;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/17 下午7:15
 * @注释
 */
public class Test02 {
    public static void main(String[] args) throws IOException {

        //通常来说，针对文件的读写操作，使用文件流配合缓冲流就够用了，
        // 但为了提升效率，频繁地读写文件并不是太好，那么就出现了数组流，有时候也称为内存流。
        //ByteArrayInputStream 的例子：

        // 创建一个 ByteArrayInputStream 对象，用于从字节数组中读取数据
        InputStream is = new BufferedInputStream(
                new ByteArrayInputStream(
                        "沉默王二".getBytes(StandardCharsets.UTF_8)));

       // 定义一个字节数组用于存储读取到的数据
        byte[] flush = new byte[1024];

        // 定义一个变量用于存储每次读取到的字节数
        int len = 0;

        // 循环读取字节数组中的数据，并输出到控制台
        while (-1 != (len = is.read(flush))) {
            // 将读取到的字节转换为对应的字符串，并输出到控制台
            System.out.println(new String(flush, 0, len));
        }

        // 关闭输入流，释放资源
        is.close();


        /*
         * 数组流可以用于在内存中读写数据，比如将数据存储在字节数组中进行压缩、加密、序列化等操作。
         * 它的优点是不需要创建临时文件，可以提高程序的效率。
         * 但是，数组流也有缺点，它只能存储有限的数据量，如果存储的数据量过大，会导致内存溢出。
         * */
        //ByteArrayOutputStream 的例子：
        // 创建一个 ByteArrayOutputStream 对象，用于写入数据到内存缓冲区中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        // 定义一个字节数组用于存储要写入内存缓冲区中的数据
        byte[] info = "沉默王二".getBytes();

        // 向内存缓冲区中写入数据，这里写入的是 info 数组中的所有字节
        bos.write(info, 0, info.length);

        // 将内存缓冲区中的数据转换为字节数组
        byte[] dest = bos.toByteArray();

        // 关闭 ByteArrayOutputStream 对象，释放资源
        bos.close();




    }
}
