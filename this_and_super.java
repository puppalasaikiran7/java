class ekclass{
    int a;

    ekclass(int a){
        this.a=a;
    }

    //method
    public int getA() {
        return a;
    }
}

class derived2 extends ekclass{

    derived2(int c){
        super(c);
        System.out.println("this is a derived constructor ");
    }

}


public class this_and_super {
    public static void main(String[] args) {
//        ekclass ek = new ekclass(69);
//        System.out.println(ek.getA());

        derived2 d= new derived2(4);
        System.out.println(d.getA());


    }
}
