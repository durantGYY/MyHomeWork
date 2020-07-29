package day09;

public class Thread02 implements Runnable{
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(word);
            Thread.yield();
            Thread.yield();
            Thread.yield();
            Thread.yield();
        }
    }
}
