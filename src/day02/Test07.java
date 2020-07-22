package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] s = str.split("[+ || \\- || * || /]");
        double num1 = 0;
        double num2 = 0;
        double sum = 0;
        if(s[0].contains(".")){
             num1 = turnDouble(s[0]);
        }else{
             num1 = turnInt(s[0]);
        }
        if(s[1].contains(".")){
             num2 = turnDouble(s[1]);
        }else{
             num2 = turnInt(s[1]);
        }
        if(str.contains("+")){
            sum = num1 + num2;
        }else if(str.contains("-")){
            sum = num1 - num2;
        }else if(str.contains("/")){
            sum = num1/num2;
        }else if(str.contains("*")){
            sum = num1*num2;
        }
        if(sum % 1 == 0){
            System.out.println(str + "=" + (int)sum);
        }else{
            System.out.println(str + "=" + sum);
        }


    }

    public static double turnInt(String s){
        double flag = 0;
        double sum = 0;
        for(int i = 0; i < s.length(); i++){
            flag = (s.charAt(i)) - 48;
            for(int j = 0; j < s.length()  -1 - i; j++){
                flag *= 10;
            }
            sum += flag;
        }
        return  sum;
    }

    public static double turnDouble(String s){
        double flag = 0;
        double sum = 0;
        String[] str=s.split("\\.");
        for(int i = 0; i < str[0].length(); i++){
            flag = str[0].charAt(i) - 48;
            for(int j = 0; j < str[0].length() - i - 1; j++){
                flag *= 10;
            }
            sum += flag;
        }
        for(int i = 0; i < str[1].length(); i++){
            flag = str[1].charAt(i) - 48;
            for(int j = str[1].length() - 1 - i; j < str[1].length() ; j++){
                flag /= 10;
            }
            sum += flag;
        }
        return sum;
    }



}
