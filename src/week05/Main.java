package week05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Cinema cinema =new Cinema();


//        System.out.println(cinema.seats);   //2d array address will print so [[  //
//        System.out.println(cinema.seats[0]);  //1d array address will print so [ //
//        System.out.println();
//        System.out.println(cinema.seats[0][0]);

//       cinema.displaySeats();

        System.out.println("Total seats available:"+cinema.countAvailableSeats());
        System.out.println("Total seats Reserved:"+cinema.reservedSeats());
        Scanner sc= new Scanner(System.in);


        System.out.println("Which category you want to book?");
        String typeofSeat=sc.nextLine();

        System.out.println("How many tickets you want to order?");
        int noOfSeats = sc.nextInt();
        sc.nextLine();



        cinema.bookMySeats(noOfSeats);

        double totalAmount = cinema.totalBill(typeofSeat,noOfSeats);
        System.out.println( "Your total is :" + totalAmount);

//        Utilityclass.displaySeats(cinema.seats);
    }
}
