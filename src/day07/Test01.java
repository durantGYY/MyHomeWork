package day07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用文件流复制myfile.txt文件为myfile_cp.txt
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/day07/myfile.txt");
        FileWriter fw = new FileWriter("src/day07/myfile_cp.txt");
        int a;
        while ((a = fr.read()) != -1){
            fw.write(a);
        }
        fw.close();
    }
}
