package com.epam.second;

/**
 *Группа людей участвует в марафоне, их имена и время за которое они пробежали марафон представленны в массиве.
 * Необходимо найти человека, который быстрее всех пробежал дистанцию и вывести его имя и счет.
 * Опционально) Найти человека, который прибежал вторым.
 * 
 * public static void main(String...args) {
 * String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
 * int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
 * 
 * //поиск победителя
 * }
 */

public class Winner {
    public static void main(String... args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        int time = times[0];
        int indexOfWinner = 0;

        for (int i = 0; i < times.length; i++) {
            if (times[i] < time) {
                time = times[i];
                indexOfWinner = i;
            }
        }

        System.out.println(names[indexOfWinner] + " wins with time: " + time);
    }
}
