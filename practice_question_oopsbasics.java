class Employe{

    int salary;
    String name;


    public int getsalary(){
        return salary;
    }

    public String getname(){
        return name;
    }

    public void setname(String newname){
        name=newname;

    }

}

class celphone{

    //ringing
    public void ringing(){
        System.out.println("Ringing...");
    }

    public void vibrating(){
        System.out.println("Vibrating...");
    }

    public void callingfriend(){
        System.out.println("Calling a Friend...");
    }

}


class square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

}


class Rectangle{

    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return (length+breadth)*2;
    }
}


class tommyvecetti{

    public void runnig(){
        System.out.println("running");
    }

    public void hitting(){
        System.out.println("hitting");
    }

    public void firing(){
        System.out.println("firing");
    }
}

public class practice_question_oopsbasics {
    public static void main(String[] args) {

        //question 1

        Employe emp=new Employe();
        emp.salary=234;
        emp.name="ironman";


        System.out.println(emp.getsalary());
        System.out.println(emp.getname());
        emp.setname("hulk");


        System.out.println("");

        //question 2

        celphone mi=new celphone();
        mi.callingfriend();
        mi.ringing();
        mi.vibrating();

        System.out.println("");

        //question 3
        square s=new square();
        s.side=10;
        System.out.println(s.perimeter());
        System.out.println(s.area());

        System.out.println("");

        //question 4
        Rectangle re=new Rectangle();
        re.length=10;
        re.breadth=20;

        System.out.println(re.area());
        System.out.println(re.perimeter());

        System.out.println("");

        //question 5

        tommyvecetti ty=new tommyvecetti();

        ty.runnig();
        ty.firing();
        ty.hitting();


    }
}
