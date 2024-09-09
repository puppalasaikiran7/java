//one file can contain one public class not more than that

class Employee{
    int id;     //this is attributes or property
    String name;
    int salary;

    //creating the method
    public void printing(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }


    public int salary(){
        return salary;
    }


}


public class custom_class {
    public static void main(String[] args) {

        //calling the class
        Employee em=new Employee ();
        em.id=4532;
        em.name="ironman";
        em.salary=323;


        Employee john = new Employee();
        john.id=2462;
        john.name="john kediya";
        john.salary=523;

        em.printing();  //we can use this instead of printing the attributes separate
        System.out.println(em.salary());

        System.out.println("");
        john.printing();
        System.out.println(john.salary());
//        System.out.println(em.id);
//        System.out.println(em.name);



    }
}
