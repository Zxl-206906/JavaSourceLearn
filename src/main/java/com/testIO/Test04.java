package com.testIO;

import java.io.*;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/17 下午7:28
 * @注释  基本数据类型
 * 基本数据类型输入输出流是一个字节流，该流不仅可以读写字节和字符，还可以读写基本数据类型。
 */
public class Test04 {

    public static void main(String[] args) throws IOException {

        //DataInputStream 提供了一系列可以读基本数据类型的方法：

        // 创建一个 DataInputStream 对象，用于从文件中读取数据
        DataInputStream dis = new DataInputStream(new FileInputStream("das.txt"));

        // 读取一个字节，将其转换为 byte 类型
        byte b = dis.readByte();

        // 读取两个字节，将其转换为 short 类型
        short s = dis.readShort();

        // 读取四个字节，将其转换为 int 类型
        int i = dis.readInt();

        // 读取八个字节，将其转换为 long 类型
        long l = dis.readLong();

        // 读取四个字节，将其转换为 float 类型
        float f = dis.readFloat();

        // 读取八个字节，将其转换为 double 类型
        double d = dis.readDouble();

        // 读取一个字节，将其转换为 boolean 类型
        boolean bb = dis.readBoolean();

        // 读取两个字节，将其转换为 char 类型
        char ch = dis.readChar();

        // 关闭 DataInputStream，释放资源
        dis.close();



        /*
        * 除了 DataInputStream 和 DataOutputStream，
        * Java IO 还提供了其他一些读写基本数据类型和字符串的流类，
        * 包括 ObjectInputStream 和 ObjectOutputStream（用于读写对象）。
        * */

        
        //DataOutputStream 提供了一系列可以写基本数据类型的方法：
        // 创建一个 DataOutputStream 对象，用于将数据写入到文件中
        DataOutputStream das = new DataOutputStream(new FileOutputStream("das.txt"));

        // 将一个 byte 类型的数据写入到文件中
        das.writeByte(10);

        // 将一个 short 类型的数据写入到文件中
        das.writeShort(100);

        // 将一个 int 类型的数据写入到文件中
        das.writeInt(1000);

        // 将一个 long 类型的数据写入到文件中
        das.writeLong(10000L);

        // 将一个 float 类型的数据写入到文件中
        das.writeFloat(12.34F);

        // 将一个 double 类型的数据写入到文件中
        das.writeDouble(12.56);

        // 将一个 boolean 类型的数据写入到文件中
        das.writeBoolean(true);

        // 将一个 char 类型的数据写入到文件中
        das.writeChar('A');

        // 关闭 DataOutputStream，释放资源
        das.close();

    }
}
