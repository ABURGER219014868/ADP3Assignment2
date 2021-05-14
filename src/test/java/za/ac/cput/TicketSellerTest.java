package za.ac.cput;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;
/**
 * TicketSellerTest
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */
class TicketSellerTest {
    private TicketSeller ticketSeller;
    private String ticketNr1 = "RockShowCapeTownTicketNr:1";
    private String ticketNr2 = "RockShowCapeTownTicketNr:2";


    @BeforeEach
    void setUp(){
        this.ticketSeller = TicketSeller.getInstance();

    }

    @Test
    public void testBuyTicket(){ //testing the add functionality of Collection
        boolean result = ticketSeller.buyTicket(ticketNr1);
        assertTrue(result);
    }

    @Test
    public void testRemoveTicket(){ //test for Remove for Collection
        boolean resultAdd = ticketSeller.buyTicket(ticketNr1);
        assertTrue(resultAdd);
        boolean resultRemove = ticketSeller.removeTicket(ticketNr1);
        assertTrue(resultRemove);
    }

    @Test
    public void testFindTicket(){ //test for Find for Collection
        //add ticket to find
        ticketSeller.buyTicket(ticketNr2);
        assertNotEquals(null,ticketSeller.peekTicket());

    }

}