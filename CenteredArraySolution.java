import java.util.Scanner;
import java.util.Math;

 class CenteredArraySolution{

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

        System.out.println("Return result is: " + a1(arrayExample));

        }

        static int a1 (int[] a){
        if(a == null || a.length % 2 == 0) return 0;

        int midIndex = a.length / 2;

        int midItem = a[midIndex];

        for (int i = 0; i < a.length; i++){
            if(i != midIndex && midItem >= a[i])
            return 0;
        }
        return 1;
    
    }
}
