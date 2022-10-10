import main.Thread.*;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Thread t =new Thread();
//        Thread m1=new Thread(new Consumer("Terlan"));
//        Thread m2=new Thread(new Consumer("Azay"));
//        Thread m3=new Thread(new Consumer("NIhad"));
//        Thread m4=new Thread(new Consumer("niko"));
//        Thread m5=new Thread(new Consumer("Qabil"));
//        Thread m6=new Thread(new Consumer("Qabil"));
//        t.start();
//m1.start();
//m2.start();
//m3.start();
//m4.start();
//m5.start();
//m6.start();
//        Runnable Thread anlayisi yuxaridaki kod
//        System.out.println("Thread active first="+Thread.activeCount());
//        Thread [] threads=new Thread[1000];
//        for(int i=0;i<100;i++){
//            threads[i]=new Thread(new Consumer("test"));
//        }
//        for(int i=0;i<100;i++){
//            threads[i].start();
//        }
//        System.out.println("Thread count="+Thread.activeCount());
////        Thread.sleep(5000);
//        System.out.println(Base.getA());
//        volatile synchronized race condition aid numune

//        Thread t= new Thread(new MyRunnable());
//        Thread t1= new Thread(new MyRunnable());
//        Thread t2= new Thread(new MyRunnable());
//        t.start();
//        t.join();
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join(); thread ile gozletmek yeni newsinglethreadin isini edir
//        System.out.println("run---");
//        ScheduledExecutorService ex=Executors.newScheduledThreadPool(1);
//        ScheduledFuture sf=ex.schedule(new MyRunnable(1),1,TimeUnit.SECONDS);
//
//        ex.shutdown();
//        ex.awaitTermination(5,TimeUnit.SECONDS);
//        System.out.println("termination"); awaittermination gozleme
        ExecutorService service= Executors.newSingleThreadExecutor();
        MyCallubale[] arr=new MyCallubale[3];
        arr[0]=new MyCallubale(1);
        arr[1]=new MyCallubale(2);
        arr[2]=new MyCallubale(3);
        List<Future<Object>> list=service.invokeAll(Arrays.asList(arr));

        service.shutdown();
        service.awaitTermination(5,TimeUnit.SECONDS);
        System.out.println("termination");
        Future f=list.get(0); // bu ilk run etdiyi arrayin futureridir;




    }
    public static void newScheduledThreadpool(){
        System.out.println("run---");
        ScheduledExecutorService ex=Executors.newScheduledThreadPool(1);
        ScheduledFuture sf=ex.schedule(new MyRunnable(1),4,TimeUnit.SECONDS);
        ex.shutdown();
    }
    public static void newCachedThreadPool(){
        ExecutorService service =Executors.newCachedThreadPool(); // bele yazmaq sehvdir cunki newcahced methodu ignore edir

        ExecutorService service1=new ThreadPoolExecutor(10,15,10,TimeUnit.HOURS, new ArrayBlockingQueue<Runnable>(20)); // bu cure daha dogrudur ;
    }
    public static void newFixedThread(){
        ExecutorService service= Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            service.submit(new MyRunnable(i));
        }
    }
    public static void newSingleThread(){
        ExecutorService service= Executors.newSingleThreadExecutor();
        service.submit(new MyRunnable(1)) ;
        service.submit(new MyRunnable(2)) ;
        service.submit(new MyRunnable(3)) ;
        service.submit(new MyRunnable(4)) ;
        service.submit(new MyRunnable(5)) ;
    }
}
