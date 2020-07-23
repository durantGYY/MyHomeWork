package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner console = new Scanner(System.in);
        String s = console.next();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = f.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal2 = Calendar.getInstance();
        cal.setTime(d);
        long time = cal2.getTimeInMillis()-cal.getTimeInMillis();
        System.out.println(time/1000/60/60/24/7);
    }
}
