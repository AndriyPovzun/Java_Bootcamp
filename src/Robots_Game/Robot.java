package Robots_Game;

import Robots_Game.utils.ProjectVariables;

import java.util.ArrayList;

public class Robot {
    private int health = 100;
    private final String name;
    private final ArrayList<Character> damageButtons;
    private final ArrayList<Character> usedDamageButtons;

    public Robot(String name) {
        this.name = name;
        DamageButtons randomButtons = new DamageButtons();
        damageButtons = randomButtons.setDamageButtons();
        usedDamageButtons = new ArrayList<>();
    }

    //Current health level of the robot<name>: <health_level>"
    private void damage() {
        health = health - 20;
        System.out.printf("Good shot! Current health level of the robot %s: %s HP %n", this.name, this.health);
    }


    public boolean isRobotAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }


    public void shoot(Character button) {
        String validButtons = ProjectVariables.validButtons;
        Character exitButton = ProjectVariables.exitButton;
        button = Character.toUpperCase(button);
        boolean validInput = false;
        do {
            if (validButtons.contains(button.toString()) || button.equals(exitButton)) {
                if (damageButtons.contains(button)) {
                    damage();
                    usedDamageButtons.add(button);
                    damageButtons.remove(button);
                } else {
                    if (usedDamageButtons.contains(button)) {
                        System.out.printf("%s - Key is not active%n", button);
                        break;
                    }
                    System.out.printf("Key %s does not damage.%n", button);
                }
                validInput = true;
            } else {
                System.out.printf("%s - Wrong enters. Use only key from %s keys.%n", button, validButtons);
                button = Character.toUpperCase(Menu.getKeyFromConsole());
            }
        } while (!validInput);

    }

}
