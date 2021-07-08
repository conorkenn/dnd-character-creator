package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Ranger implements BaseClass{
    private String className = "Ranger";
    private int hitDie = 10;
    private String getHitDice = "1d10";
    private String savingThrows[] = {"Strength", "Dexterity"};
    private String skills[] = {"Animal Handling", "Athletics", "Insight", "Investigation", "Nature", "Perception", "Stealth", "Survival"};
    private String features[] = {"Favored Enemy", "Natural Explorer"};
    private String firstEquipmentChoice[] = {"Scale mail", "Leather armor"};
    private String secondEquipmentChoice[] = {"Two shortswords", "Two simple melee weapons"};
    private String thirdEquipmentChoice[] = {"A dungeoneer's pack", "A explorer's pack"};
    private String guaranteedEquipment[] = {"A longbow", "A quiver of 20 arrows"};


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
        return 10 + constitution;
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
        f.add(Arrays.toString(getThirdEquipmentChoice()));
        f.add(Arrays.toString(getGuaranteedEquipment()));

        return f;
    }

}
