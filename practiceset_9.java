class cylinder{
    int radius;
    int height;
    public void setradius(int ra){
        radius=ra;
    }

    public int getradius(){
        return radius;
    }

    public void setheight(int he){
        height=he;
    }

    public int getHeight(){
        return height;
    }

    public double surfacearea(){
        return 2*Math.PI *height*radius+2*Math.PI*radius*radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

class rectangle{

    private int length;
    private int breadth;

    public rectangle() {
        this.breadth = 4;
        this.length = 10;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public rectangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

}


public class practiceset_9 {
    public static void main(String[] args) {
        //question 1:
        cylinder cy=new cylinder();
        cy.setheight(12);
        cy.setradius(9);
        System.out.println("the radius of the cylinder is : "+cy.getradius());
        System.out.println("the height of the cylinder is : "+cy.getHeight());

        //question 2
        System.out.println(cy.surfacearea());
        System.out.println(cy.volume());

        //question 4
        rectangle rc=new rectangle();
        System.out.println(rc.getBreadth());
        System.out.println(rc.getLength());



    }
}
