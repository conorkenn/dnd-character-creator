package dnd.races;

public class MountainDwarf extends Dwarf{

    private String[] racialBonus = {"Dwarven Armor Training"};


    public MountainDwarf( int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+2 to strength from racial stat bonus
        super(strength + 2, dexterity, constitution, intelligence, wisdom, charisma);
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
