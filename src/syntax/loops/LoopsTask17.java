package syntax.loops;

import java.util.Scanner;

public class LoopsTask17 {
        /*Галабаги взломали систему сбора данных калибровки системы климат контроля. Мы собирали данные с одних и тех
        же мест в системе, но галабаги узнали эти места и стали показывать там подмененные данные. Это привело к сбою
        калибровки климата.
        Нужно вычислить среднее арифметическое замеров в пяти местах, чтобы получить реальные данные и по ним
        откалибровать климат.
        Для этого в цикле for нужно считать 5 целых чисел, вычислить их среднее арифметическое и вывести на экран
        (вывод должен быть целочисленным).
        При неправильном выполнении задачи по планете проходят разрушительные ураганы смерчи. При верном выполнении
        погода на Айтинии приходит в норму.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printSeparator();
        System.out.println("Расчет среднеарифметического значения для целых чисел.");
        System.out.print("Введите количество чисел используемых для расчета: ");

        int numCount;
        if (!in.hasNextInt()) {
            throw new RuntimeException("Нужно ввести целое число!");
        } else {
            numCount = in.nextInt();
        }

        double result = calculateResult(numCount);
        System.out.printf("Среднее арифметическое введенных чисел равно: %.2f%n", result);
        printSeparator();
    }

    static double calculateResult(int numCount) {
        Scanner in = new Scanner(System.in);
        double result = 0;
        double sum = 0;
        for (int i = 1; i <= numCount; i++) {
            if (!in.hasNextInt()) {
                throw new RuntimeException("Расчет только для целых чисел, вы ввели вещественное число или символ!");
            } else {
                int numInput = in.nextInt();
                sum += numInput;
                result = sum / i;
            }
        }
        return result;
    }

    static void printSeparator() {
        System.out.println("-----------------------------------------------------------------");
    }
}
