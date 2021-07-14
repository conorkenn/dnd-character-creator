package dnd.background;

import java.util.ArrayList;
import java.util.Arrays;

public class Sage implements Background{
    private String backgroundName = "Sage";
    private String skillProficiencies[] = {"Arcana", "History"};
    private String equipment[] = {"A bottle of black ink", "a quill", "a small knife",
                                  "a letter from a dead colleague posing a question you have not yet been able to answer",
                                  "a set of common clothes", "a belt pouch containing 10 gp"};
    private String specialties[] = {"Alchemist", "Astronomer", "Discredited academic", "Librarian", "Professor",
                                    "Researcher", "Wizard's apprentice", "Scribe"};

    private String personalityTraits[] = {"I use polysyllabic words that convey the impression of great erudition.",
            "I've read every book in the world's greatest libraries – or I like to boast that I have.",
            "I'm used to helping out those who aren't as smart as I am, and I patiently explain anything and everything to others.",
            "There's nothing I like more than a good mystery.",
            "I'm willing to listen to every side of an argument before I make my own judgment.",
            "I… speak… slowly… when talking… to idiots,… which… almost… everyone… is… compared… to me.",
            "I am horribly, horribly awkward in social situations.",
            "I'm convinced that people are always trying to steal my secrets."};

    private String ideals[] = {	"Knowledge. The path to power and self-improvement is through knowledge. (Neutral)",
            "Beauty. What is beautiful points us beyond itself toward what is true. (Good)",
            "Logic. Emotions must not cloud our logical thinking. (Lawful)",
            "No Limits. Nothing should fetter the infinite possibility inherent in all existence. (Chaotic)",
            "Power. Knowledge is the path to power and domination. (Evil)",
            "Self-Improvement. The goal of a life of study is the betterment of oneself. (Any)"};

    private String bonds[] = {"It is my duty to protect my students.",
            "I have an ancient text that holds terrible secrets that must not fall into the wrong hands.",
            "I work to preserve a library, university, scriptorium, or monastery.",
            "My life's work is a series of tomes related to a specific field of lore.",
            "I've been searching my whole life for the answer to a certain question.",
            "I sold my soul for knowledge. I hope to do great deeds and win it back."};

    private String flaws[] = {"I am easily distracted by the promise of information.",
            "Most people scream and run when they see a demon. I stop and take notes on its anatomy.",
            "Unlocking an ancient mystery is worth the price of a civilization.",
            "I overlook obvious solutions in favor of complicated ones.",
            "I speak without really thinking through my words, invariably insulting others.",
            "I can't keep a secret to save my life, or anyone else's."};

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
        f.add(Arrays.toString(getEquipment()));
        f.add(Arrays.toString(getSpecialties()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
