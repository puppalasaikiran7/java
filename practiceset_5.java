import java.util.Scanner;

public class practiceset_5 {
    public static void main(String[] args) {

        //question 1
        //*****
        //****
        //***
        //**
        //*

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n");

        //question 2
        //sum first n even numbers using while loop

        int number =sc.nextInt();
        int sum=0;
        for(int i=0;i<number;i++){
            sum+=2*i;
        }
        System.out.println("sum of even numbers is : ");
        System.out.println(sum);

        System.out.print("\n");


        //problem 3
        int tablenumber=10;
        int value;
        for(int i=tablenumber;i>=1;i--){
            value=tablenumber*i;
            System.out.println(value);
        }

        System.out.print("\n");

        //problem 5
        int factorial=sc.nextInt();
        long fact=1;
        for(int i=1;i<=factorial;i++){
            fact*=i;
        }
        System.out.println(fact);

        System.out.print("\n");


        //question 9
        //sum of numbers occuring in the multiplication of table 8

        int valuable=sc.nextInt();
        long empty=0;
        int store;
        for(int i=1;i<=valuable;i++){
            store=valuable*i;
            System.out.println(store);
            empty+=store;

        }
        System.out.println("sum of number occuring in the multiplication of "+valuable+" : ");
        System.out.println(empty);

    }
}
