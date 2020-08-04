package day06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        PrintWriter writer = null;
        while (true){
            try {
                String s = console.next();
                writer = new PrintWriter(new FileWriter("src/day06/note.txt",true));
                if(s.equals("exit")) throw new RuntimeException();
                writer.print(s);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (RuntimeException e){
                System.out.println("程序终止!");
                return;
            }finally {
                writer.close();
            }
        }

    }
}
