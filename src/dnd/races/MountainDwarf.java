package dnd.races;

public class MountainDwarf extends Dwarf{

    private String[] racialBonus = {"Dwarven Armor Training"};


    public MountainDwarf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+2 to strength from racial stat bonus
        super(name, strength + 2, dexterity, constitution, intelligence, wisdom, charisma);
    }

    @Override
    public String getRace(){
        return "Mountain Dwarf";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
