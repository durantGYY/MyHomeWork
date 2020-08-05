package day07;

import java.io.*;

/**
 * 使用缓冲流复制myfile.txt文件为myfile_cp2.txt
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("src/day07/myfile.txt"));
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("src/day07/myfile_cp2.txt"));
        byte[] b = new byte[10];
        int len;
        while ((len = bi.read(b)) != -1){
            bo.write(b,0,len);
        }
        bo.close();
    }
}
