package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] s = str.split(";");
        List<Emp> list = new ArrayList<>();
        SimpleDateFormat fo =new SimpleDateFormat("yyyy-MM-dd");
        for(int i = 0; i < s.length; i++){
            String[] ss = s[i].split(",");
            Emp emps = new Emp(ss[0],Integer.parseInt(ss[1]),ss[2],Integer.parseInt(ss[3]),fo.parse(ss[4]));
            list.add(emps);
        }
        Collections.sort(list);
        System.out.println(list);
        list.sort(new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return (int)(o2.getHireDate().getTime() - o1.getHireDate().getTime());
            }
        });
        System.out.println(list);
    }

}
