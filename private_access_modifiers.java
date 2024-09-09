class myemployee{

    private int id;
    private String name;

    //setting is nothing but setting the name using parameter
    public void setid(int n){
        id=n;
    }

    public int getid(){
        return id;
    }


    public void setname(String peru){
        name=peru;
    }

    public String getname(){
        return name;
    }
}


public class private_access_modifiers {
    public static void main(String[] args) {

        //private access modifier
        //getter and setter
        //setter is nothing but giving parameters and arguments
        //getter is  nothing but displaying the arguments or returning the value

        myemployee e = new myemployee();

        e.setname("thor");
        System.out.println(e.getname());

        e.setid(31234);
        System.out.println(e.getid());




    }
}
