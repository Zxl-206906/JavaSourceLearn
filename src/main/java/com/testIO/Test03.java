package com.testIO;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/17 下午7:24
 * @注释
 */
public class Test03 {
    public static void main(String[] args) throws IOException {

        //管道
        //一个线程通过 PipedOutputStream 写入的数据可以被另外一个线程通过相关联的 PipedInputStream 读取出来。
        // 创建一个 PipedOutputStream 对象和一个 PipedInputStream 对象
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        final PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);

        // 创建一个线程，向 PipedOutputStream 中写入数据
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 将字符串 "沉默王二" 转换为字节数组，并写入到 PipedOutputStream 中
                    pipedOutputStream.write("沉默王二".getBytes(StandardCharsets.UTF_8));
                    // 关闭 PipedOutputStream，释放资源
                    pipedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // 创建一个线程，从 PipedInputStream 中读取数据并输出到控制台
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // 定义一个字节数组用于存储读取到的数据
                    byte[] flush = new byte[1024];
                    // 定义一个变量用于存储每次读取到的字节数
                    int len = 0;
                    // 循环读取字节数组中的数据，并输出到控制台
                    while (-1 != (len = pipedInputStream.read(flush))) {
                        // 将读取到的字节转换为对应的字符串，并输出到控制台
                        System.out.println(new String(flush, 0, len));
                    }
                    // 关闭 PipedInputStream，释放资源
                    pipedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // 启动线程1和线程2
        thread1.start();
        thread2.start();

        /*
        * 使用管道流可以实现不同线程之间的数据传输，可以用于线程间的通信、数据的传递等。
        * 但是，管道流也有一些局限性，比如只能在同一个 JVM 中的线程之间使用，不能跨越不同的 JVM 进程。
        * */





    }
}
