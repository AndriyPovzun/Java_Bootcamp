package Robots_Game;

import Robots_Game.utils.ProjectVariables;

import java.util.ArrayList;
import java.util.Random;

public class DamageButtons {
    private String alphabet = ProjectVariables.validButtons;
    private final ArrayList<Character> damageButtons = new ArrayList<>();


    private char getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        return randChar;
    }


    public ArrayList<Character> setDamageButtons() {
        for (int i = 0; i < 5; i++) {
            damageButtons.add(getRandomKey());
        }
        return damageButtons;
    }
}