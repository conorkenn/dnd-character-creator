package dnd;

import dnd.dice.GameDice;
import dnd.races.*;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        GameDice dice = new GameDice();
        Tiefling test = new Tiefling("Bob", 1,1,1,1,1,1);

        ArrayList<String> atrib = test.getAllAttributes();

        for(String s: atrib){
            System.out.println(s);
        }



    }
}
