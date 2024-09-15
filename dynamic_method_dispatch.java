class phone{

    public void on(){
        System.out.println("switching on the phone ");
    }

    public void showtime(){
        System.out.println("time is 8pm");
    }
}


class smartphone extends phone{
    @Override
    public void on(){
        System.out.println("switching on the smart phone");
    }

    public void music(){
        System.out.println("playing music bye bye bye...");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {

        //creating the object of subclass with the reference of superclass
        phone p =new smartphone();

        p.on(); //this will call the method from the sub class

        //we cannot use the dynamic method dispatch to call the normal methods
    }
}
