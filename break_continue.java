public class break_continue {
    public static void main(String[] args) {

        //break
        //using for loop
        for(int i=10;i>0;i--){
            if(i==7){
                break;
            }
            System.out.println(i);
        }

        //contuinue
        //using for loop
        for(int i=7;i>0;i--){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }



    }
}
