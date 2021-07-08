package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Rogue implements BaseClass{

    private String className = "Rogue";
    private int hitDie = 8;
    private String getHitDice = "1d8";
    private String savingThrows[] = {"Dexterity", "Intelligence"};
    private String skills[] = {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", "Investigation",
                                "Perception", "Performance", "Persuasion", "Sleight of Hand", "Stealth"};
    private String features[] = {"Expertise", "Sneak Attack", "Thieves' Cant"};
    private String firstEquipmentChoice[] = {"A rapier", "A shortsword"};
    private String secondEquipmentChoice[] = {"A shortbow and quiver of 20 arrows", "A shortsword"};
    private String thirdEquipmentChoice[] = {"A burglar's pack", "A dungeoneer's pack", "A explorer's pack"};
    private String guaranteedEquipment[] = {"Leather armor", "Two daggers", "Thieves' tools"};


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
