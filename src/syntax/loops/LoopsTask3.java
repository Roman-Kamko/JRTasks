package syntax.loops;

import java.util.Scanner;

public class LoopsTask3 {
    public static void main(String[] args) {
        /*Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
        Каждый вывод - с новой строки.*/
        String text = " любит меня.";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int i = 0;
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }
    }
}
