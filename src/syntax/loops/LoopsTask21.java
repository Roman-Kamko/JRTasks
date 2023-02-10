package syntax.loops;

public class LoopsTask21 {
    /*В этой части Амиго пробирается через все слои планеты к ее ядру, чтобы уничтожить зараженных галабагами роботов.
    Пробираясь через каждый слой, он оставляет после себя тоннель. Это значит, что в первых восьми слоях на четвертой
    позиции должен быть тоннель (переменная hole). В предпоследнем слое на четвертой позиции должен находится Амиго.
    Последний слой состоит из зараженных роботов.*/
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print(bug);
            } else {
                System.out.print(land);
            }
            for (int j = 0; j < 9; j++) {
                if (i < 8 && j == 2) {
                    System.out.print(" ");
                } else if (i == 8 && j == 2) {
                    System.out.print(robot);
                } else if (i == 9) {
                    System.out.print(bug);
                } else {
                    System.out.print(land);
                }
            }
            System.out.println();
        }
    }
}
