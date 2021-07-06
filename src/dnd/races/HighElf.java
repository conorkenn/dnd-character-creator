package dnd.races;

public class HighElf extends Elf{

    private String[] racialBonus = {"Elf Weapon Training"};

    public HighElf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 intelligence from racial stat bonus
        super(name, strength, dexterity, constitution, intelligence + 1, wisdom, charisma);
    }

    @Override
    public String getRace(){
        return "High Elf";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
