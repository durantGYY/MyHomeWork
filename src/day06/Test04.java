package day06;

import org.junit.Test;

import java.io.File;

/**
 * 获取并输出当前目录下的所有文件和目录的名字
 * @author Bonnie
 *
 */
public class Test04 {
	@Test
    public void test04(){
        File file = new File("src/day06");
        File[] files = file.listFiles();
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}
