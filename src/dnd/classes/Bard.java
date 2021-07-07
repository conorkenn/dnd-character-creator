package dnd.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Bard implements BaseClass{

    private String className = "Bard";
    private int hitDie = 8;
    private String getHitDice = "1d8";
    private String savingThrows[] = {"Dexterity", "Charisma"};
    private String skills[] = {"Choose any three"};
    private String features[] = {"Spellcasting", "Bardic Inspiration (D6)"};
    private String firstEquipmentChoice[] = {"A rapier", "A long sword", "Any simple weapon"};
    private String secondEquipmentChoice[] = {"A diplomat's pack", "A entertainer's pack"};
    private String thirdEquipmentChoice[] = {"A lute", "Any other musical instrument"};
    private String guaranteedEquipment[] = {"Leather armor", "A dagger"};

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

    @Override
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
