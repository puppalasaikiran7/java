import java.util.Scanner;

public class iodatatypes {
    public static void main(String[] args){
//        printing hello world
        System.out.println("hello world");

        //data types

        //byte
        byte a=1;
        System.out.println(a);

        //short
        short b=23;
        System.out.println(b);

        //int
        int c=254;
        System.out.println(c);

        //long
        long d=2342;
        System.out.println(d);

        //float
        float e=12.3f;
        System.out.println(e);

        //double
        double f=1234.234d;
        System.out.println(f);

        //char
        char g='a';
        System.out.println(g);

        //boolean
        boolean h=true;
        System.out.println(h);

        //taking the input from the user

        Scanner sc=new Scanner(System.in);

        //int
        int i=sc.nextInt();
        System.out.println(i);

        //float
        float j=sc.nextFloat();
        System.out.println(j);

        //string

        //this will only take the input till the space and after the space the string will be cut down
        String str= sc.next();
        System.out.println(str);

        //in this the complete string what ever you type will be taken
        String st=sc.nextLine();
        System.out.println(st);


    }
}
