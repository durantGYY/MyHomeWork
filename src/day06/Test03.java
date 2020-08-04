package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String s = console.next();
        File file = new File(s);
        int k = 1;
        boolean b = file.mkdir();
        if(!b) System.out.println("该目录已经存在!");
        while (!b){
            if(k == 1){
                String sr = s + "_副本1";
                b = new File(sr).mkdir();
            }else{
                String sk = s +"_副本"  + k;
                b = new File(sk).mkdir();
            }
            k++;
        }

    }
}
