class mypersonal{

    String name;
    int id;

    //constructors
    //in python it is __init__ method , means it automatically takes the values while creating the object or if there are default value in the constructor it takes that.

    //creating the constructor
    public mypersonal(int myid, String myname){
        id=myid;
        name=myname;
    }



    public void setname(String names){
        name=names;
    }
    public String getname(){
        return name;
    }
    public void setid(int idnum){
        id=idnum;
    }
    public int getid(){
        return id;
    }

}



public class constructors {
    public static void main(String[] args) {
        mypersonal my=new mypersonal( 234, "blackwidow");

        System.out.println(my.getid());



    }
}
