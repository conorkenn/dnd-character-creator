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
    private String personalityTraits[] = {};
    private String ideals[] = {};
    private String bonds[] = {};
    private String flaws[] = {};

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
        f.add(Arrays.toString(getPersonalityTraits()));
        f.add(Arrays.toString(getIdeals()));
        f.add(Arrays.toString(getBonds()));
        f.add(Arrays.toString(getFlaws()));
        return f;
    }
}
