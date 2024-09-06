public class for_each {
    public static void main(String[] args) {
        //for each ( doing array practice )

        //finding the length of the array
        int[] arr={1,2,3,4,5};
        System.out.println(arr.length);

        System.out.print("\n");

        //printing the array using for loop
        int [] array={1,2,3,4,5};
//        for(int i=0;i<=array.length;i++){
//            System.out.println(array[i]);
//        }


        //using for each
        for(int element:array){
            System.out.println(element);
        }



        
    }
}
