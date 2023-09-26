package Week03;

public class Main {
    public static void main(String[] args)
    {
        Week03.Music myMusic1=new Week03.Music("romantic","summertime","3:20",
                new week03.Date(12,4,2023),new Singer("arijit singh","male","indian"
                ,new week03.Date(4,7,2018)));

        Week03.Music myMusic2=new Week03.Music("mashup","summertime","3:40",
                new week03.Date(14,8,2024),new Singer("bilal saeed","male","pakistani"
                ,new week03.Date(21,2,2017)));

        System.out.println(myMusic1);
        System.out.println();
        System.out.println(myMusic2);

        if (myMusic1.equals(myMusic2)){
            System.out.println("both are same");
        }
        else {
            System.out.println("they are not same");
        }
//        boolean matches = myMusic1.equals(myMusic2);
//        System.out.println("does both match?");
//        System.out.println(matches);
//
//         boolean ans= myMusic1.getTitle().equals(myMusic2.getTitle());
//        System.out.println(ans);

    }
}