package com.test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public List Students;/*学生信息表*/

    public ListTest() {
        this.Students = new ArrayList();
        /*向表中添加学生*/
    }

    public void TestAdd() {
        Student st1 = new Student("赛文", "1");
        Students.add(st1);/*将学生st1添加到表中*/
        Student st1test = (Student) Students.get(0);/*get函数返回相关元素，通过强制转换成正常的st1*/
        System.out.println("学生学号:\t" + st1test.ID + "学生姓名:\t" + st1test.name);
        Student st2 = new Student("雷欧", "2");
        Students.add(1, st2);/*将st2加入到表中0位置*/
        Student st2test = (Student) Students.get(1);
        System.out.println("学生学号:\t" + st2test.ID + "学生姓名:\t" + st2test.name);
        Student[] student = {new Student("迪迦", "3"), new Student("爱迪", "4")};
        Students.addAll(Arrays.asList(student));/*数组转换成表*/
        Student st3test = (Student) Students.get(2);
        Student st4test = (Student) Students.get(3);
        System.out.println("学生学号:\t" + st3test.ID + "学生姓名:\t" + st3test.name);
        System.out.println("学生学号:\t" + st4test.ID + "学生姓名:\t" + st4test.name);
        Student[] student2 = {new Student("刘昊鑫", "5"), new Student("哥斯拉", "6")};
        Students.addAll(4, Arrays.asList(student2));
        Student st5test = (Student) Students.get(4);
        Student st6test = (Student) Students.get(5);
        System.out.println("学生学号:\t" + st5test.ID + "学生姓名:\t" + st5test.name);
        System.out.println("学生学号:\t" + st6test.ID + "学生姓名:\t" + st6test.name);


    }

    public void testGet() {
        int size = Students.size();
        System.out.println("普通方法输出");
        for (int i = 0; i < size; i++) {
            Student st = (Student) Students.get(i);
            System.out.println("学生学号:\t" + st.ID + "学生姓名:\t" + st.name);
        }
    }

    public void testiterator() {
        Iterator it = Students.iterator();
        System.out.println("通过迭代器输出");
        while (it.hasNext()) {
            Student st = (Student) it.next();
            System.out.println("学生学号:\t" + st.ID + "学生姓名:\t" + st.name);
        }
    }

    public void testforeach() {
        System.out.println("for each 输出");
        for (Object obj : Students
                ) {
            Student st = (Student) obj;
            System.out.println("学生学号:\t" + st.ID + "学生姓名:\t" + st.name);
        }
    }

    //    修改学生信息
    public void testmodify() {
        Students.set(4, new Student("刘昊鑫傻逼", "5"));
    }


    public void testdelete() {
        Student st = (Student) Students.get(4);
        System.out.println("我是刘昊鑫大傻逼即将被删除");
        Students.remove(st);
        System.out.println("删除成功");
        testforeach();
    }

    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.TestAdd();
        lt.testGet();
        lt.testiterator();
        lt.testmodify();
        lt.testforeach();
        lt.testdelete();

    }
}
