interface mycamera{

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

interface mywifi{

    String[] mynetwork();
    void connecttonetwork(String network);
}

class mycellphone{

    public void callnumber(int number){
        System.out.println("calling to "+number);
    }

    public void pickcall(){
        System.out.println("connecting...");
    }

}

class mysmartphone extends mycellphone implements mywifi , mycamera{

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

    public void connecttonetwork(String network){
        System.out.println("conneting to ..."+network);
    }

}

public class interface_example_and_default_methods {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();

        ms.record4kvideo();

        for(String it : ms.mynetwork()){
            System.out.println(it);
        }

    }
}
