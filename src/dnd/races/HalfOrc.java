package dnd.races;

import java.util.ArrayList;
import java.util.Arrays;

public class HalfOrc extends BaseRace{

    private int speed = 30;
    private String size = "Medium";
    private String languages[] = {"Common", "Orc"};
    private String racialBonus[] = {"Darkvision", "Menacing", "Relentless Endurance", "Savage Attacks"};
    private String[] subRacialBonus ={""};

    public HalfOrc( int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+2 strength and +1 constitution from racial stat bonus
        super( strength + 2, dexterity, constitution + 1, intelligence, wisdom, charisma);
    }

    @Override
    public String getRace() {
        return "Half-Orc";
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
