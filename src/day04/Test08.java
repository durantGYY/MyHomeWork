package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String s1 = console.next();
        String s2 = console.next();
        String s3 = console.next();
        SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
        List<Date> col = new ArrayList<>();
        col.add(fo.parse(s1));
        col.add(fo.parse(s2));
        col.add(fo.parse(s3));
        Collections.sort(col);
        System.out.println(col);

    }
}
