package main.Thread;

import java.util.concurrent.Callable;

public class MyCallubale implements Callable {
    private int index;
    public MyCallubale(int index){
        this.index=index;
    }
    @Override
    public Object call() throws Exception {
        doit();
      return this;
    }
    private void doit(){
        System.out.println("runnable ise dusdu ve  3 saniye gozleyecek");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread isini bitirdi");
    }
}
