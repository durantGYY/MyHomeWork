package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01("你好!");
        Thread01 t2 = new Thread01("再见!");
        t1.start();
        t2.start();
    }
}
