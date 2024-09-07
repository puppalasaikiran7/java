public class method_overloading {

    static void foo(){
        System.out.println("hello foo");
    }

    static void foo(int a){
        System.out.println("hello "+a+" foo");
    }

    static void foo(int a , int b){
        System.out.println("hello "+a+" foo");
        System.out.println("hello "+b+" foo");
    }

//this will give you an error because you cannot change the data type of the method and just call it , it does not work like that.
//    static int foo(int a , int b){
//        System.out.println("hello "+a+" foo");
//        System.out.println("hello "+b+" foo");
//        return  0;
//    }

    public static void main(String[] args) {

        //method overloading
        // same name but different work being done


        foo();

        foo(10);

        //you can add as many number of parameters and arguments that becomes the method overloading
        foo(20,30);

        //you cannot change the return type of the same method and call it , it does not work like that
        foo(40 , 50 );




    }
}
