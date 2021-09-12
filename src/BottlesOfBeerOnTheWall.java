import java.util.Scanner;

public class BottlesOfBeerOnTheWall {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to N bottles of beer on the wall");
        System.out.println("How many bottles will be on the wall? [enter a number]");
        Scanner s = new Scanner(System.in);
        int bottlesOfBeerOnTheWall = s.nextInt();
        s.close();
        while(bottlesOfBeerOnTheWall >= 0){
            if(bottlesOfBeerOnTheWall >= 1){
                System.out.println("");
                System.out.println(bottlesOfBeerOnTheWall + " bottles of beer on the wall!");
                System.out.println(bottlesOfBeerOnTheWall + " bottles of beer!");
                System.out.println("Take one down, pass it around,");
            }else {
                System.out.println("No bottles of beer on the wall! 😭");
            }
            bottlesOfBeerOnTheWall --;
        }
    }
}
