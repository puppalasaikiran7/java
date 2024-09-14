class base1{

    public base1(){
        System.out.println("i am a constructor ");
    }

    //constructor overloading
    public base1(int x ){
        System.out.println("i am a constructor overloading with the value of x : "+x);
    }


}



class derived1 extends base1{

    public derived1(){

        System.out.println("i am a derived class constructor");

    }

    public derived1(int x , int y){

        super(x);  //this will call the constructor overloading from the super class

        System.out.println("i am derived constructor overloading with the values of x and y : "+y);
    }
}

class child extends  derived1{

    public child(){

        System.out.println("i am a child of the derived class ");

    }

    public child(int x , int y , int z){

        super(x,y);

        System.out.println("i am constructor overloading of the child class with the value of z : "+z);
    }
}

public class constructors_in_inheritance {
    public static void main(String[] args) {
        //constructor inheritance
//        base1 b= new base1();  //this will invoke the base constructor
//
//        derived1 d=new derived1();  //this will invoke both the base and the derived class constructor

        child ch= new child(1,2,3);



    }

}
