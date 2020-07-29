package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] s = str.split(";");
        Map<String,Integer> maps = new HashMap<>();
        for(String strs:s){
            String[] s1 = strs.split(":");
            maps.put(s1[0],Integer.parseInt(s1[1]));
        }
        System.out.println(maps.get("物理"));
        maps.put("化学",96);
        maps.remove("英语");
        Set<String> keys = maps.keySet();
        for(String key:keys){
            System.out.print(key + "=" + maps.get(key) + " ");
        }
        System.out.println();
        Set<Map.Entry<String,Integer>> entrys  = maps.entrySet();
        for(Map.Entry<String,Integer> en:entrys){
            String key = en.getKey();
            Integer val = en.getValue();
            System.out.print(key + "=" + val + " ");
        }
        System.out.println();
        Collection<Integer> col = maps.values();
        System.out.println(col);
    }
}
