package dnd.races;

public class WoodElf extends Elf{
    private String[] racialBonus = {"Elf Weapon Training", "Fleet of Foot", "Mask of the Wild"};

    public WoodElf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 wisdom from racial stat bonus
        super(name, strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
    }

    @Override
    public String getRace(){
        return "Wood Elf";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
