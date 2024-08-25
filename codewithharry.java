import java.util.Scanner;

public class codewithharry {
    public static void main(String[] args){

        int a=20;
        int b=20;
        int sum = a+b;
        System.out.println(sum);

        //cbse board exam marks
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();

        int sum1=sub1+sub2+sub3+sub4+sub5;

        float percentage = (sum1/500.0f)*100;
        System.out.println(percentage);

        //gpa
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();

        int sum2=marks1+marks2+marks3;

        float gpa=sum2/30.0f;

        System.out.println(gpa);

        //km to miles
        int km =sc.nextInt();
        float miles=0.621371f;

        float kmtomiles=km*miles;
        System.out.println(kmtomiles);

        //enter the username and greet
        String str= sc.nextLine();
        System.out.printf("hello "+str+" have a good day");

        //number entered by the user is int or not
        System.out.println(sc.hasNextInt());

        //result of following expression
        float l = ((7 / 4) * 9) / 2;
        System.out.println(l);

        //string to lower case
        String lower="HARRY";
        System.out.println(lower.toLowerCase());

        //replace space with underscore
        String rep="sai kiran 01";
        System.out.println(rep.replace(" ","_"));

        //letter
        String letter="Dear <|name|> , Thanks a lot!";
        System.out.println(letter.replace("<|name|>","saikiran"));

        //detecting the spaces
//        String spaces="I am saikiran   i am learning  java";
//        System.out.println(spaces.("  "));

        //writing the letter
        String lett="dear harry ,\nthis java course is nice .\n\tthanks";
        System.out.println(lett);






    }
}
