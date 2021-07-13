package dnd.Background;

import java.util.ArrayList;
import java.util.Arrays;

public class GuildArtisan implements Background{
    private String backgroundName = "Guild Artisan";
    private String skillProficiencies[] = {"Insight", " Persuasion"};
    private String toolProficiencies[] = {"One type of artisan's tools"};
    private String equipment[] = {"A set of artisan's tools", "A letter of introduction from your guild", "A set of traveler's clothes", "A Pouch containing 15 gp" };
    private String guildBusinesses[] = {"Alchemist and apothecaries", "Armorers, locksmiths, and finesmiths", "Brewers, distillers, and vintners",
                                        "Calligraphers, scribes, and scriveners", "Carpenters, roofers, and plasterers", "Cartographers, surveyors, and chart-makers",
                                        "Cobblers and shoemakers", "Cooks and bakers", "Glassblowers and glaziers", "Jewelers and gemcutters",
                                        "Leatherworkers, skinners, and tanners", "Masons and stonecutters", "Painters, limners, and sign-makers",
                                        "Potters and tile-makers", "Shipwrights and sailmakers", "Smiths and metal-forgers", "Tinkerers, pewterers, and casters",
                                        "Wagon-makers abd wheelwrights", "Weavers and dyers", "Woodcarvers, coopersm and bowyers"};

    private String personalityTraits[] = {"I believe that anything worth doing is worth doing right. I can't help it – I'm a perfectionist",
                                          "I'm a snob who looks down on those who can't appreciate fine art",
                                          "I always want to know how things work and what makes people tick",
                                          "I'm full of witty aphorisms and have a proverb for every occasion",
                                          "I'm rude to people who lack my commitment to hard work and fair play",
                                          "I like to talk at length about my profession",
                                          "I don't part with my money easily and will haggle tirelessly to get the best deal possible",
                                          "I'm well known for my work, and I want to make sure everyone appreciates it. I'm always taken aback when people haven't heard of me."  };

    private String ideals[] = {"Community, It is the duty of all civilized people to strengthen the bonds of community and the security of civilization. (Lawful)",
                               "Generosity, My talents were given to me so that I could use them to benefit the world. (Good)",
                               "Freedom, Everyone should be free to pursue his or her own livelihood. (Chaotic)",
                               "Greed, I'm only in it for the money. (Evil)",
                               "People, I'm committed to the people I care about, not to ideals. (Neutral)",
                               "Aspiration, I work hard to be the best there is at my craft. (Any)"};

    private String bonds[] = {"The workshop where I learned my trade is the most important place in the world to me.",
                              "I created a great work for someone, and then found them unworthy to receive it. I'm still looking for someone worthy.",
                              "I owe my guild a great debt for forging me into the person I am today.",
                              "I pursue wealth to secure someone's love.",
                              "One day I will return to my guild and prove that I am the greatest artisan of them all.",
                              "I will get revenge on the evil forces that destroyed my place of business and ruined my livelihood."};
    private String flaws[] = {"I'll do anything to get my hands on something rare or priceless.",
                              "I'm quick to assume that someone is trying to cheat me.",
                              "No one must ever learn that I once stole money from guild coffers.",
                              "I'm never satisfied with what I have – I always want more.",
                              "I would kill to acquire a noble title.",
                              "I'm horribly jealous of anyone who can outshine my handiwork. Everywhere I go, I'm surrounded by rivals."};

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
        return toolProficiencies;
    }

    @Override
    public String[] getEquipment() {
        return equipment;
    }

    public String[] getGuildBusinesses(){
        return guildBusinesses;
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
        f.add(Arrays.toString(getGuildBusinesses()));
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
