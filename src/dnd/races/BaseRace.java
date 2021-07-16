package dnd.races;

import dnd.dice.GameDice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BaseRace implements Race {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public BaseRace(){
        this.strength = 1;
        this.dexterity =1;
        this.constitution =1;
        this.intelligence = 1;
        this.wisdom = 1;
        this.charisma = 1;

        setStats();
    }

    public BaseRace(int strength , int dexterity, int constitution , int intelligence , int wisdom, int charisma) {

        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

        setStats();
    }



    @Override
    public String getRace(){
        return "BaseRace";
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public int getConstitution() {
        return this.constitution;
    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public int getWisdom() {
        return this.wisdom;
    }

    @Override
    public int getCharisma() {
        return this.charisma;
    }


    @Override
    public void setStats() {

        GameDice gd = new GameDice();
        this.strength += (gd.d6() + gd.d6()+ gd.d6());
        this.dexterity += (gd.d6() + gd.d6()+ gd.d6());
        this.constitution += (gd.d6() + gd.d6()+ gd.d6());
        this.intelligence += (gd.d6() + gd.d6()+ gd.d6());
        this.wisdom += (gd.d6() + gd.d6()+ gd.d6());
        this.charisma += (gd.d6() + gd.d6()+ gd.d6());

    }

    @Override
    public ArrayList<Integer> getStats() {
        ArrayList<Integer> stats = new ArrayList<Integer>(Arrays.asList(
                this.strength,
                this.dexterity,
                this.constitution,
                this.intelligence,
                this.wisdom,
                this.charisma
        ));

        return stats;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String[] getRacialBonus() {
        return new String[0];
    }

    @Override
    public String[] getLanguages() {
        return new String[0];
    }

    @Override
    public String getSize() {
        return null;
    }

    @Override
    public List<String> getAllAttributes() {
        return null;
    }



}
