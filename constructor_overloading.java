class mypersonal1{

    String name;
    int id;

    //constructors
    //in python it is __init__ method , means it automatically takes the values while creating the object or if there are default value in the constructor it takes that.

    //creating the constructor
    public mypersonal1(int myid, String myname){
        id=myid;
        name=myname;
    }

    //creating constructor overloading
    public mypersonal1(int myid){
        id= myid;
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


public class constructor_overloading {
    public static void main(String[] args) {
        mypersonal1 mp=new mypersonal1(2342);

        //mypersonal1 my=new mypersonal1(234);

        System.out.println(mp.getid());



    }
}
