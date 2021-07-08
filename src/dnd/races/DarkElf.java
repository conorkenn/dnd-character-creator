package dnd.races;

public class DarkElf extends Elf{

    private String[] racialBonus = {"Superior Darkvision", "Sunlight Sensitivity", "Drow Magic", "Drow Weapon Training"};

    public DarkElf(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 charisma from racial stat bonus
        super( strength, dexterity, constitution, intelligence, wisdom, charisma + 1);
    }

    @Override
    public String getRace(){
        return "Dark Elf (Drow)";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
