package test;

/**
 * @version 1.0
 * @Author zxilong
 * @Date 2024/10/15 下午8:26
 * @注释
 */
public class Student {
    String name;
    int age;
    static String school = "郑州大学";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("沉默王二", 18);
        Student s2 = new Student("沉默王三", 16);
    }
}
