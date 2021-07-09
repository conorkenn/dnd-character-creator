package dnd.races;

public class HillDwarf extends Dwarf{

    private final String[] racialBonus = new String[]{"Dwarven Toughness"};

    public HillDwarf( int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 to wisdom from racial stat bonus
        super( strength, dexterity, constitution, intelligence, wisdom + 1, charisma);
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
