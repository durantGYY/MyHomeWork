package day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        Date t = new Date(d.getTime()+3l*24*60*60*1000);
        d.setTime(d.getTime()+3l*24*60*60*1000);
        System.out.println(d);
        System.out.println(t);
    }
}
