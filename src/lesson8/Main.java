package lesson8;

public class Main {
    public static void main(String[] args) {
        ImmutableMan man1 = new ImmutableMan("Vasia", 100, new MutableAddress("Minsk", "Lenina 1"));

        System.out.println(man1.getName() + "" + man1.getHairLength() + "" + man1.getAddress());
        man1.getAddress().setCity("Leningrad");
        man1.getAddress().setStreet("Stroitelei");
        System.out.println(man1.getName() + "" + man1.getHairLength() + "" + man1.getAddress());


    }
}
