import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name =sc.next();

        //enhanced swicth case
        switch(name){
            case "ironman"-> System.out.println("I am iron man");
            case "captain america"-> System.out.println("I can do this all the day");
            case "hulk"-> System.out.println("HUlk smash");
            case "thor"-> System.out.println("I am Thor odin son , i  am god of thunder");
            case "hawkeye"-> System.out.println("you didn't see that coming");
        }

        //normal swicth case
        switch(name){
            case "ironman":
                System.out.println("i am iron man");

            case "captain america":
                System.out.println("i am captain america");

            case "hulk":
                System.out.println("i am hulk");

            case "thor":
                System.out.println("i am thor");

            case "hawkeye":
                System.out.println("i am hawkeye");

        }
    }
}
