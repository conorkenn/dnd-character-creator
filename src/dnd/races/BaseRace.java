package dnd.races;

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
    }

    public BaseRace(int strength , int dexterity, int constitution , int intelligence , int wisdom, int charisma) {

        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
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
    public void increaseStrength(int roll){this.strength += roll;}

    @Override
    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public void increaseDexterity(int roll) {
        this.dexterity += roll;
    }

    @Override
    public int getConstitution() {
        return this.constitution;
    }

    @Override
    public void increaseConstitution(int roll) {
        this.constitution += roll;
    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public void increaseIntelligence(int roll) {
        this.intelligence += roll;
    }

    @Override
    public int getWisdom() {
        return this.wisdom;
    }

    @Override
    public void increaseWisdom(int roll) {
        this.wisdom += roll;
    }

    @Override
    public int getCharisma() {
        return this.charisma;
    }

    @Override
    public void increaseCharisma(int roll) {
        this.charisma += roll;
    }

    @Override
    public void getStats() {

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
