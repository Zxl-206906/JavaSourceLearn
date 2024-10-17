package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Stack;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/16 上午11:00
 * @注释
 */
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        //添加元素
        list.add("wanger");
        list.add("zhangsan");
        list.add("lisi");


        for (String s : list) {
            System.out.println(s);
        }

//        for (String s : list){
//            System.out.println(s);
//        }
    }
}
