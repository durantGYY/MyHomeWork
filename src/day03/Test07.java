package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15;
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] s = str.split(";");
        Collection<Emp> col = new ArrayList<>();
        SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
        for(int i = 0; i < s.length - 1; i++){
            String[] emp = s[i].split(",");
            Emp man = new Emp(emp[0],Integer.parseInt(emp[1]),emp[2],Integer.parseInt(emp[3]),fo.parse(emp[4]));
            if(!col.contains(man)){
                col.add(man);
            }else{
                System.out.println(man.getName()+"用户已经存在!");
            }
        }
        System.out.println(col);
    }
}
