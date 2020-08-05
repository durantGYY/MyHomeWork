package day08;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * 使用异常捕获机制完成下述读取操作，并在finally中有关闭RandomAccessFile操作。
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后按照员工入职从晚到早的顺序依次输出员工信息。
 * 
 * 该文件560字节，每56个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为short,长度为2个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为long，长度为8个字节
 * 格式可参考当前包中emp.jpg图
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        RandomAccessFile rf = null;
        try {
            File file = new File(Test05.class.getClassLoader().getResource("day08/emp.dat").toURI());
            rf = new RandomAccessFile(file,"r");
            int namel;
            byte[] b1 = new byte[32];
            while ((namel = rf.read(b1)) != -1){
                String name = new String(b1);
                Short age = rf.readShort();
                byte[] b2 = new byte[10];
                rf.read(b2);
                String gender = new String(b2);
                int salary = rf.readInt();
                long hire = rf.readLong();
                Date date = new Date(hire);
                Emp emp = new Emp(name,age,gender,salary,date);
                list.add(emp);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        } finally {
            try {
                rf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        list.sort(Comparator.comparing(Emp::getHireDate));
        System.out.println(list);
    }
}
