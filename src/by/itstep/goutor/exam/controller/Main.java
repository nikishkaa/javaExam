package by.itstep.goutor.exam.controller;

import by.itstep.goutor.exam.model.logic.MarkLogic;
import by.itstep.goutor.exam.model.logic.MatrixLogic;
import by.itstep.goutor.exam.util.MatrixInit;
import by.itstep.goutor.exam.util.UserInit;
import by.itstep.goutor.exam.util.UserUI;
import by.itstep.goutor.exam.view.Printer;

public class Main {
    public static void main(String[] args) {


        int[] allMark = UserInit.getAllMark();
        int maxFiveCount = MarkLogic.getNumOfPeriod(allMark);

        int[][] matrix = MatrixInit.createMatrix();
        int[][] newMatrix = MatrixLogic.getReverseMatrix(matrix);


        Printer.printer(UserUI.getUserUI(maxFiveCount, newMatrix));
    }
}
