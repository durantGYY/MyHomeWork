package day02;

import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * 定义全参数(该构造方法的参数用于设置所有属性)构造方法与默认构造方法
 * 重写toString方法，返回字符串格式如:"张三,25,男,5000"
 * 重写equals方法，要求名字相同就认为内容一致。
 * @author Bonnie
 *
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private int salary;
    protected Person(){

    }

    protected Person(String name,int age,String gender,int salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                name + "," + age + "," + gender + "," + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        return true;
        if(!(obj instanceof Person))
            return false;
        return Objects.equals(this.name,((Person) obj).name);
    }
}
