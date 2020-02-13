package com.cwp.面向对象2;

import org.junit.Test;

import java.io.*;

public class _16序列化反序列化 {
    // 对象的反序列化过程：将硬盘中的文件通过ObjectInputStream转换为相应的对象
    @Test
    public void testObjectInputStream() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(
                    "person.txt"));

            Person p1 = (Person) ois.readObject();
            System.out.println(p1);
            Person p2 = (Person) ois.readObject();
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {

                try {
                    ois.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    // 对象的序列化过程：将内存中的对象通过ObjectOutputStream转换为二进制流，存储在硬盘文件中
    @Test
    public void testObjectOutputStream() {

        Person11 p1 = new Person11("小米", 23, new Pet("花花"));
        Person11 p2 = new Person11("红米", 21, new Pet("小花"));

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("person.txt"));

            oos.writeObject(p1);
            oos.flush();
            oos.writeObject(p2);
            oos.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
    }
}

/*
 * 要实现序列化的类： 1.要求此类是可序列化的：实现Serializable接口
 * 2.要求类的属性同样的要实现Serializable接口
 * 3.提供一个版本号：private static final long serialVersionUID
 * 4.使用static或transient修饰的属性，不可实现序列化
 */
class Person11 implements Serializable {
    private static final long serialVersionUID = 23425124521L;
    static String name;
    transient Integer age;
    Pet pet;

    public Person11(String name, Integer age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
    }


}

class Pet implements Serializable {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet [name=" + name + "]";
    }

}