package za.ac.cput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;

/**
 * DiceRoller shows examples of the List Collection interface usage
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */
public class DiceRoller {

    //A List collection can contain duplicates. I will make a program that simulates rolling a 6 sided die and
    //the diceRollHistory List will keep record of these dice rolls

    private static DiceRoller diceRoller = null;//singleton design pattern for CardDeckBuilder class
    private static Collection<Integer> diceRollHistory = new ArrayList<>();

    private DiceRoller(){ //singleton design pattern for CardDeckBuilder class

    }

    public static DiceRoller getInstance(){//singleton design pattern for CardDeckBuilder class
        if(diceRoller == null){
            diceRoller = new DiceRoller();
        }
        return  diceRoller;
    }

    public Collection<Integer> getDiceRollHistory(){
        return diceRollHistory;
    }

    public int d6Roll(){  //create random num between 1 and 7 (exclusive)
        return ThreadLocalRandom.current().nextInt(1, 7);
    }

    public boolean addDiceRoll(int roll){//add method for LIST
        return diceRollHistory.add(roll);
    }

    public boolean removeDiceRoll(int roll){ //remove method for LIST
        return diceRollHistory.remove(roll);
    }

    public boolean findDiceRoll(int roll){//find method for LIST
        return diceRollHistory.contains(roll);
    }

}
