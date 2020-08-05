package day07;

import java.io.*;

/**
 * 使用字符流复制当前程序的源文件到当前项目根目录下。
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/day07/Test05.java")));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("./Test07_copy.java")),true);
        String line;
        while ((line = br.readLine()) != null){
            pw.print(line);
            pw.println();
        }
    }
}
