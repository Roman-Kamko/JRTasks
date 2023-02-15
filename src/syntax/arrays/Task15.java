package syntax.arrays;

public class Task15 {
    public static int[][][] multiArray = new int[][][]
            {{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(multiArray));
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
