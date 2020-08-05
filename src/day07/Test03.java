package day07;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户控制台输入想输入的员工人数（至少5个），然后依序输入员工信息，每行为
 * 一条员工信息，格式如:
 张三,26,男,9000,2007-3-18
 尕八,20,女,6000,2005-3-18
 李四,18,男,3000,2011-3-18
 孙柒,88,女,11000,2066-3-18
 赵六,0,男,1000,2016-3-18
 * 然后将该对象写入到文件<name>.obj并保存到当前项目根目录中，例如:张三.obj。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        for(int i = 0; i < num; i++){
            String person = console.next();
            String[] s = person.split(",");
            String name = s[0];
            int age = Integer.parseInt(s[1]);
            String gender = s[2];
            int salary = Integer.parseInt(s[3]);
            SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
            Date date = fo.parse(s[4]);
            Emp emp = new Emp(name,age,gender,salary,date);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/day07/" + name + ".obj"));
            oos.writeObject(emp);
        }
    }
}
