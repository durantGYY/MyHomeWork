package day06;

import org.junit.Test;

import java.io.File;

/**
 * 获取并输出当前目录下所有文件的名字
 * @author Bonnie
 *
 */
public class Test06 {
    @Test
    public void test06(){
        File file = new File("src/day06");
        File[] files = file.listFiles(f -> f.isFile());
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}
