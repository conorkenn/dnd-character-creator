package dnd.races;

import java.util.ArrayList;
import java.util.List;

public interface Race {


    public String getRace();

    public int getStrength();

    public int getDexterity();

    public int getConstitution();

    public int getIntelligence();

    public int getWisdom();

    public int getCharisma();

    public ArrayList<Integer> getStats();
    public void setStats();

    public int getSpeed();

    public String[] getRacialBonus();

    public String[] getLanguages();

    public String getSize();

    public List<String> getAllAttributes();

}
