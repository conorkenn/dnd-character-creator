package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Fighter implements BaseClass{

    private String className = "Fighter";
    private int hitDie = 10;
    private String getHitDice = "1d12";
    private String savingThrows[] = {"Strength", "Constitution"};
    private String skills[] = {"Acrobatics", "Animal Handling", "Athletics", "History", "Insight", "Intimidation", "Perception", "Survival"};
    private String features[] = {"Fighting Style", "Second Wind"};
    private String firstEquipmentChoice[] = {"Chain mail", "Leather,longbow and 20 arrows"};
    private String secondEquipmentChoice[] = {"A martial weapon and shield", "Two martial weapons"};
    private String thirdEquipmentChoice[] = {"A light crossbow and 20 bolts", "Two handaxes"};
    private String fourthEquipmentChoice[] = {"A dungeoneer's pack", "A explorer's pack"};



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
        return fourthEquipmentChoice;
    }

    public String[] getGuaranteedEquipment() {
        return null;
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

        return f;
    }

}
