abstract class pen{
    abstract public void write();
    abstract public void refill();
}

class fountainpen extends pen{
    public void write(){
        System.out.println("writing the letter");
    }
    public void refill(){
        System.out.println("refilling the pen if ink is over");
    }
    public void changenib(){
        System.out.println("changing the nib if it is not smooth");
    }
}


interface basicanimal{

    public void eat();
    public void sleep();
}

class monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}

class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("eating food");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void speak(){
        System.out.println("hello sir");
    }

}


abstract class telephone{

    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartteliphone extends telephone{
    public void ring(){
        System.out.println("phone ringing..");
    }

    public void lift(){
        System.out.println("lifting the phone...");
    }

    public void disconnect(){
        System.out.println("disconneting the call..");
    }

    public void swipe(){
        System.out.println("changes the screen");
    }

}

interface tvremote{
    public void changestreaming();
}

interface smarttvremote extends tvremote{
    public void switchon();
}

class tv implements smarttvremote{
    public void switchon(){
        System.out.println("switching on the tv");
    }
    public void changestreaming(){
        System.out.println("chaning it to netflix channel");
    }
}

public class practiceset_11 {
    public static void main(String[] args) {

        //question 1 and 2
        fountainpen fp= new fountainpen();

        fp.write();
        fp.refill();
        fp.changenib();

        System.out.println("");

        //question 3
        human h = new human();
        h.speak();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();

        System.out.println("");

        //polymorphism question 5
        monkey m = new human();
        m.bite();
        m.jump();

        System.out.println("");

        //question 4
        telephone tel= new smartteliphone();
        tel.ring();
        tel.lift();
        tel.disconnect();

        System.out.println(" ");

        //question 6 and  7
        tv channels= new tv();

        channels.switchon();
        channels.changestreaming();

    }
}
