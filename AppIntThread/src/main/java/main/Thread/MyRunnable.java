package main.Thread;

public class MyRunnable implements Runnable{
    private int index;
    public MyRunnable(int index){
        this.index=index;
    }
    @Override
    public void run() {
        System.out.println("runnable ise dusdu ve  3 saniye gozleyecek");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread isini bitirdi");
    }
}
