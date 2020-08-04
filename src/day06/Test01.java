package day06;

import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * 通过File输出当前项目目录下的文件"myfile.txt"的名字，大小，最后修改时间。
 * 最后修改时间格式如:2017-06-30 14:22:16
 * @author Bonnie
 *
 */
public class Test01 {
    @Test
    public void test01(){
        File file = new File("src/day06/myfile.txt");
        SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(fo.format(file.lastModified()));
    }

}
