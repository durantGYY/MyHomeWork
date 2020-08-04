package day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 编写一个程序，将当前目录下所有的员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入Map。其中key为该员工的名字，value为该员工的emp对象。
 * 然后，要求用户输入一个员工名字，若该员工存在，则输出该员工的名字，年龄，工资，以及入职20周年的纪念日当周的周六的日期。
 * 即:输入名字"张三"
 * 若该员工存在，则输出如下格式:
 * 张三,25,5000,2006-02-14
 * 入职20周年纪念日派对日期: 2026-02-14  （注:若入职日期为:2006-02-14）
 * 若该员工不存在，则输出:"查无此人"
 * @author Bonnie
 *
 */
public class Test12 {
    public static void main(String[] args) throws IOException, ParseException {
        File f = new File(".");
        File[] files = f.listFiles(file -> {
            String s = file.getName();
            return s.endsWith(".emp");
        });
        Map<String,Emp> map = new HashMap<>();
        for(File emp:files){
            BufferedReader reader = new BufferedReader(new FileReader(emp));
            String[] s = reader.readLine().split(",");
            SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
            Emp e = new Emp(s[0], Integer.parseInt(s[1]), s[2], Integer.parseInt(s[3]), fo.parse(s[4]));
            map.put(e.getName(),e);
        }
        Scanner console = new Scanner(System.in);
        String name = console.next();
        if(map.containsKey(name)){
            System.out.println(map.get(name));
            System.out.print("入职20周年纪念日派对日期:");
            Date date = map.get(name).getHireDate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.YEAR,2);
            SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(fo.format(cal.getTime()));
        }else{
            System.out.println("查无此人");
        }
    }
}
