package lesson_3_HW;
//- У класі WorkWithMassive створити метод який буде створювати матрицю (тип int) та заповнювати
// її заданим значенням (розмірність матриці та значення передаємо з основної програми, наприклад
// за розміром NхM (наприклад 3х3) та заповнювати її заданим значенням, наприклад 8.).
// Після заповнення повертати її.
//- Також у цьому класі створити метод fillingOfLeftDiagonal - метод повинен приймати на вхід матрицю і
// значення для заповнення. Перевіряти чи квадратна вона. Якщо так, то заповнювати діагональ переданим
// значенням та повертати матрицю. Якщо не квадратна - виводити повідомлення "Матриця не квадратна" та повертати незмінену матрицю
//- Також у цьому класі створити метод fillingOfRightDiagonal - аналогічно fillingOfLeftDiagonal але
// заповнювати праву діагональ
//- Створити метод із заповнення значеннями відразу двох діагоналей переданим значенням
//- Метод виведення матриці в консоль у "гарному вигляді" - рядки - значення через пробіл, а
// кожен рядок з нового рядка (ми вже створили його на занятті, просто перенести
// його в клас по роботі з масивом). Наприклад

import java.util.Arrays;

//
public class WorkWithMassive {

    public int[][] createMatrix(int height, int width, int fill_value) {
        int[][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = fill_value;
            }

        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.print("\n");
        }
    }

    private boolean isMatrixSquare(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            System.out.println("Matrix Not Square!");
            return false;
        } else {
            return true;
        }
    }

    public int[][] fillingLeftDiagonal(int[][] matrix, int fill_value) {
        if (isMatrixSquare(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = fill_value;
            }
        }
        return matrix;
    }

    public int[][] fillingRightDiagonal(int[][] matrix, int fill_value) {
        if (isMatrixSquare(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[(matrix.length - 1) - i][i] = fill_value;
            }
        }
        return matrix;
    }

    public int[][] fillCrossDiagonal(int[][] matrix, int fill_value) {
        matrix = fillingLeftDiagonal(matrix, fill_value);
        matrix = fillingRightDiagonal(matrix, fill_value);
        return matrix;

    }

}
