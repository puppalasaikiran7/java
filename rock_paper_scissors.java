import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //0 for rock && 1 for paper && 2 for scissors

        //taking the input from the user
        System.out.print("enter the number : ");
        int user= sc.nextInt();

        //random number by the computer
        int computer=rand.nextInt(3);

        if(user==computer){
            System.out.println("draw match");
        }

        else if(user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1){
            System.out.println("user win");
        }

        else{
            System.out.println("computer win");
        }
        System.out.print("computer input : "+computer);

    }
}
