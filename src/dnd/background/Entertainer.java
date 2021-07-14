package dnd.background;

import java.util.ArrayList;
import java.util.Arrays;

public class Entertainer implements Background{
    private String backgroundName = "Entertainer";
    private String skillProficiencies[] = {"Acrobatics, Performance"};
    private String toolProficiencies[] = {"Disguise kit" , "One type of musical instrument"};
    private String equipment[] = {"A musical instrument (of your choice)", "A favor of an admirer", "A costume", "A pouch containing 15 gp"};
    private String routines[] = {"Actor", "Dancer", "Fire-eater", "Jester", "Juggler", "Instrumentalist", "Poet", "Singer", "Storyteller", "Tumbler"};
    private String personalityTraits[] = {"I know a story relevant to almost every situation",
                                          "Whenever I come to a new place, I collect local rumors and spread gossip",
                                          "I'm a hopeless romantic, always searching for that \"special\" someone",
                                          "Nobody stays angry at me or around me for long, since I can defuse any amount of tension",
                                          "I love a good insult, even one directed at me",
                                          "I get bitter if I'm not the center of attention",
                                          "I'll settle for nothing less than perfection",
                                          "I change my mood or my mind as quickly as I chance key in a song" };
    private String ideals[] = {"Beauty, When I preform, I make the world better than it was. (Good)",
                               "Tradition, The stories, legends, and songs of the past must never be forgotten, for they teach us who we are. (Lawful)",
                               "Creativity, The world is in need of a new ideas and hold action. (Chaotic)",
                               "Greed, I'm only in it for the money and fame. (Evil)",
                               "People, I like to see the smiles on people's faces when I preform. That's all that matters. (Neutral)",
                               "Honesty, Art should reflect the soul; it should come from within and reveal who we really are. (Any)" };
    private String bonds[] = {"My instrument is my most treasured possession, and it reminds me of someone I love",
                              "Someone stole my precious instrument, and someday I'll get it back",
                              "I want to be famous, whatever it takes",
                              "I idolize a heroic of the old tales and measure my deeds against that person's",
                              "I will do anything to prove myself superior to my hated rival",
                              "I would do anything for the other members of my old troupe"  };
    private String flaws[] = {"I'll do anything to win fame and renown",
                              "I'm a sucker for a pretty face",
                              "A scandal prevents me from ever going home again. That kind of trouble seems to follow me around",
                              "I once satirized a noble who still wants my head. It was a mistake that I will likely regret",
                              "I have trouble keeping my true feelings hidden. My sharp tongue lands me in trouble",
                              "Despite my best efforts, I am unreliable to my friends"};

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

    public String[] getRoutines(){
        return routines;
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
        f.add(Arrays.toString(getRoutines()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
