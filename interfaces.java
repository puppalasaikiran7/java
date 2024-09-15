//interfaces are those that have just method not the body.

interface bicycle{
    int a=234;  //this is final there is no changing of this
    public void applybreak(int decrement);
    public void speedup(int increment);
}

interface hornbicycle{

    public void hornk3g();
    public void hornmhn();
}

class avoncycle implements bicycle , hornbicycle{

    int speed=7;

    public void applybreak(int decrement){
        speed=speed+decrement;
        System.out.println(speed);
    }

    public void speedup(int increment){
        speed=speed+increment;
        System.out.println(speed);
    }

    public void hornk3g(){
        System.out.println("kabhi kushi kabhi gum pe pe pe");
    }

    public void hornmhn(){
        System.out.println("main hoon naa po po po");
    }
}

public class interfaces {
    public static void main(String[] args) {


        //you can use this way of creating the object or you can create using the concrete class
        //avoncycle av = new avoncycle();  in this we can use one instance to refer to both the interfaces

        bicycle bi= new avoncycle();
        hornbicycle hn = new avoncycle();

        bi.speedup(7);
        bi.applybreak(2);

        System.out.println(bi.a);

        //this is what i have wrote in the above interface
//        bi.a=234;
//        System.out.println(bi.a);

        hn.hornk3g();
        hn.hornmhn();


//interfaces are used for polymorphism purpose
//and also used for multiple inheritance

    }
}
