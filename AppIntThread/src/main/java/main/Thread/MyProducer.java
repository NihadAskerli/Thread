package main.Thread;

public class MyProducer {
    public void doIt1(){
        System.out.println("doIt1 basladi");
        synchronized (this) // thise monitor deyilir
        {
            System.out.println("doIt1");
        }
        System.out.println("doIt1 bitdi");
    }
    public void doIt2(){
        System.out.println("doIt2 basladi");
        synchronized (this) {
            System.out.println("doIt2");
//            eger bizim 3 threadimiz olsa 2 si doit 2 ye baxob biri doit 3 baxsa proces bele gedecek
//            thread bir iceride olub
//            thread 2 gozleyecek sinkronized eyni obyekte baxdigi ucun ise thread 3 de gozleyecek
//            ve 1 bitdikden sonra kim girdi girdi dir
        }
        System.out.println("doIt2 bitdi");
    }
    public void doIt3(){
        System.out.println("doIt3 basladi");
        synchronized (this) {
            System.out.println("doIt3");
        }
        System.out.println("doIt3 bitdi");
    }
}
