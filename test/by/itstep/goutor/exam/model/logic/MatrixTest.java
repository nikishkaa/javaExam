package by.itstep.goutor.exam.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void matrixTest() {
        int matrix[][] = {
                {1,1},
                {2,3}
        };

        int[][] expected = {
                {2,1},
                {3,1}
        };

        int[][] actual = MatrixLogic.getReverseMatrix(matrix);

        Assert.assertEquals(expected, actual);
    }
}
