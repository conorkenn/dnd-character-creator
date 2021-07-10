package dnd.Background;

public class Acolyte implements Background{

    private String backgroundName = "Acolyte";

    //todo fill this out

    @Override
    public String getBackgroundName() {
        return backgroundName;
    }

    @Override
    public String[] getSkillProficiencies() {
        return new String[0];
    }

    @Override
    public String[] getEquipment() {
        return new String[0];
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
