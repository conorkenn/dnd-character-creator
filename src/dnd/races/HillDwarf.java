package dnd.races;

public class HillDwarf extends Dwarf{

    private String[] racialBonus = {"Dwarven Toughness"};

    public HillDwarf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 to wisdom from racial stat bonus
        super(name, strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
    }

    @Override
    public String getRace(){
        return "Hill Dwarf";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
