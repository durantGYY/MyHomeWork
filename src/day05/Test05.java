package day05;

import java.util.*;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.next();
        String[] s = str.split(";");
        Map<String,Integer> maps = new HashMap<>();
        for(String position:s){
            String[] pos = position.split(":");
            if(maps.get(pos[0]) == null){
                maps.put(pos[0],0);
            }
            maps.put(pos[0],maps.get(pos[0]) + 1);
        }
        Set<String> keys = maps.keySet();
        System.out.println(keys);
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for(Map.Entry<String,Integer> en:entries){
            System.out.println(en.getKey() + ":" + en.getValue());
        }
    }

}
