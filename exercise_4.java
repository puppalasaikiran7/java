class library{

    String[] books= new String[100];
    int noofbooks =0;

    public void addbook(String book){
        books[noofbooks]=book;
        noofbooks++;
    }

    public void showbooks(){
        for(String book: books){
            if(book==null){
                continue;
            }
            System.out.println(book+" book has been added");
        }
    }

    public void issuebook(String book){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(book)){
                System.out.println("this book has been issued");
                books[i]=null;
                return ;
            }
        }
        System.out.println("this book doesnot exists");
    }

    public void returnbook(String book){
        for(int i=0;i<books.length;i++){
            if(books[i]==null){
                books[i]=book;
                return ;
            }
        }
    }



}


public class exercise_4 {
    public static void main(String[] args) {
        //you have to implement a library using java class library
        //methods: addbook , issuebook , returnbook , showavailablebooks
        //properties : array to store the available books
        //array to store issued books


        library pl=new library();

        pl.addbook("java basics to advance");
        pl.addbook("c++");
        pl.addbook("python");
        pl.addbook("flutter");
        pl.addbook("game dev using unreal");
        pl.addbook("game dev using unity");
        pl.addbook("ai and ml engineer and research engineer");
        pl.addbook("devops engineer");
        pl.addbook("full stack developer");
        pl.addbook("java full stack developer");
        pl.showbooks();
        pl.issuebook("game dev using unreal");
        pl.showbooks();
        pl.returnbook("game dev using unreal");
        System.out.println("");
        pl.showbooks();


    }
}
