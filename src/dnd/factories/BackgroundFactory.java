package dnd.factories;

import dnd.background.*;


public class BackgroundFactory {

    public Background getBackground(String background) {
        if(background == null){
            return null;
        }

        if(background.equalsIgnoreCase("Acolyte")){
            return new Acolyte();
        }
        else if(background.equalsIgnoreCase("Charlatan")){
            return new Charlatan();
        }
        else if(background.equalsIgnoreCase("Criminal")){
            return new Criminal();
        }
        else if(background.equalsIgnoreCase("Entertainer")){
            return new Entertainer();
        }
        else if(background.equalsIgnoreCase("Folk hero")){
            return new FolkHero();
        }
        else if(background.equalsIgnoreCase("Guild artisan")){
            return new GuildArtisan();
        }
        else if(background.equalsIgnoreCase("Hermit")){
            return new Hermit();
        }
        else if(background.equalsIgnoreCase("Noble")){
            return new Noble();
        }
        else if(background.equalsIgnoreCase("Outlander")){
            return new Outlander();
        }
        else if(background.equalsIgnoreCase("Sage")){
            return new Sage();
        }
        else if(background.equalsIgnoreCase("Sailor")){
            return new Sailor();
        }
        else if(background.equalsIgnoreCase("Soldier")){
            return new Soldier();
        }
        else if(background.equalsIgnoreCase("Urchin")){
            return new Urchin();
        }

        return null;
    }
}
