package Robots_Game;

import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);
    private static int suffixNameCounter = 1;


    public static Character getKeyFromConsole() {
        return scanner.next().charAt(0);
    }

    public static String getNameFromConsole(){
        return scanner.next();
    }


    public static void requirementRobotName() {
        System.out.printf("Enter Robot_%s name:%n", suffixNameCounter);
        suffixNameCounter = suffixNameCounter + 1;
    }


}
