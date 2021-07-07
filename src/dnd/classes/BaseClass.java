package dnd.classes;

import java.util.ArrayList;

public interface BaseClass {

    String getClassName();

    int getHitDie();

    String getHitDice();

    int getHitPoints(int constitution);

    String[] getSavingThrows();

    String[] getSkills();

    int getProficiencyBonus();

    String[] getFeatures();

    String[] getFirstEquipmentChoice();
    String[] getSecondEquipmentChoice();
    String[] getThirdEquipmentChoice();
    String[] getFourthEquipmentChoice();
    String[] getGuaranteedEquipment();

    ArrayList<String> getAllFeatures(int constitution);

}
