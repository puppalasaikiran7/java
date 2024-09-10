import java.util.Random;
import java.util.Scanner;
class Game{

    Scanner sc=new Scanner(System.in);
    int number;
    int computervalue;
    private int numberofguesses;


    //constructor to generate the random values
    public Game(){
        Random rand=new Random();
        computervalue= rand.nextInt(1,100);
        numberofguesses=0;
    }

    //methods
    public void takeUserInput(){
        System.out.print("enter the number : ");
        number=sc.nextInt();
        numberofguesses++;
    }

    public boolean iscorrectnum(){
        if(computervalue==number){
            System.out.format("yes you have guessed it right it was %d in  %d  guesses \n",computervalue,numberofguesses);
            return true;
        } else if (computervalue>number) {
            System.out.println("too low");
        } else if (computervalue<number) {
            System.out.println("too high");
        }
        return false;
    }


    public int getnoofguesses(){
        System.out.println("you have : ");
        return numberofguesses;
    }


}



public class excercise_3 {
    public static void main(String[] args) {


        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b=g.iscorrectnum();
            System.out.println(b);
        }

    }
}
