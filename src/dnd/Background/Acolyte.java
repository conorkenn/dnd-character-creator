package dnd.Background;

import java.util.ArrayList;
import java.util.Arrays;

public class Acolyte implements Background{

    private String backgroundName = "Acolyte";
    private String skillProficiencies[] = {"Insight", "Religion"};
    private String equipment[] = {"A holy symbol", "Prayer book or wheel", "5 Sticks of incenses", "vestments", "A pouch containing 15 gp"};
    private String personalityTraits[] = {"I idolize a particular hero of my faith, and constantly refer to that person's deeds and example",
                                         "I can find common ground between the fiercest enemies, empathizing with them and always working towards peace",
                                         "I see omens in every event and cation. The gos try to speak to us, we just need to listen.",
                                         "Nothing can shake my optimistic attitude",
                                         "I quote (or misquote) sacred text and proverbs in almost every situation",
                                         "I am tolerant (of intolerant) of other faiths and respect (or condemn) the worship of other gods",
                                         "I'v enjoyed fine food, drink, and high society among my temple's elite. Rough living grates on me",
                                         "I've spent so long in the template that I have little practical experience dealing with people in the outside world"};
    private String ideals[] = {"Tradition, The ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)",
                               "Charity, I always try to help those in need, not matter what the personal cost. (Good)",
                               "Change, We must help bring about the changes the gods are constantly working in the world. (Chaotic)",
                               "Power, I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)",
                               "Faith, I trust that my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)",
                               "Aspiration, I seek to prove myself worthy of my god's favor by matching my actions against his of her teachings. (Any)"};
    private String bonds[] = {"I would die to recover an ancient relic of my faith that was lost long ago.",
                              "I will someday get revenge on the corrupt temple hierarchy who branded me a heretic",
                              "I owe my life to the priest who took me in when my parents died",
                              "Everything I do is for the favor of common people",
                              "I will do anything to protect the temple where I served",
                              "I seek to preserve a sacred text my enemies consider heretical and seek to destroy"};
    private String flaws[] = {"I judge others harshly, and myself even more severely",
                              "I put too much trust in those who wield power within my temple's hierarchy",
                              "My piety sometimes leads me to blindly trust those that profess faith in my god",
                              "I am inflexible in my thinking",
                              "I am suspicious of strangers and expect the worst of them",
                              "Once I pick a goal, I become obsessed with it to the detriment of everything else in my life"};

    //todo add 2 languages


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
        return null;
    }

    @Override
    public String[] getEquipment() {
        return equipment;
    }

    @Override
    public String[] getPersonalityTraits() {
        return personalityTraits;
    }

    //todo: should only return 1 ideal, bond, flaw based on roll.
    // Will implement later once I have all data entered
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
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
