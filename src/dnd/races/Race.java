package dnd.races;

import java.util.List;

public interface Race {


    public String getRace();

    public int getStrength();
    public void increaseStrength(int roll);

    public int getDexterity();
    public void increaseDexterity(int roll);

    public int getConstitution();
    public void increaseConstitution(int roll);

    public int getIntelligence();
    public void increaseIntelligence(int roll);

    public int getWisdom();
    public void increaseWisdom(int roll);

    public int getCharisma();
    public void increaseCharisma(int roll);

    public void getStats();

    public int getSpeed();

    public String[] getRacialBonus();

    public String[] getLanguages();

    public String getSize();

    public List<String> getAllAttributes();

}
