//java doesnot support multiple inheritance means there wont be two base classes for one single derived class.

class base{
    int x;
    public void printme(){
        System.out.println("i am base class ");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class derived extends base{      //extends will help in inheriting the base class to derived class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printme(){
        System.out.println("i am derived class");
    }
}



public class inheritance {
    public static void main(String[] args) {

        //creating the object from the base class
        base b=new base();
        b.setX(43);
        System.out.println(b.getX());


        //creating the object from the derived class
        derived d=new derived();
        d.setY(899);
        System.out.println(d.getY());

    }
}
