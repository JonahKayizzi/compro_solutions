import java.util.Scanner;

public class StantonMeasure{

    public static void main (String[]args){

        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter number of values: ");
        int x = sc.nextInt(); // number of array elements

        int arrayExample[] = new int[x]; //create the array

        for(int i = 0; i < x ; i++){

            System.out.print("Enter value number " + (i + 1 )+ ": ");
            arrayExample[i] = sc.nextInt();
        }

        System.out.println("Return result is: " + stantonMeasure(arrayExample));

    }

    public static int stantonMeasure (int [] a){
        int oneCount = 0;
        int stantonCount = 0;
        int valuetoCount = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == 1) oneCount ++;
        }
        System.out.println("Number of ones " + oneCount);
        for(int j = 0; j < a.length; j ++){
            if(a[j] == oneCount)  valuetoCount = a[j];
        }
                
        for(int k = 0 ; k < a.length; k++){
            if(a[k] == valuetoCount) stantonCount ++;
        }
    
        return stantonCount;
    }

}