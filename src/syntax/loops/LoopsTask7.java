package syntax.loops;

import java.util.Scanner;

public class LoopsTask7 {
    /*Галабаги боятся загадочного целого числа. Нужно его найти в методе checkNumber(int). В этом методе в бесконечном
    цикле считываются целые числа с клавиатуры. Каждое считанное число сравнивается с входящим параметром.
    Если они одинаковые, то бесконечный цикл прерывается — загадочное число найдено и оно выводится в консоль.
    Вывод должен быть следующим:
    "Загадочное число равно <число>".
    Если числа разные — выводим в консоль фразу "Попробуй еще раз" и продолжаем поиск.
    Для прерывания цикла используй оператор break.
    Метод main() не участвует в тестировании.*/
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        while (scanner.hasNextInt()) {
            if (scanner.nextInt() != number) {
                System.out.println("Попробуй еще раз");
            } else {
                System.out.println("Загадочное число равно " + number);
                break;
            }
        }
    }
}
