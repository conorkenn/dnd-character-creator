package dnd.background;

import java.util.ArrayList;
import java.util.Arrays;

public class Noble implements Background{
    private String backgroundName = "Noble";
    private String skillProficiencies[] = { "History", "Persuasion"};
    private String toolProficiencies[] = {"One type of gaming set"};
    private String equipment[] = {"A set of fine clothes", "a signet ring", "a scroll of pedigree", "a purse containing 25 gp"};
    private String personalityTraits[] = {"My eloquent flattery makes everyone I talk to feel like the most wonderful and important person in the world.",
                                          "The common folk love me for my kindness and generosity.",
                                          "No one could doubt by looking at my regal bearing that I am a cut above the unwashed masses.",
                                          "I take great pains to always look my best and follow the latest fashions.",
                                          "I don't like to get my hands dirty, and I won't be caught dead in unsuitable accommodations.",
                                          "Despite my noble birth, I do not place myself above other folk. We all have the same blood.",
                                          "My favor, once lost, is lost forever.",
                                          "If you do me an injury, I will crush you, ruin your name, and salt your fields."};

    private String ideals[] = {"Respect. Respect is due to me because of my position, but all people regardless of station deserve to be treated with dignity. (Good)",
                               "Responsibility. It is my duty to respect the authority of those above me, just as those below me must respect mine. (Lawful)",
                               "Independence. I must prove that I can handle myself without the coddling of my family. (Chaotic)",
                               "Power. If I can attain more power, no one will tell me what to do. (Evil)",
                               "Family. Blood runs thicker than water. (Any)",
                               "Noble Obligation. It is my duty to protect and care for the people beneath me. (Good)"};

    private String bonds[] = {"I will face any challenge to win the approval of my family.",
                              "My house's alliance with another noble family must be sustained at all costs.",
                              "Nothing is more important than the other members of my family.",
                              "I am in love with the heir of a family that my family despises.",
                              "My loyalty to my sovereign is unwavering.",
                              "The common folk must see me as a hero of the people."};

    private String flaws[] = {"I secretly believe that everyone is beneath me.",
                              "I hide a truly scandalous secret that could ruin my family forever.",
                              "I too often hear veiled insults and threats in every word addressed to me, and I'm quick to anger.",
                              "I have an insatiable desire for carnal pleasures.",
                              "In fact, the world does revolve around me.",
                              "By my words and actions, I often bring shame to my family."};

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
