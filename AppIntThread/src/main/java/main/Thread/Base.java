package main.Thread;

import java.util.ArrayList;
import java.util.List;

public class Base {
    public static List<String>list=new ArrayList<String>();
    public static int a;
    public  static int getA(){
        return a;
    }

    public synchronized static void incA() {
        a++;
    }
}
