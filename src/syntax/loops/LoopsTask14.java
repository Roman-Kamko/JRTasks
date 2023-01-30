package syntax.loops;

import java.util.Random;
import java.util.Scanner;

public class LoopsTask14 {
    public static void main(String[] args) {
        /*Вирус предсказывает действия антивируса и перебирается в уже проверенное антивирусом место, прячась от него.
        Твоя задача — переписать программу, используя цикл for вместо while. Функционал программы не меняй.
        Программа считывает с клавиатуры целое число больше 0. В бесконечном цикле while генерируется случайное число в
        диапазоне от 0 до считанного числа включительно. Числа генерируются до тех пор, пока случайное число не совпадет
        с введенным. В этом случае цикл завершается.
        Также есть переменная-счетчик count, которая увеличивается на 1 при каждой новой итерации цикла. Этот счетчик
        показывает с какой попытки числа совпали.*/

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Программа завершена. Введенное число должно быть больше 0.");
            return;
        }

        /*int count = 1;
        while (true) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Попытка №" + count);
                break;
            }
            count++;
        }*/

        for (int count = 1; true; count++) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Попытка №" + count);
                break;
            }
        }
    }
}
