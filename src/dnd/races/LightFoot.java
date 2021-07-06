package dnd.races;

public class LightFoot extends Halfling{
    private String[] racialBonus = {"Naturally Stealthy"};

    public LightFoot(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 charisma from racial stat bonus
        super(name, strength, dexterity, constitution, intelligence, wisdom, charisma + 1);
    }

    @Override
    public String getRace(){
        return "Lightfoot";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
