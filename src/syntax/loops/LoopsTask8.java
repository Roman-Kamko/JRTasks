package syntax.loops;

import java.util.Scanner;

public class LoopsTask8 {
    public static void main(String[] args) {
        /*Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
        Слово "enough" выводить не нужно.
        Для этого необходимо использовать бесконечный цикл (while(true)).
        Подсказка: чтобы завершить бесконечный цикл, используй оператор break.*/
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equals("enough")) {
                break;
            } else {
                System.out.println(str);
            }
        }
    }
}
