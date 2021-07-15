package dnd.factories;

import dnd.classes.*;


public class ClassFactory {

    public BaseClass getClass(String clazz) {
        if (clazz == null) {
            return null;
        }

        if (clazz.equalsIgnoreCase("Barbarian")) {
            return new Barbarian();
        }
        else if(clazz.equalsIgnoreCase("Bard")){
            return new Bard();
        }
        else if(clazz.equalsIgnoreCase("Cleric")){
            return new Cleric();
        }
        else if(clazz.equalsIgnoreCase("Druid")){
            return new Druid();
        }
        else if(clazz.equalsIgnoreCase("Fighter")){
            return new Fighter();
        }
        else if(clazz.equalsIgnoreCase("Monk")){
            return new Monk();
        }
        else if(clazz.equalsIgnoreCase("Paladin")){
            return new Paladin();
        }
        else if(clazz.equalsIgnoreCase("Ranger")){
            return new Ranger();
        }
        else if(clazz.equalsIgnoreCase("Rogue")){
            return new Rogue();
        }
        else if(clazz.equalsIgnoreCase("Sorcerer")){
            return new Sorcerer();
        }
        else if(clazz.equalsIgnoreCase("Warlock")){
            return new Warlock();
        }
        else if(clazz.equalsIgnoreCase("Wizard")){
            return new Wizard();
        }


        return null;
    }
}
