interface sampleinterface{
    void meth1();
    void meth2();
}

interface childinterface extends sampleinterface{
    void meth3();
    void meth4();
}


//all the methods form the interfaces should be implemented in the
// concret class same like the abstract class inheritance .
class mysampleclass implements childinterface{
    public void meth3(){
        System.out.println("met 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
    public void meth1(){
        System.out.println("met1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
}

public class inheritance_in_interfaces {
    public static void main(String[] args) {
        mysampleclass ms = new mysampleclass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }
}
