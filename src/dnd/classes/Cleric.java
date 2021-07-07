package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Cleric implements BaseClass{

    private String className = "Cleric";
    private int hitDie = 8;
    private String getHitDice = "1d8";
    private String savingThrows[] = {"Wisdom", "Charisma"};
    private String skills[] = {"History", "Insight", "Medicine", "Persuasion", "Religion"};
    private String features[] = {"Spellcasting", "Divine Domain"};
    private String firstEquipmentChoice[] = {"A mace", "A warhammer"};
    private String secondEquipmentChoice[] = {"Scale mail", "Leather armor", "Chainmail armor"};
    private String thirdEquipmentChoice[] = {"A light crossbow and 20 bolts", "Any simple weapon"};
    private String fourthEquipmentChoice[] = {"A priest's pack", "A explorer's pack"};
    private String guaranteedEquipment[] = {"A shield", "A holy symbol"};


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
        return 8 + constitution;
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
        return thirdEquipmentChoice;
    }

    public String[] getFourthEquipmentChoice() {
        return fourthEquipmentChoice;
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
        f.add(Arrays.toString(getThirdEquipmentChoice()));
        f.add(Arrays.toString(getFourthEquipmentChoice()));
        f.add(Arrays.toString(getGuaranteedEquipment()));

        return f;
    }
}
