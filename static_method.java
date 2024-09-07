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


    public static void main(String[] args) {

        int a=10;
        int b=20;

        int c = sum(a , b);
        System.out.println("the sum of the values are : "+c);


    }
}
