import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class practiceset_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //question 1
        double value=0;
        float[] array=new float[5];

        for(int i=0;i<array.length;i++){
            array[i]=sc.nextFloat();
        }

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            value+=array[i];
        }
        System.out.println(value);

        //question 2
        int[] similar=new int[3];

        similar[0]=1;
        similar[1]=2;
        similar[2]=3;

        for(int i=0;i< similar.length;i++){
            if(2==similar[i]){
                System.out.println(i);
            }
            else{
                System.out.println("not similar");
            }
        }

        //question 3
        int [] marks= new int[5];

        marks[0]=60;
        marks[1]=70;
        marks[2]=80;
        marks[3]=50;
        marks[4]=90;
        int average_marks=0;

        //using for loop
        for(int i=0;i<marks.length;i++){
            average_marks+=marks[i];

        }
        System.out.print("average marks : "+average_marks/marks.length+"\n");

        System.out.println("");

        //using for each loop
        for(int values:marks){
            average_marks+=values;

        }
        System.out.print("average marks : "+average_marks/marks.length+"\n");


        //question 4

        int [][] mat1= {{1,2,3},{4,5,6}};
        int [][] mat2= {{7,8,9},{10,11,12}};
        int [][] mat3={{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                mat3[i][j] += mat1[i][j];
                System.out.print(mat3[i][j]+" ");

            }
            System.out.println("");
        }

        System.out.println("");

        for(int i=0;i<mat2.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                mat3[i][j] += mat2[i][j];
                System.out.print(mat3[i][j]+" ");

            }
            System.out.println("");
        }


        //question 5
        //in this method the values remain same if we try to print the reverse[0]
        int [] reverse= new int[2];

        reverse[0]=1;
        reverse[1]=2;

        for(int i= reverse.length-1;i>=0;i--){
            System.out.println(reverse[i]);
        }

        //another method is to swap the values to completely change the value
        int [] reversed={1,2,3,4,5};
        int temp;
        for(int i=0;i<reversed.length/2;i++){
            temp=reversed[i];
            reversed[i]=reversed[reversed.length-1-i];
            reversed[reversed.length-1-i]=temp;
        }
        for(int element:reversed){
            System.out.println(element);
        }





        //question 6
        int [] maxi=new int[3];

        maxi[0]=10;
        maxi[1]=20;
        maxi[2]=30;
        int max=maxi[0];

        for(int i=0;i<maxi.length;i++){
            if(maxi[i]>max){
                max=maxi[i];
            }
        }
        System.out.println(max);

        //question 7
        int [] mini=new int[3];

        mini[0]=50;
        mini[1]=20;
        mini[2]=30;
        int min=mini[0];

        for(int i=0;i<mini.length;i++){
            if(mini[i]<min){
                min=mini[i];
            }
        }
        System.out.println(min);

        //question 8

        //sorting in java

        int [] sorting={5,2,9,4,-1,8,-5};

        System.out.print("the original array is : ");
        for(int element : sorting){
            System.out.print(element);
        }

        Arrays.sort(sorting);
        for(int elements : sorting){
            System.out.println(elements);
        }

        //to check wheather the array is sorted or not

        boolean issorted=true;
        int [] sor={1,2100,45,16,9,35};

        for(int i=0;i<sor.length-1;i++){
            if(sor[i]>sor[i+1]){
                issorted=false;
                break;
            }
        }

        if(issorted){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }

    }
}
