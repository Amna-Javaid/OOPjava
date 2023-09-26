
package week04;

public class Card {
    String suits;
    String rank;

    public Card( String suits,String rank ){
        this.rank=rank;
        this.suits =suits;

    }
    public String getSuits(){
        return suits;
    }
    public String toString(){
        return String.format("%s of %s ",rank,suits);
    }
    public boolean equals (Object o){
        Card temp=(Card)o;
        return rank.equals(temp.rank)&& suits.equals(temp.suits);
    }


}
