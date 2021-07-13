package dnd.Background;

import java.util.ArrayList;
import java.util.Arrays;

public class Hermit implements Background{
    private String backgroundName = "Hermit";
    private String skillProficiencies[] = {"Medicine", "Religion"};
    private String equipment[] = {"A scroll case stuffed full of notes from your studies or prayers", "a winter blanket", "a set of common clothes", "an herbalism kit",  "5 gp"};
    private String personalityTraits[] = {"I've been isolated for so long that I rarely speak, preferring gestures and the occasional grunt.",
                                          "I am utterly serene, even in the face of disaster.",
                                          "The leader of my community had something wise to say on every topic, and I am eager to share that wisdom.",
                                          "I feel tremendous empathy for all who suffer.",
                                          "I'm oblivious to etiquette and social expectations.",
                                          "I connect everything that happens to me to a grand, cosmic plan.",
                                          "I often get lost in my own thoughts and contemplation, becoming oblivious to my surroundings.",
                                          "I am working on a grand philosophical theory and love sharing my ideas."};

    private String lives[] = {"I was searching for spiritual enlightenment.",
                              "I was partaking of communal living in accordance with the dictates of a religious order.",
                              "I was exiled for a crime I didn't commit.",
                              "I retreated from society after a life-altering event.",
                              "I needed a quiet place to work on my art, literature, music, or manifesto.",
                              "I needed to commune with nature, far from civilization.",
                              "I was the caretaker of an ancient ruin or relic.",
                              "I was a pilgrim in search of a person, place, or relic of spiritual significance."};

    private String ideals[] = {"Greater Good, My gifts are meant to be shared with all, not used for my own benefit. (Good)",
                               "Logic, Emotions must not cloud our sense of what is right and true, or our logical thinking. (Lawful)",
                               "Free Thinking, Inquiry and curiosity are the pillars of progress. (Chaotic)",
                               "Power, Solitude and contemplation are paths toward mystical or magical power. (Evil)",
                               "Live and Let Live, Meddling in the affairs of others only causes trouble. (Neutral)",
                               "Self-Knowledge, If you know yourself, there's nothing left to know. (Any)"};

    private String bonds[] = {"Nothing is more important than the other members of my hermitage, order, or association.",
                              "I entered seclusion to hide from the ones who might still be hunting me. I must someday confront them.",
                              "I'm still seeking the enlightenment I pursued in my seclusion, and it still eludes me.",
                              "I entered seclusion because I loved someone I could not have.",
                              "Should my discovery come to light, it could bring ruin to the world.",
                              "My isolation gave me great insight into a great evil that only I can destroy."};

    private String flaws[] = {"Now that I've returned to the world, I enjoy its delights a little too much.",
            "I harbor dark, bloodthirsty thoughts that my isolation and meditation failed to quell.",
            "I am dogmatic in my thoughts and philosophy.",
            "I let my need to win arguments overshadow friendships and harmony.",
            "I'd risk too much to uncover a lost bit of knowledge.",
            "I like keeping secrets and won't share them with anyone."};

    //todo add 1 language

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
        return new String[0];
    }

    @Override
    public String[] getEquipment() {
        return equipment;
    }

    private String[] getLives(){
        return lives;
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
        f.add(Arrays.toString(getLives()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
