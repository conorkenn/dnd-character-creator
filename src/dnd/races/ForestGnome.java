package dnd.races;

public class ForestGnome extends Gnome{
    private String[] racialBonus = {"Natural Illusionist", "Speaking with Small Beasts"};


    public ForestGnome( int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        //+1 dexterity from racial stat bonus
        super( strength, dexterity + 1, constitution, intelligence, wisdom, charisma);
    }

    @Override
    public String getRace(){
        return "Forest Gnome";
    }

    @Override
    public String[] getSubRacialBonus(){
        return racialBonus;
    }
}
