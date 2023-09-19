package lesson_2_HW;

public class MainClass_HW {
    public static void main(String[] args) {
        int res = Calc_HW.multipleDoubled(5, 3);
        int res_2 = Calc_HW.subtractingDoubled(10, 7);

        Calc_HW calcHw = new Calc_HW();
        int result = calcHw.divisionDoubled(100, 0);
        System.out.println(result);
        double result2 = calcHw.divisionDoubled(100.0, 0);
        System.out.println(result2);

        int x = 5;
        int y = 10;
        int z = 15;
        int q = 20;

        int rez_2 = Calc_HW.multipleDoubled(calcHw.divisionDoubled
                (Calc_HW.multipleDoubled
                        (Calc_HW.subtractingDoubled
                                (Calc_HW.multipleDoubled
                                        (Calc_HW.subtractingDoubled
                                                (q, x), 2), y), 2), z), 2);
        System.out.println("REZ_2: " + rez_2);
        int rez = (((q - x) * 2 - y) * 2 / z) * 2;
        System.out.println("REZ_1: " + rez);
    }
}
