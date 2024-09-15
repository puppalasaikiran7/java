abstract class parent1{

    public parent1(){
        System.out.println("i am constructor of parent1 ");
    }

    public void hello(){
        System.out.println("hello");
    }

    abstract public void greet();
    abstract public void greet2();

}


class child1 extends parent1{

    @Override
    public void greet(){
        System.out.println("good morning");
    }

    @Override
    public void greet2(){
        System.out.println("good afternoon");
    }

}

abstract class child3 extends parent1{

    public void something(){
        System.out.println("i am good");
    }

}


public class abstract_class_and_method {
    public static void main(String[] args) {
        //one abstract method in class makes the whole class as abstract class
        //abstract class cannot be used to create object
        //abstract class helps in creating the concreate class( actual class ) which can be used to create the object
        //we can create abstract class from another abstract class
        //as many as the abstract methods created in abstract class it should be overriden in the concreate class( actual class )
        //dynamic method dispatch can also be done like creating the refernce of the class parent and creating the object of the class child

        //parent1 p1=new child1();
        //
        //        p1.greet();
        //        p1.greet2();

                //or

        child1 ch1=new child1();

        ch1.greet();
        ch1.greet2();


    }
}
