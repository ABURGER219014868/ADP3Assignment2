package za.ac.cput;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * TicketSeller shows examples of the Queue Collection interface usage
 * Student nr: 219014868
 * Student name: A Burger
 * Date: Friday - 14 May 2021
 */
public class TicketSeller{
    //Collection is the Parent class and used in general cases in this case I will show how collections of
    //elements work by using the Queue implementing class
    //To show how Queue works I will make a Music Show Ticket Seller app -because it is first come first serve basis
    BlockingQueue<String> listOfTicketsSold = new LinkedBlockingDeque<>(10);

    private static TicketSeller ticketSeller = null;

    private TicketSeller(){

    }

    public static TicketSeller getInstance() {
        if (ticketSeller == null){
            ticketSeller = new TicketSeller();
        }
        return ticketSeller;
    }
    //add use Offer because it should check if there is a ticket available first
    public boolean buyTicket(String ticket) { //the add method for COLLECTION
        return listOfTicketsSold.offer(ticket);
    }
    //limit is 10 but only 9 was sold so you are in time

    //remove - when someone cancels their place/ticket for the show
    public boolean removeTicket(String ticket){ //remove method for COLLECTION
        return listOfTicketsSold.remove(ticket);
    }

    //find
    public String peekTicket(){ //find method for COLLECTION
        return listOfTicketsSold.peek();
    }

 }








