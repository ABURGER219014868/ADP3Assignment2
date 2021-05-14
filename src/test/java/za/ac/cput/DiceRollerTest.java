package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
/**
 * DiceRollerTest
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */
class DiceRollerTest {
    private DiceRoller diceRoller;
    private Collection<Integer> diceRollHistory;

    private int roll1;
    private int roll2;

    @BeforeEach
    void setUp(){
        this.diceRoller = DiceRoller.getInstance();
        this.diceRollHistory = diceRoller.getDiceRollHistory();
        roll1 = diceRoller.d6Roll();
        roll2 = diceRoller.d6Roll();
    }

    //rolls d6 10 times to check if it produces the right range of random nums
    //commented out to show tests pass:3
//    @Test @Disabled
//    public void testD6Roll(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Roll test nr"+ i+ " =>" +diceRoller.d6Roll());
//        }
//    }

    @Test
    public void testAddDiceRoll(){ //test for Add for LIST
        boolean result = diceRoller.addDiceRoll(roll1);
        assertTrue(result);
    }

    @Test
    public void testRemoveDiceRoll(){ //test for Remove for LIST
        boolean resultAdd = diceRoller.addDiceRoll(roll1);
        assertTrue(resultAdd);
        boolean resultRemove = diceRoller.removeDiceRoll(roll1);
        assertTrue(resultRemove);
    }

    @Test
    public void testFindDiceRoll(){
        boolean resultAdd = diceRoller.addDiceRoll(roll2);
        assertTrue(resultAdd);
        boolean resultFind = diceRoller.findDiceRoll(roll2);
        assertTrue(resultFind);
    }

}