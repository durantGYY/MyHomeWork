package day06;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException{
            Scanner console = new Scanner(System.in);
            String s = console.next();
            File file = new File(s);
            int k = 1;
            boolean b = file.createNewFile();
            if(!b) System.out.println("该文件已经存在!");
            while (!b){
                if(k == 1){
                    String[] ss = s.split("\\.");
                    String sr = ss[0] + "_副本1." + ss[1];
                    b = new File(sr).createNewFile();
                }else{
                    String[] ss = s.split("\\.");
                    String sk = ss[0] +"_副本"  + k + "." + ss[1];
                    b = new File(sk).createNewFile();
                }
                k++;
            }


    }
    /*@Test
    public void test02() throws IOException {
        Scanner console = new Scanner(System.in);
        String s = console.next();
        File file = new File(s);
        int k = 1;
        boolean b = file.createNewFile();
        while (!b){
            if(k == 1){
                String[] ss = s.split("\\.");
                s = ss[0] + "_副本1" + ss[1];
                b = new File(s).createNewFile();
            }else{
                String[] ss = s.split("^\\d+\\.$");
                s = ss[0] + k + ss[1];
            }
            k++;
        }

    }
*/
    /*private String creat(String s) throws IOException {
        File file = new File(s);
        boolean b = file.createNewFile();
        if(b){
            return null;
        }else{
            String[] ss = s.split("^\\d+\\.$");
            s = s[0] + "_副本"
            return
        }
    }*/


}
