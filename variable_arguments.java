public class variable_arguments {

    //vararg( variable arguments ) means giving n number of arguments value to parameter using array
    static int sum(int ...ar){
        int result=0;
        for(int a:ar){
            result+=a;
        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println("the sum of two value are : "+sum(1,2));
        System.out.println("the sum of three value are : "+sum(1,2,3));


    }
}
