package com.epam.third;

/**
 * Необходимо смоделировать работу светофора.
 * С 0 по 3 секунду светофор горит зеленым
 * С 4 по 5 секунду светофор горит желтым
 * С 6 по 9 секунду светофор горит красным
 *
 * На вход программе подается целое положительное число в виде строки (через параметры командной строки args), представляющее секунды с момента начала работы светофора.
 * Необходимо определить, каким цветом будет гореть светофор спустя указанное количество секунд и вывести в консоль ответ.
 * Задачу можно решить используя операторы условного ветвления if и switch (в качестве практики рекомендуется реализовать оба варианта).
 */

public class TrafficligthByEnum {
    public static void main(String[] args) {

        int numberOfSecond = Integer.parseInt(args[0]) % 10;
        Colour light;

        if (numberOfSecond < 4){
            light = Colour.GREEN;
        }else if (numberOfSecond < 6){
            light = Colour.YELLOW;
        } else {
            light = Colour.RED;
        }

        System.out.println("The colour of Trafficlight is " + light.toString());
    }
}