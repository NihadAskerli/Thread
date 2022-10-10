package main.Thread;

import java.util.concurrent.ThreadFactory;

public class MyCustomFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
      if(r instanceof MyRunnable){
          Thread t= new Thread();
          t.setDaemon(true);
          return  t;
      }  else if(r instanceof MyRunnable){
            Thread t= new Thread();
            t.setDaemon(false);
            return  t;
        }
      return  null;
    } // her thread yarananda filan isi gor bu ile edirik oz thread factorimizi ora yeni maindeki ne otururuk
}
