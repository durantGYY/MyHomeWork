package day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 读取当前项目根目录下所有后缀为.obj的文件，将这些Emp对象读取出来
 * 并存入到一个List集合中，然后按照员工工资从多到少的顺序依次输出员工信息
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File[] files = new File("./src/day07").listFiles(f -> f.getName().endsWith(".obj"));
        List<Emp> list = new ArrayList<>();
        for(File file:files){
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            Emp emp = (Emp)ois.readObject();
            ois.close();
            list.add(emp);
        }
        list.sort((o1, o2) -> o2.getSalary() - o1.getSalary());
        System.out.println(list);
    }
}
