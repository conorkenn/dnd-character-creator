package dnd.dice;
import java.util.Random;
public class GameDice {

    public GameDice() {
    }

    public int d4(){
        return generateRoll(4);
    }

    public int d6(){
        return generateRoll(6);
    }

    public int d8(){
        return generateRoll(8);
    }

    public int d10(){
        return generateRoll(10);
    }

    public int d12(){
        return generateRoll(12);
    }

    public int d20(){
        return generateRoll(20);
    }

    public int d100(){
        return generateRoll(100);
    }

    private int generateRoll(int d){
        Random rand = new Random();
        return rand.nextInt(d) + 1;
    }
}
