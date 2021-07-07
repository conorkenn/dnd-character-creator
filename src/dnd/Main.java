package dnd;

import dnd.classes.Barbarian;
import dnd.dice.GameDice;
import dnd.races.*;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        GameDice dice = new GameDice();
        Tiefling test = new Tiefling("Bob", 1,1,1,1,1,1);
        Barbarian classtest = new Barbarian();
        ArrayList<String> atrib = classtest.getAllFeatures(test.getConstitution());
        classtest.getHitPoints(test.getConstitution());
        for(String s: atrib){
            System.out.println(s);
        }




    }
}
