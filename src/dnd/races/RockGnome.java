package dnd.races;

public class RockGnome extends Gnome {

    private String[] racialBonus = {"Artificer's Lore", "Tinker"};


    public RockGnome(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 constitution from racial stat bonus
        super(name, strength, dexterity, constitution + 1 , intelligence, wisdom, charisma);
    }

    @Override
    public String getRace(){
        return "Rock Gnome";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
