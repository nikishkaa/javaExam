package by.itstep.goutor.exam.model.logic;

public class MarkLogic {
    public static int getNumOfPeriod(int[] marks) {
        for (int mark : marks) {
            if (mark < 2 || mark > 5) {
                return -1;
            }
        }

        int maxFiveCount = 0;
        int currentFiveCount = 0;


        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 5) {
                currentFiveCount++;
            } else if (marks[i] == 2 || marks[i] == 3) {
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
