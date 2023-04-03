package lesson8;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "s1";

        String s2 = new String(new char[]{'s', '2'});
        // String s2 = new String("s2");//Так не надо
        String s3 = "s2";
        System.out.println(s2.hashCode());
        System.out.println(s2.hashCode());

        char[] ch2 = s2.toCharArray();


        System.out.println(s1.concat(s2));

        s1 = s1.concat(s2);
        System.out.println(s1);

        Long l1 = 120L; //autoboxed
        long l2 = l1; //unboxing


        Number num = new Integer(1);

        System.out.println(l1);
        System.out.println(l2);

        int i1 = 10;
        int i2 = 20;
        System.out.println(sum(i1, i2));

        i1 = Integer.MAX_VALUE;
        i2 = Integer.MAX_VALUE;
        System.out.println(sum(i1, i2));

    }

    static int sum(int i1, int i2) {
        return i1 + i2;
    }
}
