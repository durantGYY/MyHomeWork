package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        String RegExInt = "^\\d+$";
        String RegExDouble = "^\\d+\\.\\d+$";
        Scanner console = new Scanner(System.in);
        String s = console.next();
        int flag = 0;
        double flagD = 0;
        int sum = 0;
        double sumD = 0;
        if(s.matches(RegExInt)){
            for(int i = 0; i < s.length(); i++){
                flag = (s.charAt(i)) - 48;
                for(int j = 0; j < s.length()  - i; j++){
                    flag *= 10;
                }
                sum += flag;
            }
            System.out.println(sum);
        }else if(s.matches(RegExDouble)){
            String[] str=s.split("\\.");
            for(int i = 0; i < str[0].length(); i++){
                flagD = str[0].charAt(i) - 48;
                for(int j = 0; j < str[0].length() - i - 1; j++){
                    flagD *= 10;
                }
                sumD += flagD;
            }
            for(int i = 0; i < str[1].length(); i++){
                flagD = str[1].charAt(i) - 48;
                for(int j = str[1].length() - 1 - i; j < str[1].length() ; j++){
                    flagD /= 10;
                }
                sumD += flagD;
            }
            System.out.println(sumD*5);
        }else{
            System.out.println("不是数字");
        }
    }

}
