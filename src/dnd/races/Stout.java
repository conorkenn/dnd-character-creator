package dnd.races;

public class Stout extends Halfling{

    private String[] racialBonus = {"Stout Resilience"};

    public Stout(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 constitution from racial stat bonus
        super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    @Override
    public String getRace(){
        return "Stout";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}

