package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获机制完成下述IO操作
 * 编写程序，要求下面的类实现功能:
 * 添加新员工
 * 要求用户输入一个员工信息，格式如下:
 * jackson,25,男,5000,2008-12-22
 * 用户输入后需要做下述验证:
 * 要求用户名长度在1-20个字符之间且必须是英文
 * 年龄在0-100之间的整数
 * 性别只能是:"男"或"女"
 * 当发现用户输入有不符合规定时，提醒用户
 * 相关内容输入不符合要求，并要求重新输入。
 * 都输入正确后，将该员工添加到emp.txt文件
 * 的最后一行。
 * 
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true){
            try {
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day08/emp.txt", true)), true);
                String emp = console.nextLine();
                String[] s = emp.split(",");
                if(s.length != 5 || !s[0].matches("^[a-zA-Z]{1,20}$")
                                 || !(Integer.parseInt(s[1]) > 0 && Integer.parseInt(s[1])<100)
                                 || !(s[2].equals("男") || s[2].equals("女")) ){
                    throw new RuntimeException();
                }
                pw.println(emp);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (RuntimeException e){
                System.out.println("关内容输入不符合要求,请重新输入!");
            }
        }
    }
}
