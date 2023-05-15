package lesson17;


public class Consumer extends Thread {

    public Consumer() {
        super("Consumer");
    }

    @Override
    public void run() {
        WareHouse wareHouse = WareHouse.getInstance();
        while (true) {
            wareHouse.takeGood();
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
