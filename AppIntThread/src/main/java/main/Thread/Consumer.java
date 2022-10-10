package main.Thread;

public class Consumer implements Runnable {
    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        while (true) {
//            int lastindex = Base.list.size() - 1;
//            System.out.println("last index"+lastindex);
//            if (lastindex > -1) {
//                String s = Base.list.remove(lastindex);
//                System.out.println("s=" + s);
//            }
//            Runnable Thread aiddi yuxaridaki
        System.out.println("Started and waiting");
//        try {
////            Thread.sleep(2000);
//
//
//        }catch (){
//
//        }
        int a=Base.getA();
        a++;
        Base.incA();
    }
}




