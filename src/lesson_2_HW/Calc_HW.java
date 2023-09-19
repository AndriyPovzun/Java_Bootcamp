package lesson_2_HW;

public class Calc_HW {
    public static int multipleDoubled(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static int subtractingDoubled(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }


    public int divisionDoubled(int var1, int var2) {
        try {
            return var1 / var2;
        } catch (ArithmeticException e) {
            return 88888;
        } catch (Exception e) {
            return 99999;
        }
    }

    public double divisionDoubled(double var1, double var2) {
        try {
            return var1 / var2;
        } catch (ArithmeticException e) {
            return 88888;
        } catch (Exception e) {
            return 99999;
        }
    }
}
