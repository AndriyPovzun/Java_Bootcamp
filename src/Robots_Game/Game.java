package Robots_Game;

import Robots_Game.utils.ProjectVariables;

public class Game {
    public static void main(String[] args) {
        Character EXIT_BUTTON = ProjectVariables.exitButton;
        //Get first robot name
        Menu.requirementRobotName();
        String nameFirstRobot = Menu.getNameFromConsole();
        ////Get second robot name
        Menu.requirementRobotName();
        String nameSecondRobot = Menu.getNameFromConsole();
        Robot robotOne = new Robot(nameFirstRobot);
        Robot robotTwo = new Robot(nameSecondRobot);
        ListOfRobots.addRobot(robotOne);
        ListOfRobots.addRobot(robotTwo);
        //Get default robot
        Robot robotInBattle = ListOfRobots.getNextRobot(null);
        char inputKey;
        do {
            BattleMenu.showPossibleActions(robotInBattle);
            inputKey = Character.toUpperCase(BattleMenu.getKeyFromConsole());
            if (inputKey == EXIT_BUTTON) {
                break;
            } else {
                robotInBattle.shoot(inputKey);
                if (robotInBattle.isRobotAlive()) {
                    robotInBattle = ListOfRobots.getNextRobot(robotInBattle);
                    System.out.printf("Turn moves to %s%n", robotInBattle.getName());
                } else {
                    System.out.printf("Robot %s Died.%n" +
                                    "Robot %s Winner!!!%n", robotInBattle.getName(),
                            ListOfRobots.getNextRobot(robotInBattle).getName());
                    break;
                }

            }
        } while (inputKey != EXIT_BUTTON);
        System.out.println("Exit from the game...");
    }

}
