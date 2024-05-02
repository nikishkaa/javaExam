package by.itstep.goutor.exam.util;

public class UserUI {
    public static final StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(int maxFiveCount, int[][] newMatrix) {
        BUILDER.append("\nMax five in 7 day period: ").append(maxFiveCount)
                .append("\nReverse matrix: ").append("\n");

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                BUILDER.append(newMatrix[i][j]).append(" ");
            }
            BUILDER.append("\n");
        }

        return BUILDER.toString();
    }
}
