package dnd;

import dnd.classes.Barbarian;
import dnd.dice.GameDice;
import dnd.races.*;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        GameDice dice = new GameDice();
        Tiefling raceTest = new Tiefling( 1,1,1,1,1,1);
        Barbarian classTest = new Barbarian();
        ArrayList<String> raceList = raceTest.getAllAttributes();
        ArrayList<String> classList = classTest.getAllFeatures(raceTest.getConstitution());
        classTest.getHitPoints(raceTest.getConstitution());

        System.out.println("RACE");
        for(String s: raceList){
            System.out.println(s);
        }
        System.out.println("CLASS");
        for(String s: classList){
            System.out.println(s);
        }




    }
}
