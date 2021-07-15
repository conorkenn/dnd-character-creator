package dnd.factories;

import dnd.races.*;

public class RaceFactory {

    public BaseRace getRace(String race){
        if(race == null){
            return null;
        }

        if(race.equalsIgnoreCase("DarkElf")){
            return new DarkElf(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Dragonborn")){
            return new Dragonborn(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Dwarf")){
            return new Dwarf(1,1,1,1,1,1);
        }
        else if(race.equalsIgnoreCase("Elf")){
            return new Elf(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("ForestGnome")){
            return new ForestGnome(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Gnome")){
            return new Gnome(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("HalfElf")){
            return new HalfElf(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Halfling")){
            return new Halfling(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Halflorc")){
            return new HalfOrc(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Hilldwarf")){
            return new HillDwarf(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Human")){
            return new Human(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Lightfoot")){
            return new LightFoot(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Mountaindwarf")){
            return new MountainDwarf(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Rockgnome")){
            return new RockGnome(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Tiefling")){
            return new Tiefling(1,1,1,1,1,1);
        }
        else if (race.equalsIgnoreCase("Woodelf")){
            return new WoodElf(1,1,1,1,1,1);
        }


        return null;
    }
}
