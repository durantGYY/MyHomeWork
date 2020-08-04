package day06;

import java.io.*;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author Bonnie
 *
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String name1 = console.next();
		String name2 = console.next();
		Test07 t = new Test07();
		t.copy1(name1);
		t.copy2(name2);

	}
	/**
	 * 使用单字节方式复制
	 * @param name 要复制的文件名
	 */
	public void copy1(String name) throws IOException {
		InputStream is = new FileInputStream(name);
		String[] s = name.split("\\.");
		OutputStream os = new FileOutputStream(s[0]+ "_copy." + s[1]);
		int a;
		while((a = is.read()) != -1){
			os.write(a);
		}
	}
	/**
	 * 使用字节数组形式复制
	 * @param name 要复制的文件名
	 */
	public void copy2(String name) throws IOException{
		InputStream is = new FileInputStream(name);
		String[] s = name.split("\\.");
		OutputStream os = new FileOutputStream(s[0]+ "_copy." + s[1]);
		int len;
		byte[] bs = new byte[1024];
		while ((len = is.read(bs)) != -1){
			os.write(bs,0,len);
		}
	}
}
