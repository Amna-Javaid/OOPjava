
package week04;

import java.util.Random;

public class Deck {
    Card cards[]=new Card[52];
    String ranks[]=
            {"Ace","2","3","4","5","6","7","8","9","10","Joker","King","Queen" };
    String suits []={ "Club","Hearts","Daimond","Spades"};

    public Deck(){
        int counter =0;
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<13;j++)
            {
                cards [counter++]= new Card(suits[i],ranks[j]);
            }
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 52; i++)
        {
            str.append(cards[i] + "\n");

        }
        return str.toString();
    }
    public void shuffle(){
        Random random = new Random();
        for (int i=0;i<52;i++){

            int j= random.nextInt(i,52);
            Card temp = cards[i];
            cards[i]= cards[j];
            cards[j]= temp;
        }

    }

}
