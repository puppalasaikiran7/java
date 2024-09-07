import java.util.Scanner;

public class practiceset_7 {

    static void multiplication(int n){
        int value=1;
        for(int i=1;i<=n;i++){
            value=n*i;
            System.out.println(n + " x " + i + " = " +value);
        }
    }


    static void pattern1(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    static int sumnum(int n){
        if(n==1){
            return 1;
        }
        return n + sumnum(n-1);
    }

    static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){

        int num1=0;
        int num2=1;

        if(n==0){
            return num1;
        }
        if(n==1){
            return num2;
        }

        for(int i=2;i<=n;i++ ){
            int value=num1+num2;

            num1=num2;
            num2=value;
        }
        return num2;
    }

    static int average(int ...n){
        int num=0;
        for(int e :n){
            num+=e;
        }
        return num/n.length;
    }


    static void patternrec1(int n){
        if(n>0){
            patternrec1(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }


    static void patternrec2(int n){
        if(n>0){
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println("");
            patternrec2(n-1);

        }
    }

    static int sumnum1(int n){
        int value=0;
        for(int i=n;i>=1;i--){
            value+=i;
        }
        return value;
    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //question 1
        int x=sc.nextInt();
        System.out.println("the multiplication of the number "+x+" is : ");
        multiplication(x);

        System.out.println("");


        //question 2
        int value=sc.nextInt();
        pattern1(value);

        System.out.println("");

        //question 3
        int c=sumnum(3);
        System.out.println(c);

        System.out.println("");

        //question 4
        pattern2(4);

        System.out.println("");

        //question 5
        System.out.println(fib(5));

        System.out.println("");

        //question 6
        System.out.println(average(1,2,3,4));

        System.out.println("");

        //question 7
        patternrec1(5);

        System.out.println("");
        System.out.println("");

        //question 8
        patternrec2(4);

        System.out.println("");

        //question 10
        System.out.println(sumnum(3));




    }
}
