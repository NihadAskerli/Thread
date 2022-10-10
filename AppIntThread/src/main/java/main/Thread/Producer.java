package main.Thread;

import java.util.UUID;

public class Producer implements Runnable {
    @Override
    public void run() {
        while (true) {
            Base.list.add(UUID.randomUUID().toString());
        }
    }


}