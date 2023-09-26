package week05;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
    Seat[][] seats = new Seat[5][];

    Cinema() {
        seats[0] = new Seat[5];
        seats[1] = new Seat[7];
        seats[2] = new Seat[9];
        seats[3] = new Seat[3];
        seats[4] = new Seat[6];

        int counter = 0;


        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                Random rand = new Random();

                boolean reservedSeats = rand.nextBoolean();
                String seatID = String.format("%03d", counter++);
                seats[i][j] = new Seat(seatID, "Premium", "Red", 1900, reservedSeats);
            }
        }
    }

//    public void displaySeats() {
//
//        for (Seat[] temp : seats) {
//            for (Seat j : temp) {
//                System.out.println(j);
//            }
//        }
//    }

    public int countAvailableSeats() {

        int seatCounter = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j].reserved) {
                    seatCounter++;
                    System.out.println( "Seat number "+seats[i][j].seatID +" Available");

                }

            }

        }
        return seatCounter;
    }

    public int reservedSeats() {


         int reservedSeatCounter = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].reserved)
                {
                    reservedSeatCounter++;
                    System.out.println( "Seat number "+seats[i][j].seatID +" reserved");
                }

            }

        }
        return reservedSeatCounter;


    }

    public double totalBill(String category,int noOfseats){
        double total=0;

        if (category.equals("premium"))
        {
            System.out.println("ticket price is 1900RS");
            total= noOfseats * 1900;
        }
        if (category.equals("standard"))
        {
            System.out.println("ticket price is 1000RS");
            total= noOfseats * 1000;
        }
          return total;
    }

    public void bookMySeats(int noOftickets){

        Scanner sc= new Scanner(System.in);

            for (int k=0;k<noOftickets;k++) {
                System.out.println("Enter the Seat number ");
                String seatNo= sc.nextLine();
                boolean seatFound = false;

                for (int i = 0; i < seats.length; i++) {
                    for (int j = 0; j < seats[i].length; j++) {
                        if (!seats[i][j].reserved && seatNo.equals(seats[i][j].seatID)) {
                            System.out.println("Seat number " + seats[i][j].seatID + " is booked.");
                            seats[i][j].reserved = true;
                            seatFound = true;
                            break;
                        }
                    }
                    if (seatFound) {
                        break; // Exit the outer loop if the seat is found and booked
                    }

                }

                if (!seatFound) {
                    System.out.println("Seat number " + seatNo + " not found or already reserved. Please choose another seat.");
                }
            }

        }


    }








