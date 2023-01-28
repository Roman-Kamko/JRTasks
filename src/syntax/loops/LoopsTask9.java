package syntax.loops;

public class LoopsTask9 {
    public static void main(String[] args) {
        /*Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3. Для этого используй цикл while.
        Подсказка: чтобы в цикле перейти к следующему числу, используй оператор continue.*/
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            } else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
