package Robots_Game;

import java.util.ArrayList;

public class ListOfRobots {
    private static final ArrayList<Robot> robotArrayList = new ArrayList<>();

    public static void addRobot(Robot robot) {
        robotArrayList.add(robot);
    }


    public static Robot getNextRobot(Robot inputRobot) {
        if (inputRobot == null) {
            return robotArrayList.get(0);
        } else {
            for (Robot robot : robotArrayList) {
                if (robot != inputRobot) {
                    return robot;
                }
            }
        }
        return inputRobot;
    }

}
