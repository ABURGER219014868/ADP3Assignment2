package za.ac.cput;

import java.util.HashSet;

/**
 * CardDeckBuilder shows examples of the Set Collection interface usage
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */

public class CardDeckBuilder {
    //a card deck has 52 unique cards. This deck builder uses a SET collection to ensure
    // we don't add duplicates to our deck

    private static CardDeckBuilder cardDeckBuilder = null;//singleton design pattern for CardDeckBuilder class

    private static HashSet<String> cardDeck = new HashSet<>(52);

    private CardDeckBuilder(){ //singleton design pattern for CardDeckBuilder class

    }

    public static CardDeckBuilder getInstance(){//singleton design pattern for CardDeckBuilder class
        if(cardDeckBuilder == null){
            cardDeckBuilder = new CardDeckBuilder();
        }
        return  cardDeckBuilder;
    }

    public HashSet<String> getCardDeck(){
        return cardDeck;
    }

    public boolean addCard(String card){ //add method for SET
        return cardDeck.add(card);
    }

    public boolean removeCard(String card){ //remove method for SET
        return cardDeck.remove(card);
    }

    public boolean findCard(String card){ //find method for SET
        return cardDeck.contains(card);
    }

}
