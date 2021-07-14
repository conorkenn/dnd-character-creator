package dnd.background;

import java.util.ArrayList;
import java.util.Arrays;

public class Criminal implements Background{
    private String backgroundName = "Criminal";
    private String skillProficiencies[] = {"Deception", "Stealth"};
    private String toolProficiencies[] = {"One type of a gaming set", "Thieves' tools"};
    private String equipment[] = {"A crowbar", "A set of dark common clothes including a hood", "A pouch containing 15gp"};
    private String specialties[] = {"Blackmailer", "Burglar", "Enforcer", "Fence", "Highway robber", "Hired killer", "Pickpocket", "Smuggler"};
    private String personalityTraits[] = {"I always have a plan for what to do when things go wrong",
                                          "I am always calm, no matter what the situation. I never raise my voice or let my emotions control me",
                                          "The first thing I do in a new place is note the locations of everything valuable - or where such things could be hidden",
                                          "I would rather make a new friend than a new enemy",
                                          "I am incredibly slow to trust. Those who seem the fairest often have the most to hide",
                                          "I don't pay attention to the risks of a situation. Never tell me the odds",
                                          "The best way to get me to do something is to tell me I can't do it",
                                          "I blow up at the slightest insult" };
    private String ideals[] = {"Honor, I don't steal from other in the trade. (Lawful)",
                               "Freedom, Chains are meant to be broken, as are those who would forge them. (Chaotic)",
                               "Charity, I steal from the wealthy so that I can help people in need. (Good)",
                               "Greed, I will do whatever it takes to become wealthy. (Evil)",
                               "People, I'm loyal to my friends, not any ideals, and everyone else can take a trip down the Sytx for all I care. (Neutral)",
                               "Redemption, There's a spark of good in everyone. (Good)" };
    private String bonds[] = {"I'm trying to pay off an old debt I owe to a generous benefactor",
                              "My ill-gotten gains go to support my family",
                              "Something important was taken from me, and I am to steal it back",
                              "I will become the greatest thief that ever lived",
                              "I'm guilty of a terrible crime. I hope I can redeem myself for it",
                              "Someone I loved died because of a mistake I made. That will never happen again"};
    private String flaws[] = {"When I see something valuable, I can't think about anything but how to steal it",
                              "When faced with a choice between money and my friends, I usually choose the money",
                              "If there's a plan, I'll forget it. If I don't forget, I'll ignore it",
                              "I have a \"tell\" that reveals when im lying",
                              "I turn tail and run when things look bad",
                              "An innocent person is in prison for a crime that I committed. I am okay with that"  };

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

    public String[] getSpecialties(){
        return specialties;
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
        f.add(Arrays.toString(getSpecialties()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
