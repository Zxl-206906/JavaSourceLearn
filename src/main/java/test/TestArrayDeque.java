package test;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/17 下午3:11
 * @注释
 */
public class TestArrayDeque {

    public static void main(String[] args) {
        // 声明一个双端队列
        ArrayDeque<String> stack = new ArrayDeque<>();

        // 增加元素
        stack.push("沉默");
        stack.push("王二");
        stack.push("陈清扬");

        // 获取栈顶元素
        String top = stack.peek();
        // 陈清扬
        System.out.println("栈顶元素为：" + top);

        // 弹出栈顶元素
        String pop = stack.pop();
        // 陈清扬
        System.out.println("弹出的元素为：" + pop);

        // 修改栈顶元素
        stack.pop();
        stack.push("小明");
        // [小明, 沉默]
        System.out.println("修改后的栈为：" + stack);

        // 遍历队列查找元素
        Iterator<String> iterator = stack.iterator();
        int index = -1;
        String target = "王二";
        while (iterator.hasNext()) {
            String element = iterator.next();
            index++;
            if (element.equals(target)) {
                break;
            }
        }

        if (index == -1) {
            System.out.println("元素 " + target + " 不存在于队列中");
        } else {
            System.out.println("元素 " + target + " 在队列中的位置为：" + index);
        }
    }
}
