package syntax.loops;

import java.util.Scanner;

public class LoopsTask25 {
    public static void main(String[] args) {
        /*Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
        Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
        Поэтому сделаем конвертер величин скорости из м/с в км/ч.
        Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
        Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
        Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
        Для округления необходимо использовать метод Math.round().*/

        Scanner sc = new Scanner(System.in);
        int speedInMS = sc.nextInt();
        double index = 3.6;
        int speedInKmH = (int) Math.round(speedInMS * index);
        System.out.println(speedInKmH);
    }
}
