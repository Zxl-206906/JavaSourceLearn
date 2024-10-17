package test;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/15 下午6:31
 * @注释
 */
public class Counter {
    int count = 0;

    Counter() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
