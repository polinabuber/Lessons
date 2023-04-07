package lesson9;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public final static String ALL_CYRILLIC_STRINGS = "[\\u0410-\\u044F\\u0451\\u0401]+"; //Шаблон регулярного выражения

    public static void main(String[] args) {
        System.out.println("Мама".matches(ALL_CYRILLIC_STRINGS));
        System.out.println(
                "test12test 463 tesoks\\c232".matches("\\D{4}"));
        System.out.println(
                "test".matches("\\D{4}"));
        System.out.println(
                "375259226572".matches("\\d{12}"));
        System.out.println(
                Arrays.toString("I love Java. And I love beer".split("love")));


        String[] strings = "I love Java. And I love beer".split("love");
        System.out.println(strings);
        System.out.println(Arrays.toString(strings));

        Pattern pattern = Pattern.compile(ALL_CYRILLIC_STRINGS); //Шаблон ищет только кириллицу
        String text = "Я люблю beer and футбол!!!";
        final Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
        /*System.out.println(matcher.find());
        System.out.println(matcher.start());          //Вместо повторения использовать ЦИКЛ!!!!
        System.out.println(matcher.end());

        System.out.println(matcher.find());
        System.out.println(matcher.start());
        System.out.println(matcher.end());*/


    }


}
