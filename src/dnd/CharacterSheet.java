package dnd;

import dnd.background.Background;
import dnd.classes.BaseClass;
import dnd.factories.BackgroundFactory;
import dnd.factories.ClassFactory;
import dnd.races.BaseRace;
import dnd.factories.RaceFactory;

public class CharacterSheet {

    private String name;
    private BaseRace race;
    private BaseClass clazz;
    private Background background;

    public CharacterSheet(String name, String race, String clazz, String background) {
        RaceFactory rf = new RaceFactory();
        ClassFactory cf = new ClassFactory();
        BackgroundFactory bf = new BackgroundFactory();
        this.name = name;
        this.race = rf.getRace(race);
        this.clazz = cf.getClass(clazz);
        this.background = bf.getBackground(background);
    }

    public String getName() {
        return name;
    }

    public BaseRace getRace() {
        return race;
    }

    public BaseClass getClazz(){
        return clazz;
    }

    public Background getBackground(){
        return background;
    }

}
