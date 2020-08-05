package day08;

import java.io.*;
import java.util.Scanner;

/**
 * 使用异常捕获完成下述操作
 * 将控制台输入的每一行字符串使用缓冲字符输出流PrintWriter
 * 按行以GBK编码写入到文件note.txt中
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day08/note.txt",true),"gbk"),true);
            String s;
            while (!(s = console.nextLine()).equals("exit")){
                pw.println(s);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
