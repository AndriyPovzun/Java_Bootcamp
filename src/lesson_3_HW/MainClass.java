package lesson_3_HW;

public class MainClass {
    public static void main(String[] args) {
        WorkWithMassive matrixClass = new WorkWithMassive();
        int[][] result = matrixClass.createMatrix(5, 5, 0);
        matrixClass.printMatrix(result);
        result = matrixClass.fillingLeftDiagonal(result, 5);
        System.out.println("-------------------------------");
        matrixClass.printMatrix(result);
        result = matrixClass.fillingRightDiagonal(result,4);
        System.out.println("-------------------------------");
        matrixClass.printMatrix(result);
        result = matrixClass.fillCrossDiagonal(result, 9);
        System.out.println("-------------------------------");
        matrixClass.printMatrix(result);
    }
}
