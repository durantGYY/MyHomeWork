package day02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] s = str.split(";");
        ArrayList<Person> p = new ArrayList();
        for(int i = 0; i < s.length - 1; i++){
            String[] m = s[i].split(",");
            p.add(new Person(m[0],(int)Test07.turnInt(m[1]),m[2],(int)Test07.turnInt(m[3])));
        }
        for(int i = 0; i < p.size(); i++){
            System.out.println(p.get(i).toString());
        }
    }
}
