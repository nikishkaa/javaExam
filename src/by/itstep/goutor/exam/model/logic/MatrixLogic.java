package by.itstep.goutor.exam.model.logic;

public class MatrixLogic {
    public static int[][] getReverseMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] rotatedImage = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotatedImage[j][rows - 1 - i] = matrix[i][j];
            }
        }

        //Не без помощи copilot ):
        return rotatedImage;
    }
}
