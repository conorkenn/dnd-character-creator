package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Warlock implements BaseClass{

    private String className = "Warlock";
    private int hitDie = 8;
    private String getHitDice = "1d8";
    private String savingThrows[] = {"Wisdom", "Charisma"};
    private String skills[] = {"Arcana", "Deception", "Intimidation", "Investigation", "Nature", "Religion"};
    private String features[] = {"Otherworldly Patron", "Pact Magic"};
    private String firstEquipmentChoice[] = {"A light crossbow and 20 bolts", "Any simple weapon"};
    private String secondEquipmentChoice[] = {"A component pouch", "An arcane focus"};
    private String thirdEquipmentChoice[] = {"A scholar's pack", "A explorer's pack"};
    private String guaranteedEquipment[] = {"Leather armor", "Any simple weapon", "Two daggers"};


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
