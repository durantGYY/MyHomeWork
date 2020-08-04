package day06;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * 创建一个"raf.dat"的文件，并在其中写出一个int的最大值，long的最大值，
 * 然后将其分别读取出来并输出
 * @author Bonnie
 *
 */
public class Test08 {
    @Test
    public void test08() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/day06/raf.dat"));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        System.out.println(s1);
        System.out.println(s2);
    }
}
