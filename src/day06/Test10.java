package day06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 要求用户输入一个员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 然后将输入的员工信息解析成Emp对象。
 * 然后将该Emp对象的toString返回的字符串写入到文件中，该文件的
 * 名字为:name.emp,以上面的例子，那么该文件名为:张三.emp
 * 至少运行5次该程序，输入五个员工信息，并生成5个文件。

 * @author Bonnie
 *
 */
public class Test10 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        while (true)
        {
            String emps = console.next();
            try {
                if(emps.equals("exit")) throw new RuntimeException();
                String[] s = emps.split(",");
                SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
                Emp emp = new Emp(s[0], Integer.parseInt(s[1]), s[2], Integer.parseInt(s[3]), fo.parse(s[4]));
                PrintWriter writer = new PrintWriter(new FileWriter(emp.getName() + ".emp"), true);
                writer.println(emp.toString());
            } catch (RuntimeException e){
                System.out.println("结束输入!");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
}
