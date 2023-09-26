package week04;

public class Main {
    public static void main(String[] args) {
//        Card c1 = new Card("club","ace");
//        Card c2 = new Card("club","2");
//        System.out.println( c1.equals(c2));

        Deck deck = new Deck();
//       for (int i=0;i<52;i++){
//           System.out.println(deck.cards[i]);
//       }
        System.out.println(deck.toString());
        System.out.println();
        deck.shuffle();
        System.out.println(deck.toString());

        Player player = new Player();
        player.distribute(deck);
        player.printPlayersCards();
    }
}
