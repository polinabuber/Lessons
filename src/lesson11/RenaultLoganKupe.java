package lesson11;

public class RenaultLoganKupe extends RenaultLogan {

    public RenaultLoganKupe() {
        super();
    }

    @Override
    public void startEngine(String key) {
        super.startEngine(key);
        System.out.println(" engine tuning");


    }
}
