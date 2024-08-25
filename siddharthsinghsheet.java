import java.util.Scanner;

public class siddharthsinghsheet {
    public static void main(String[] args){
        //basics

        //question 1
        System.out.println("hello world");

        //question 2
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a :");
        int a=sc.nextInt();
        System.out.println("the number you have entered is : ");
        System.out.println(a);

        //question 3
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int sum = b+c+d;

        System.out.printf("the sum of %d, %d, %d if %d",b,c,d,sum);

        //question 4
        int divident=sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = divident/divisor;
        int remainder = divident%divisor;
        System.out.printf("the quotient of the two numbers is %d%n",quotient);
        System.out.printf("the remainder of the two numbers is %d",remainder);

        //question 5
        System.out.println(Integer.BYTES);
        System.out.println(Float.BYTES);
        System.out.println(Character.BYTES);

        //question 6

        int e=10;
        int f=20;
        int temp;
        temp=e;
        e=f;
        f=temp;
        System.out.println(e);
        System.out.println(f);

        //question 7
        char ch='A';
        System.out.println((int)ch);

        //question 8
        float dec1=sc.nextFloat();
        float dec2=sc.nextFloat();
        double multiplication=dec1*dec2;
        System.out.println(multiplication);


    }
}
