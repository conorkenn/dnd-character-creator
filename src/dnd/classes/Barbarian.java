package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Barbarian implements BaseClass {

    private String className = "Barbarian";
    private int hitDie = 12;
    private String getHitDice = "1d12";
    private String savingThrows[] = {"Strength", "Constitution"};
    private String skills[] = {"Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival"};
    private String features[] = {"Rage", "Unarmored Defense"};
    private String firstEquipmentChoice[] = {"Greataxe", "martial melee weapon"};
    private String secondEquipmentChoice[] = {"Two Handaxes", "any simple weapon"};
    private String guaranteedEquipment[] = {"Explorer's Pack", "Four Javelins"};


    public String getClassName() {
        return className;
    }

    public int getHitDie() {
        return hitDie;
    }

    public String getHitDice() {
        return getHitDice;
    }

    public int getHitPoints(int constitution) {
        return 12 + constitution;
    }

    public String[] getSavingThrows() {
        return savingThrows;
    }

    public String[] getSkills() {
        return skills;
    }

    public int getProficiencyBonus() {
        return 2;
    }

    public String[] getFeatures() {
        return features;
    }

    public String[] getFirstEquipmentChoice() {
        return firstEquipmentChoice;
    }

    public String[] getSecondEquipmentChoice() {
        return secondEquipmentChoice;
    }

    public String[] getThirdEquipmentChoice() {
        return null;
    }

    public String[] getFourthEquipmentChoice() {
        return null;
    }

    public String[] getGuaranteedEquipment() {
        return guaranteedEquipment;
    }

    public ArrayList<String> getAllFeatures(int constitution) {
        ArrayList<String> f = new ArrayList<String>();
        f.add(getClassName());
        f.add(String.valueOf(getHitDie()));
        f.add(getHitDice());
        f.add(String.valueOf(getHitPoints(constitution)));
        f.add(String.valueOf(getProficiencyBonus()));
        f.add(Arrays.toString(getSavingThrows()));
        f.add(Arrays.toString(getSkills()));
        f.add(Arrays.toString(getFeatures()));
        f.add(Arrays.toString(getFirstEquipmentChoice()));
        f.add(Arrays.toString(getSecondEquipmentChoice()));
        f.add(Arrays.toString(getGuaranteedEquipment()));

        return f;
    }
}
