package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:330602199207152222
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String s;
        do{
            s = console.next();
        }while(s.length() != 18);
        s = s.substring(6,14);
        SimpleDateFormat fo = new SimpleDateFormat("yyyyMMdd");
        Date date = fo.parse(s);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR,20);
        cal.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
        date.setTime(cal.getTimeInMillis());
        System.out.println(fo.format(date));

    }
}
