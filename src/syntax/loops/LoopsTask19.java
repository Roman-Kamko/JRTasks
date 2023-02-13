package syntax.loops;

public class LoopsTask19 {
    /*Амиго одевается в суперброню диггера, с помощью которой проникает вглубь планеты. В недрах планеты он должен
    уничтожить зараженных галабагами роботов. В этой части тебе предстоит вывести на экран слои планеты, которые
    Амиго будет преодолевать. Для реализации этой задачи используй вложенные циклы for.
    Размер слоев: 10*10 символов. Для вывода в консоль используй переменную land.*/
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(land);
            for (int j = 0; j < 9; j++) {
                System.out.print(land);
            }
            System.out.println();
        }
    }
}
