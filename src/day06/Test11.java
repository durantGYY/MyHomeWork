package day06;

import org.junit.Test;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个程序，将当前目录下所有员工文件进行读取，并解析出所有员工为Emp
 * 对象并存入集合。然后排序该集合，按照员工的年龄排序，年龄大的靠前，年龄小
 * 的靠后。排序完毕后输出结果。
 * @author Bonnie
 *
 */
public class Test11 {
    @Test
    public void test11() throws IOException, ParseException {
        File f = new File(".");
        File[] files = f.listFiles(file -> {
            String s = file.getName();
            return s.endsWith(".emp");
        });
        List<Emp> emps = new ArrayList<>();
        for(File emp:files){
            BufferedReader reader = new BufferedReader(new FileReader(emp));
            String[] s = reader.readLine().split(",");
            SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
            Emp e = new Emp(s[0], Integer.parseInt(s[1]), s[2], Integer.parseInt(s[3]), fo.parse(s[4]));
            emps.add(e);
        }
        emps.sort(((o1, o2) -> o2.getAge() - o1.getAge()));
        System.out.println(emps);
    }
}
