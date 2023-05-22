package lesson18;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyLambda {
    Double myMethod() {
        return 123.45;
    }
    static Double myStaticMethod() {
        return 43.21;
    }

    public static void main(String[] args) throws Exception {
        doCalculation(() -> 123.45);
        doCalculation(() -> new Random().nextDouble());
        doCalculation(new MyLambda()::myMethod);//ссылка на метод
        doCalculation(MyLambda::myStaticMethod);

    }

    public static void doCalculation(Callable<Double> doubleCallable) throws Exception {
        Double result = doubleCallable.call();
        System.out.println(result);
    }
}
