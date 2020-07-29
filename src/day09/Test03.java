package day09;
/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        new Thread("你好!"){
            @Override
            public void run() {
                for (int i = 0; i < 1000 ; i++) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.yield();
                }
            }
        }.start();
        new Thread("再见!"){
            @Override
            public void run() {
                for (int i = 0; i < 1000 ; i++) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.yield();
                }
            }
        }.start();

    }
}
