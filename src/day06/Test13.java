package day06;

import java.io.*;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 将emp.dat文件中所有员工解析出来，并创建为若干Emp实例存入一个
 * 集合，然后输出该集合中每个员工信息。
 * 该文件800字节，每80个字节为一个员工的信息。
 * 其中:
 * 	 name为字符串，长度为32个字节，编码为:UTF-8
 *   age为int,长度为4个字节
 * 	 gender为字符串，长度为10个字节，编码为:UTF-8
 * 	 salary为int,长度为4个字节
 * 	 hiredate为字符串，格式"yyyy-MM-dd"，长度为30个字节，编码为:UTF-8
 * 格式可参考当前包中emp.jpg图
 * 提示:
 * 使用RandomAccessFile读取字符串时，例如name,可以先读取32个字节，再按照UTF-8
 * 转换为字符串，读取age时可以直接使用readInt方法。依次类推。
 * @author Bonnie
 *
 */
public class Test13 {
	public static void main(String[] args) throws URISyntaxException, IOException, ParseException {
		//使用类加载器加载当前包中的emp.dat文件
		File file = new File(Test13.class.getClassLoader().getResource("day06/emp.dat").toURI());
		RandomAccessFile rf = new RandomAccessFile(file,"r");
		int len;
		byte[] b1 = new byte[32];
		List<Emp> list = new ArrayList<>();
		while ((len = rf.read(b1)) != -1){
			String name = new String(b1);

			int age = rf.readInt();

			byte[] b2 = new byte[10];
			rf.read(b2);
			String gender = new String(b2);

			int salary = rf.readInt();

			byte[] b3 = new byte[30];
			rf.read(b3);
			String hire = new String(b3);
			SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
			Date hireDate = fo.parse(hire);
			Emp emp = new Emp(name,age,gender,salary,hireDate);
			list.add(emp);
		}
		System.out.println(list);

	}
}
