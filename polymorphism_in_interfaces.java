interface mycamera1{

    void takesnap();
    void recordvideo();

    //this private method cannot be used by the mysmartphone object but we can
    //use this in the default method just by calling the method name
    private void greet(){
        System.out.println("good morning");
    }

    //default method
    //default is used only in the interface not outside of the interface
    default void record4kvideo(){
        greet();
        System.out.println("recording the video in 4k");
    }
}

interface mywifi1{

    String[] mynetwork();
    void connecttonetwork(String network);
}

class mycellphone1{

    public void callnumber(int number)
    {
        System.out.println("calling to "+number);

    }

    public void pickcall()
    {
        System.out.println("connecting...");

    }

}

class mysmartphone1 extends mycellphone1 implements mywifi1 , mycamera1{

    public void takesnap(){
        System.out.println("taking picture of the person");

    }

    public void recordvideo(){
        System.out.println("recording the video in live");

    }

    public String[] mynetwork(){
        System.out.println("getting list of network");
        String[] network1 = {"jio_4g", "jio_5g", "airtel_5g", "airtel_4g", "bsnl_5g"};
        return network1;
    }

    public void connecttonetwork(String network)
    {
        System.out.println("conneting to ..."+network);

    }

}


public class polymorphism_in_interfaces {
    public static void main(String[] args) {

        mycamera1 mc1= new mysmartphone1();
        mc1.takesnap();
        mc1.record4kvideo();

        System.out.println("");

        mysmartphone1 ms1= new mysmartphone1();

        ms1.takesnap();

        for( String etl: ms1.mynetwork()){
            System.out.println(etl);
        }

        ms1.connecttonetwork("jio_5g");

        ms1.callnumber(782315235);

        ms1.pickcall();

    }
}
