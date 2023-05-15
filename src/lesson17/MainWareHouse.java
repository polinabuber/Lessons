package lesson17;

public class MainWareHouse {
    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }
}
