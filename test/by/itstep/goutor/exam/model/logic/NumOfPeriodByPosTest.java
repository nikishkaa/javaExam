package by.itstep.goutor.exam.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class NumOfPeriodByPosTest {
    @Test
    public void getNumOfPeriodTest1() {
        int[] marks = new int[]{5, 5, 4, 5, 4, 5, 4, 5, 4};
        int expected = 4;

        int actual = MarkLogic.getNumOfPeriod(marks);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void getNumOfPeriodTest2() {
        int[] marks = new int[]{3, 4, 4, 4, 4, 5, 4, 5};
        int expected = 2;

        int actual = MarkLogic.getNumOfPeriod(marks);

        Assert.assertEquals(expected, actual, 0);
    }
}
