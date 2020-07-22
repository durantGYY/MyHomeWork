package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("大家好!");
		str.append("我是程序员!");
		System.out.println(str);
		str.insert(6,"优秀的");
		System.out.println(str);
		str.replace(6,9,"牛牛的");
		System.out.println(str);
		str.delete(0,4);
		System.out.println(str);
	}
}
