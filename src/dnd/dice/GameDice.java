package dnd.dice;
import java.util.Random;
public class GameDice {

    public GameDice() {
    }

    public static int d4(){
        return generateRoll(4);
    }

    public static int d6(){
        return generateRoll(6);
    }

    public static int d8(){
        return generateRoll(8);
    }

    public static int d10(){
        return generateRoll(10);
    }

    public static int d12(){
        return generateRoll(12);
    }

    public static int d20(){
        return generateRoll(20);
    }

    public static int d100(){
        return generateRoll(100);
    }

    private static int generateRoll(int d){
        Random rand = new Random();
        return rand.nextInt(d) + 1;
    }


}
