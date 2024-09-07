public class recursion {

    static int factorial(int n){
        if(n==0 | n==1){
            return 1;
        }
        else{
            return n*factorial((n-1));
        }

    }


    static int factorial_iteration(int n){
        int value=1;
        for(int i=1;i<=n;i++){
            value*=i;
        }

        return value;
    }


    static int fibonaci(int n){

        int num1=0;
        int num2=1;

        if (n == 0) {
            return num1;
        }

        if (n == 1) {
            return num2;
        }

        for(int i=2;i<=n;i++){
            int value=num1+num2;

            num1=num2;
            num2=value;

        }

        return num2;
    }

    public static void main(String[] args) {

        int x=5;
        System.out.println("the factorial is : "+factorial(x));
        System.out.println("the factorial is : "+factorial_iteration(x));

        System.out.println(fibonaci(4));

    }
}
