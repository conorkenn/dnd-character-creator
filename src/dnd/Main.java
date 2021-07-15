package dnd;

import dnd.classes.Barbarian;
import dnd.dice.GameDice;
import dnd.races.*;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        /*GameDice dice = new GameDice();
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
        }*/

        CharacterSheet cs = new CharacterSheet("Conor", "Dwarf", "Barbarian", "Criminal");

        List<String> raceStuff = cs.getRace().getAllAttributes();
        List<String> classStuff = cs.getClazz().getAllFeatures(cs.getRace().getConstitution());
        List<String> backgroundStuff = cs.getBackground().getAllFeatures();
        System.out.println(cs.getName());
        System.out.println("___RACE___");
        for(String s: raceStuff){
            System.out.println(s);
        }
        System.out.println("___CLASS___");
        for(String s: classStuff){
            System.out.println(s);
        }
        System.out.println("___BACKGROUND___");
        for(String s: backgroundStuff){
            System.out.println(s);
        }




    }
}
