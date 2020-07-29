package day09;

public class Thread01 extends Thread{

    public Thread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(this.getName());
            Thread.yield();
        }
    }
}
