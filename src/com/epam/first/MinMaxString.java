package com.epam.first;


/**
 * На вход программе подается несколько строк (через параметры командной строки args).
 * Среди них необходимо найти и вывести на экран наибольшую и наименьшую по длине строки.
 * Если строк с одинаковой длиной несколько - вывести последнюю из них.
 * Длину строки можно получить вызвав метод .length() на объекте типа String.
 *
 * Входные данные:
 * a abc edf q
 * Вывод:
 * Минимальная строка среди представленных: q
 * Максимальная строка среди представленных: edf
 */
public class MinMaxString {
    public static void main(String[] args) {

        int minValueOfString = args[0].length();
        int maxValueOfString = args[0].length();
        String minString = args[0];
        String maxString = args[0];

        for (String arg : args) {
            if (arg.length() <= minValueOfString) {
                minValueOfString = arg.length();
                minString = arg;
            } else if (arg.length() >= maxValueOfString) {
                maxValueOfString = arg.length();
                maxString = arg;
            }
        }

        System.out.println("Минимальная строка среди представленных: " + minString);
        System.out.println("Максимальная строка среди представленных: " + maxString);
    }
}
