import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        //if else

        int age=18;
        if(age>=18){
            System.out.println("yes boy you can drive the car");
        }
        else{
            System.out.println("no boy you cannot drive the car");
        }

        //if else if
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number==18){
            System.out.println("you are going to become adult");
        }
        else if(number==21){
            System.out.println("you are going to join the job");
        }
        else{
            System.out.println("you need to work more hard to become rich");
        }


    }
}
