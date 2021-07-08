package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Wizard implements BaseClass{

    private String className = "Wizard";
    private int hitDie = 6;
    private String getHitDice = "1d6";
    private String savingThrows[] = {"Intelligence", "Wisdom"};
    private String skills[] = {"Arcana", "History", "Insight", "Investigation", "Medicine",  "Religion"};
    private String features[] = {"Spellcasting", "Arcane Recovery"};
    private String firstEquipmentChoice[] = {"A quarterstaff", "A dagger"};
    private String secondEquipmentChoice[] = {"A component pouch", "An arcane focus"};
    private String thirdEquipmentChoice[] = {"A scholar's pack", "A explorer's pack"};
    private String guaranteedEquipment[] = {"A spellbook"};


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
        return 6 + constitution;
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
