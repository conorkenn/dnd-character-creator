package dnd.races;

public class Stout extends Halfling{

    private String[] racialBonus = {"Stout Resilience"};

    public Stout( int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 constitution from racial stat bonus
        super( strength, dexterity, constitution, intelligence, wisdom, charisma);
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

