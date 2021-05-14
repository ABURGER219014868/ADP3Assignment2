package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
/**
 * CardDeckBuilderTest
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */
class CardDeckBuilderTest {
    private CardDeckBuilder cardDeckBuilder;
    private HashSet<String> cardDeck;
    private String card1 = "QueenOfHearts";
    private String card2 = "AceOfSpades";

    @BeforeEach
    void setUp(){
        this.cardDeckBuilder = CardDeckBuilder.getInstance();
        this.cardDeck = cardDeckBuilder.getCardDeck();
    }

    @Test
    public void testAddCard(){ //test for Add for SET
        boolean result = cardDeckBuilder.addCard(card1);
        assertTrue(result);
    }

    @Test
    public void testRemoveCard(){ //test for Remove for SET
        if(!cardDeck.contains(card1)){
            cardDeck.add(card1);
        }else {
            boolean result = cardDeckBuilder.removeCard(card1);
            assertTrue(result);
        }
    }

    @Test
    public void testFindCard(){ //test for Find for SET
        cardDeck.add(card2);
        boolean result = cardDeckBuilder.findCard(card2);
        assertTrue(result);
    }
}