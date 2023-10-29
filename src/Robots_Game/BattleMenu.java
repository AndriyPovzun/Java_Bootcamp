package Robots_Game;

import Robots_Game.utils.ProjectVariables;

public class BattleMenu extends Menu {
    public static void showPossibleActions(Robot robot) {
        System.out.printf("%nFor exit press %s%n" +
                        "A shot at the robot: %s%n" +
                        "Your step: press key (%s)%n", ProjectVariables.exitButton,
                robot.getName(),
                ProjectVariables.validButtons);
    }
}
