package com.testIO;

import java.io.*;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/17 下午7:09
 * @注释
 */
public class Test01 {
    public static void main(String[] args) throws IOException {

        //FileInputStream 的例子：
        // 声明一个 int 类型的变量 b，用于存储读取到的字节
        int a;

        // 创建一个 FileInputStream 对象，用于读取文件 fis.txt 中的数据
        FileInputStream fis1 = new FileInputStream("fis.txt");

        // 循环读取文件中的数据
        while ((a = fis1.read()) != -1) {
            // 将读取到的字节转换为对应的 ASCII 字符，并输出到控制台
            System.out.println((char)a);
        }

        // 关闭 FileInputStream 对象，释放资源
        fis1.close();




        //FileOutputStream 的例子：
        // 创建一个 FileOutputStream 对象，用于写入数据到文件 fos.txt 中
        FileOutputStream fos = new FileOutputStream("fos.txt");

        // 向文件中写入数据，这里写入的是字符串 "沉默王二" 对应的字节数组
        fos.write("沉默王二".getBytes());

        // 关闭 FileOutputStream 对象，释放资源
        fos.close();



        //FileReader 的例子：
        // 声明一个 int 类型的变量 b，用于存储读取到的字符
        int b = 0;

        // 创建一个 FileReader 对象，用于读取文件 read.txt 中的数据
        FileReader fileReader = new FileReader("read.txt");

        // 循环读取文件中的数据
        while ((b = fileReader.read()) != -1) {
            // 将读取到的字符强制转换为 char 类型，并输出到控制台
            System.out.println((char)b);
        }

        // 关闭 FileReader 对象，释放资源
        fileReader.close();


        //FileWriter 的例子：
        // 创建一个 FileWriter 对象，用于写入数据到文件 fw.txt 中
        FileWriter fileWriter = new FileWriter("fw.txt");

        // 将字符串 "沉默王二" 转换为字符数组
        char[] chars = "沉默王二".toCharArray();

        // 向文件中写入数据，这里写入的是 chars 数组中的所有字符
        fileWriter.write(chars, 0, chars.length);

        // 关闭 FileWriter 对象，释放资源
        fileWriter.close();


        //文件流还可以用于创建、删除、重命名文件等操作。
        // FileOutputStream 和 FileWriter 构造函数的第二个参数可以指定是否追加数据到文件末尾
        // 创建文件
        File file = new File("test.txt");
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        } else {
            System.out.println("文件已存在");
        }

        // 删除文件
        if (file.delete()) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }

        // 重命名文件
        File oldFile = new File("old.txt");
        File newFile = new File("new.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("文件重命名成功");
        } else {
            System.out.println("文件重命名失败");
        }
    }
}
