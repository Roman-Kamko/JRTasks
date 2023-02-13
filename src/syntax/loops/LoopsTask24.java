package syntax.loops;

import java.util.Scanner;

public class LoopsTask24 {
    public static void main(String[] args) {
        /*Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество
        людей в кабинете. Вывести на экран результат деления первого числа на второе. Результатом должно быть
        вещественное число.*/
        Scanner sc = new Scanner(System.in);
        int bottleCount = sc.nextInt();
        int employeeCount = sc.nextInt();
        double bottlePerEmployee = (double) bottleCount / employeeCount;
        System.out.println(bottlePerEmployee);
    }
}
