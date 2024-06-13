package core.basesyntax.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    // private int count = 0;
    private Integer count = Integer.valueOf("0");
    private String str = "";

    public void add() {
        str = str + count++ + "\n";
    }

    //  public synchronized void add() {
//    str = str + count++ + "\n";
//  }
//    public void add() {
//        str = str + count.getAndIncrement() + "\n";
//    }


//    public void increment(int i) {
//        str += i + " \n";
//    }

    public int getCount() {
        return count;
    }

    public String getStr() {
        return str;
    }
}

