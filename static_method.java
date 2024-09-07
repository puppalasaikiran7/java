public class static_method {

    //method in java is collection of statements that perform some specific tasks and return the result to the caller .
    //static method in java is a method that belongs to class rather than any particular instance of the class ,that means it does not require to create the instance / object of the class to call static method .

    static int sum(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;

        }
        return z;
    }

    //changing the value or passing the value by value or by reference
    static void change(int w){
        w=30;
    }

    static void change2(int[] e){
        e[0]=10;
    }


    public static void main(String[] args) {

        int a=10;
        int b=20;

        int c = sum(a , b);
        System.out.println("the sum of the values are : "+c);

        System.out.println("");

        //example 1:
        // this values will not be changed because the value are passed by copy not by reference.
        int t=10;
        change(t);
        System.out.println("the value which is being tried to change : "+t);

        System.out.println("");

        //example 2:
        //this value will change because the values are passed as the reference not by the value.
        int[] r={1,2,3,4,5};
        change2(r);
        System.out.println("the array value which will change because it is passed by the refernce : "+r[0]);



    }
}
