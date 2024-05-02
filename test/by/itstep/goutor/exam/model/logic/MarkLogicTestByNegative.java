package by.itstep.goutor.exam.model.logic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MarkLogicTestByNegative {
    int[] marks;

    @Before
    public void init() {
        marks = new int[]{1};
    }

    @Test
    public void getNumOfPeriodTestByInvalidMark() {
        int expected = -1;

        int actual = MarkLogic.getNumOfPeriod(marks);

        Assert.assertEquals(expected, actual, 0);
    }
}
