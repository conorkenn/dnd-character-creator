package dnd.background;

import java.util.ArrayList;
import java.util.Arrays;

public class Charlatan implements Background{

    private String backgroundName = "Charlatan";
    private String skillProficiencies[] = {"Deception", "Sleight of Hand"};
    private String toolProficiencies[] = {"Disguise kit", "forgery kit"};
    private String equipment[] = {"A set of fine clothes", "A disguise kit", " tools of the con", "pouch containing 15 gp"};
    private String personalityTraits[] = {"I fall in and out of love easily, and always perusing someone",
                                          "I have a joke for every occasion, especially occasions where humor is inappropriate",
                                          "Flattery is my preferred trick for getting what I want",
                                          "I'm a born gambler who can't resist taking a risk for a potential payoff",
                                          "I lie about almost everything, even when there's no good reason to",
                                          "Sarcasm and insults are my weapons of choice",
                                          "I keep multiple holy symbols on me and invoke whatever deity might come in useful as any given moment",
                                          "I pocket anything I see that might have some value"  };
    private String ideals[] = {"Independence, I am a free spirit - No one can tell me what to do. (Chaotic)",
                               "Fairness, I never target people who can't afford to lose a few coins. (Lawful)",
                               "Charity, I distribute the money I acquire to the people whole really need it. (Good)",
                               "Creativity, I never run the same con twice. (Chaotic)",
                               "Friendship, Material goods come and go. Bonds of friendship last forever. (Good)",
                               "Aspiration, I'm determined to make something of myself. (Any)"};
    private String bonds[] = {"I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about",
                              "I owe everything to my mentor - a horrible person who's probably rotting in jail somewhere",
                              "Somewhere out there, I have a child who doesn't know me. I'm making the world a better place for him or her",
                              "I come from a noble family, and one day I'll reclaim my lands and title from those who stole from me",
                              "A powerful person killed someone I loved. Some day soon, I'll have my revenge",
                              "I swindled and ruined a person who didn't deserve it. I seek to atone for my misdeeds but might never be able to forgive myself"};
    private String flaws[] = {"I can't resist a pretty face",
                              "I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in",
                              "I'm convinced that no one could ever fool me the way I fool other",
                              "I'm too greedy for my own good. I can't resist taking a risk if there's money involved",
                              "I can't resist swindling people who are more powerful than me",
                              "I hate to admit it and will gate myself for it, but I'll run and preserve my own hide if the going gets tough"};

    private String scams[] = {"I cheat at a game of chance", "I shave coins or forge documents",
                              "I insinuate myself into people's lives to prey on their weakness and secure their fortunes",
                              "I put on new identities like clothes", "I run sleight of hand cons on street corners",
                              "I convince people that worthless junk is worth their hard-earned money"};

    @Override
    public String getBackgroundName() {
        return backgroundName;
    }

    @Override
    public String[] getSkillProficiencies() {
        return skillProficiencies;
    }

    @Override
    public String[] getToolProficiencies() {
        return toolProficiencies;
    }

    @Override
    public String[] getEquipment() {
        return equipment;
    }

    @Override
    public String[] getPersonalityTraits() {
        return personalityTraits;
    }

    public String[] getScams(){
        return scams;
    }

    @Override
    public String[] getIdeals() {
        return ideals;
    }

    @Override
    public String[] getBonds() {
        return bonds;
    }

    @Override
    public String[] getFlaws() {
        return flaws;
    }

    @Override
    public ArrayList<String> getAllFeatures() {
        ArrayList<String> f = new ArrayList<String>();
        f.add(getBackgroundName());
        f.add(Arrays.toString(getSkillProficiencies()));
        f.add(Arrays.toString(getEquipment()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getScams()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
