class A{

    //method 1
    public void meth1(){
        System.out.println("i am method 1 of class A");
    }
    //method 2
    public void meth2(){
        System.out.println("i am meth 2 of class A");
    }
}


class B extends A{

    //overriding
    @Override   //this helps in identifying that the method is being over riden
    public void meth2(){
        System.out.println("i am meth 2 of class B");
    }

    //method 3
    public void meth3(){
        System.out.println("i am meth3 of class B");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b= new B();
        b.meth2();
    }
}

//rules in method override
//return type should be same
//arguments should not be different
//access should not be private