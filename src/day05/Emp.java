package day05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
 * @author Bonnie
 *
 */
public class Emp implements Comparable<Emp>{
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hireDate;

    protected Emp(){

    }

    protected Emp(String name,int age,String gender,int salary,Date hireDate){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public int compareTo(Emp o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hireDate=" + fo.format(hireDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name);
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
