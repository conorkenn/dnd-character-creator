package dnd.Background;

public class Acolyte implements Background{

    private String backgroundName = "Acolyte";
    private String skillProficiencies[] = {"Insight", "Religion"};
    private String equipment[] = {"A holy symbol", "Prayer book or wheel", "5 Sticks of incenses", "vestments", "A pouch containing 15 gp"};

    //todo fill this out

    @Override
    public String getBackgroundName() {
        return backgroundName;
    }

    @Override
    public String[] getSkillProficiencies() {
        return skillProficiencies;
    }

    @Override
    public String[] getEquipment() {
        return equipment;
    }

    @Override
    public String[] getFeatures() {
        return new String[0];
    }

    @Override
    public String[] getPersonalityTraits() {
        return new String[0];
    }

    @Override
    public String[] getIdeals() {
        return new String[0];
    }

    @Override
    public String[] getBonds() {
        return new String[0];
    }

    @Override
    public String[] getFlaws() {
        return new String[0];
    }
}
