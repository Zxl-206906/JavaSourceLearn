package test;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/15 下午12:15
 * @注释
 */
public class testHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("chenmo", "沉默");
        map.put("wanger", "王二");
        map.put("chenqingyang", "陈清扬");
        map.put("xiaozhuanling", "小转铃");
        map.put("fangxiaowan", "方小婉");
        map.put("yexin", "叶辛");
        map.put("liuting", "刘婷");
        map.put("yaoxiaojuan", "姚小娟");


        //接下来需要遍历HashMap
        for (String key : map.keySet()) {
            int h, n = 16;
            int hash = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            int i = (n - 1) & hash;
            //打印key的值以及索引i
            System.out.println(key + "的hash值 : " + hash +" 的索引 : " + i);
        }
    }
}
