package dnd.Background;

import java.util.ArrayList;
import java.util.Arrays;

public class FolkHero implements Background{
    private String backgroundName = "Folk Hero";
    private String skillProficiencies[] = {"Animal Handling", "Survival"};
    private String toolProficiencies[] = {"One type of artisan's tools", "Vehicles (land)"};
    private String equipment[] = {"A set of artisan's tools", "A shovel", "An iron pot", "A set of common clothes", "A pouch containing 10 gp"};
    private String definingEvents[] = {"I stood up to a tyrant's agents", "I saved people during a natural disaster",
                                       "I stood alone against a terrible monster", "I stole from a corrupt merchant to help the poor",
                                       "I lead a militia to fight off an invading army",
                                       "I broke into a tyrant's castle and stole weapon's to arm the people",
                                       "I trained the peasantry to use farm implements as weapons against a tyrant's soldiers",
                                       "A lord rescinded an unpopular decree after I led a symbolic act of protest against it"  ,
                                       "A celestial, fey, or similar creature gave me a blessing ot revealed my secret origin",
                                       "Recruited into a lord's army, I rose to leadership and was commended for my heroism" };
    private String personalityTraits[] = {"I judge people by their actions, not their words",
                                          "If someone is in trouble, I'm always ready to lend a hand",
                                          "When I set my mind to something, I follow through no matter what gets in my way",
                                          "I have a strong sense of fair play and always try to find the most equitable solution to arguments",
                                          "I'm confident in my own abilities and do what I can to install confidence in others",
                                          "Thinking is for other people. I prefer action",
                                          "I misuse long words in an attempt to sound smarter",
                                          "I get bored easily. When am I going to get on with my destiny" };
    private String ideals[] = {"Respect, People deserve to be treated with dignity and respect. (Good)",
                               "Fairness, No one should get preferential treatment before the law, and no one  is above the law. (Lawful)",
                               "Freedom, Tyrants must not be allowed to oppress the people. (Chaotic)",
                               "Might, If I become strong. I can take what I want - what I deserve. (Evil)",
                               "Sincerity, There's no good in pretending to be something I am not. (Neutral)",
                               "Destiny, Nothing and no one can steer me away from my higher calling. (Any)" };

    private String bonds[] = {"I have a family, but I have no idea where they are. One day, I hope to see them again.",
                              "I worked the land, I love the land, and I will protect the land.",
                              "A proud noble once gave me a horrible beating, and I will take my revenge on any bully I encounter.",
                              "My tools are symbols of my past life, and I carry them so that I will never forget my roots.",
                              "I protect those who cannot protect themselves.",
                              "I wish my childhood sweetheart had come with me to pursue my destiny." };
    private String flaws[] = {"The tyrant who rules my land will stop at nothing to see me killed.",
                              "I'm convinced of the significance of my destiny, and blind to my shortcomings and the rick of failure.",
                              "The people who knew me when I was young know my shameful secret, so I can never go home again.",
                              "I have a weakness for the vices of the city, especially hard drink.",
                              "Secretly, I believe that things would be better if I were a tyrant lording over the land.",
                              "I have trouble trusting in my allies."  };


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

    public String[] getDefiningEvents(){
        return definingEvents;
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
        f.add(Arrays.toString(getToolProficiencies()));
        f.add(Arrays.toString(getEquipment()));
        f.add(Arrays.toString(getDefiningEvents()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
