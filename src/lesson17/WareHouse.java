package lesson17;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {

    private static WareHouse warehouse = new WareHouse();

    public static WareHouse getInstance() {
        return warehouse;
    }

    private WareHouse() {
    }

    private final List<String> goods = new ArrayList<>();

    public synchronized void addGood(String s) {

        while (goods.size() >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        goods.add(s);
        System.out.println(Thread.currentThread().getName() + " Adds " + s + " [" + goods.size() + "]");

    }


    public synchronized String takeGood() {
        while (goods.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        String s = goods.remove(0);
        System.out.println(Thread.currentThread().getName() + " takes " + s + " [" + goods.size() + "]");
        return s;
    }
}

