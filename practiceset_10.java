class circle{

    int radius;

    circle(int r){
        System.out.println("i am circle parameterized constructor");
        this.radius=r;
    }

    public double area(){
        return  (Math.PI*this.radius*this.radius);
    }

}

class cylinder1 extends circle{

    int height;
    cylinder1(int r ,int h){
        super(r);
        System.out.println(" i am cylinder1 parameterized constructor");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }

}


class rectangle1{

    double height1;
    double length1;

    public double getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(int height1) {
        this.height1 = height1;
    }

    public double area(){
        return length1*height1;
    }
}


class cubiod extends rectangle1{

    double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double volume(){
        return width*height1*length1;
    }
}

public class practiceset_10 {
    public static void main(String[] args) {
        //question 1 and 3

        cylinder1 cl = new cylinder1(12,5);
        System.out.println(cl.area());
        System.out.println(cl.volume());

        System.out.println("");

        //question 2

        cubiod c= new cubiod();
        c.setWidth(12);
        c.setHeight1(13);
        c.setLength1(20);
        System.out.println(c.area());
        System.out.println(c.volume());

    }
}
