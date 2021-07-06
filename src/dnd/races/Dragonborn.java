package dnd.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Dragonborn extends BaseRace{

    private int speed = 30;
    private String size = "Medium";
    private String languages[] = {"Common", "Draconic"};
    private String racialBonus[] = {"Draconic Ancestry", "Breath Weapon", "Damage Resistance"};
    private String[] subRacialBonus ={""};

    public Dragonborn(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+2 strength and + 1 Charisma from racial stat bonus
        super(name, strength + 2, dexterity, constitution, intelligence, wisdom, charisma + 1);
    }

    @Override
    public String getRace() {
        return "Dragonborn";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String[] getLanguages() {
        return languages;
    }

    @Override
    public String[] getRacialBonus() {
        return racialBonus;
    }

    public String[] getSubRacialBonus() {
        return subRacialBonus;
    }

    public ArrayList<String> getAllAttributes(){
        ArrayList<String> attributes = new ArrayList<String>();
        attributes.add(getName());
        attributes.add(getRace());
        attributes.add(String.valueOf(getStrength()));
        attributes.add(String.valueOf(getDexterity()));
        attributes.add(String.valueOf(getConstitution()));
        attributes.add(String.valueOf(getIntelligence()));
        attributes.add(String.valueOf(getWisdom()));
        attributes.add(String.valueOf(getCharisma()));
        attributes.add(String.valueOf(getSpeed()));
        attributes.add(getSize());
        attributes.add(Arrays.toString(getRacialBonus()));
        attributes.add(Arrays.toString(getSubRacialBonus()));
        attributes.add(Arrays.toString(getLanguages()));
        return attributes;

    }
}
