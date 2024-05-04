package by.itstep.goutor.exam.model.logic;

public class MarkLogic {
    public static final int MIN_MARK = 2;
    public static final int MAX_MARK = 5;

    public static int getNumOfPeriod(int[] marks) {
        for (int mark : marks) {
            if (mark < MIN_MARK || mark > MAX_MARK) {
                return -1;
            }
        }


        int maxFiveCount = 0;
        int currentFiveCount = 0;


        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == MAX_MARK) {
                currentFiveCount++;
            } else if (marks[i] == MIN_MARK || marks[i] == 3) {
                currentFiveCount = 0;
            }

            if (currentFiveCount > maxFiveCount) {
                maxFiveCount = currentFiveCount;
            } else if (i >= 6) {
                break;
            }
        }

        maxFiveCount = maxFiveCount > 0 ? maxFiveCount : -1;


        return maxFiveCount;
    }
}
