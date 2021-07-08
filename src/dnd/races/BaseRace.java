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

    }

    public BaseRace(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

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
