import java.util.Scanner;

public class practiceset4 {
    public static void main(String[] args){

        //question 2
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        double percentage=((sub1+sub2+sub3)/300.0)*100;
        System.out.println(percentage);

        if(percentage>=40 && sub1>=33 &&sub2>=33&&sub3>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }


        //question 3 income tax
        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);


        //question 4
        //question 4 finding the day

        int num=sc.nextInt();
        switch(num){
            case 1:{
                System.out.println("monday");
                break;
            }

            case 2:{
                System.out.println("tuesday");
                break;
            }
            case 3:{
                System.out.println("wednesday");
                break;
            }
            case 4:{
                System.out.println("thursday");
                break;
            }
            case 5:{
                System.out.println("friday");
                break;
            }
            case 6:{
                System.out.println("saturday");
                break;
            }
            case 7:{
                System.out.println("sunday");
                break;
            }
            default :{
                System.out.println("enter the number between 1 to 7");
            }
        }

        // question 5 leap year or not
        //leap year is divisible by 4 and 400 but not divisible by 100
        int year=sc.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("this is not leap year");
        }

        //question 6
        String str=sc.next();

        switch(str){
            case ".org":{
                System.out.println("organization");
                break;
            }

            case ".com":{
                System.out.println("commercial website");
                break;
            }

            case ".in":{
                System.out.println("indian website");
                break;
            }

            default:{
                System.out.println("enter .org || .com || .in ");
            }
        }



    }
}
