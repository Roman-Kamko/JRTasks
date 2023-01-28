package syntax.loops;

public class LoopsTask10 {
    public static void main(String[] args) {
        /*Нужно охладить ядро планеты. Для этого при разогреве ядра нужно подсчитать сумму четных чисел в диапазоне от 1
        до 100 включительно с использованием цикла while. Таким образом настроить правильный обогрев планеты. Если
        систему не охладить, то она взрывается вместе с планетой.*/
        int i = 0;
        int sum = 0;
        while (i < 100) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
