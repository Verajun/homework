package com.train;

import java.util.Scanner;

public class Ticket {
    int ticket;
    int roundtrip;
    int price;
    Scanner scanner = new Scanner(System.in);
    public void print(){
        System.out.print("Please enter number of tickets:");
        ticket = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        roundtrip = scanner.nextInt();
        price = ticket*1000+roundtrip*1000-roundtrip*200;
        System.out.println("Total tickets:" + ticket + "\t" + "\t" + "Round-trip:" + roundtrip + "\t" +"Total:" + price);
    }

}