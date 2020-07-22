package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		char[] c = new char[5];
		Random ran = new Random();
		String strRan = "";
		for(int i = 0; i < c.length; i++){
			if(ran.nextInt(2) % 2 == 0){
				strRan += (char)(ran.nextInt(26) + 97);
			}else{
				strRan += (char)(ran.nextInt(26) + 65);
			}
		}
		System.out.println(strRan);
		String strIn = console.next();
		System.out.println(strRan.equalsIgnoreCase(strIn));
	}
	
}
