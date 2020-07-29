package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Runnable run1 = new Thread02();
        Runnable run2 = new Thread02();
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        ((Thread02)run1).setWord("你好!");
        ((Thread02)run2).setWord("再见!");
        t1.start();
        t2.start();
    }
}
