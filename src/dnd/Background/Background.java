package dnd.Background;

import java.util.ArrayList;

public interface Background {
    //TODO add languages
    String getBackgroundName();
    String[] getSkillProficiencies();
    String[] getToolProficiencies();
    String[] getEquipment();
    ArrayList<String> getAllFeatures();
    String[] getPersonalityTraits();
    String[] getIdeals();
    String[] getBonds();
    String[] getFlaws();

}
