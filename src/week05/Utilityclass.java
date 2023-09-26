package week05;

public class Utilityclass {

    public static void displaySeats(Seat seats[][]){
        for(int i=0;i<seats.length;i++)
            displaySeats(seats[i]);

    }

    public static void displaySeats(Seat seats[]){
        for(int j=0;j<seats.length;j++)
            System.out.println(seats[j]);
    }
}
