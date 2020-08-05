package day07;

import java.io.*;
import java.util.Scanner;

/**
 * 记事本功能，首先要求用户输入一个文件名，并将该文件创建出来，
 * 然后通过控制台输入的每一行字符串都按行写入到该文件中，并
 * 使用GBK编码保存。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args)  {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        while (true){
            try{
                PrintWriter br = new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/day07/" + name,true),"GBK"),true);
                String s = console.nextLine();
                if(s.equals("exit")) throw new RuntimeException();
                br.println(s);
            }catch (RuntimeException e){
                System.out.println("程序结束");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
