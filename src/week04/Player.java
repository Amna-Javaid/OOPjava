
package week04;

public class Player {
    Card player1[] = new Card[13];
    Card player2[] = new Card[13];
    Card player3[] = new Card[13];
    Card player4[] = new Card[13];



    public void distribute(Deck d) {
        for (int i = 0; i < 52; i++) {
            int playerNumber = i % 4; // Determine which player should receive the card (0 to 3)
            Card card = d.cards[i];

            switch (playerNumber) {
                case 0:
                    player1[i / 4] = card; // i/4 represents the index within the player's hand
                    break;
                case 1:
                    player2[i / 4] = card;
                    break;
                case 2:
                    player3[i / 4] = card;
                    break;
                case 3:
                    player4[i / 4] = card;
                    break;
            }
        }

    }
    public void printPlayersCards() {


        System.out.println("Player 1's Cards:");

        for (int i = 0; i < player1.length; i++) {
            System.out.println(player1[i]);
        }
        System.out.println();

        System.out.println("Player 2's Cards:");

        for (int i = 0; i < player2.length; i++) {
            System.out.println(player2[i]);
        }
        System.out.println();

        System.out.println("Player 3's Cards:");
        for (int i = 0; i < player3.length; i++) {
            System.out.println(player3[i]);
        }
        System.out.println();

        System.out.println("Player 4's Cards:");
        for (int i = 0; i < player4.length; i++) {
            System.out.println( player4[i]);
        }
    }


}









