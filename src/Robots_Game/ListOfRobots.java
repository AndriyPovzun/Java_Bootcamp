package Robots_Game;

import java.util.ArrayList;

public class ListOfRobots {
    private static final ArrayList<Robot> robotArrayList = new ArrayList<>();

    public static void addRobot(Robot robot) {
        robotArrayList.add(robot);
    }


    public static Robot getNextRobot(Robot inputRobot) {
        int lastRobotIndex = robotArrayList.size() - 1;
        if (inputRobot == null || robotArrayList.indexOf(inputRobot) == lastRobotIndex) {
            return robotArrayList.get(0);
        } else {
            int nextRobotPosition = robotArrayList.indexOf(inputRobot) + 1;
            return robotArrayList.get(nextRobotPosition);
        }
    }
}


