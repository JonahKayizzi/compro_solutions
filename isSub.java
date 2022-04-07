import java.util.Scanner;

public class isSub{

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

        System.out.println("Return result is: " + isSubArray(arrayExample));

    }

    public static int isSubArray(int[]a){

        for (int i = 0; i < a.length ; i ++){

            int sum = 0;
            for(int j = i + 1; j < a.length ; j ++){

                sum = a[j] + sum;

                if(a[i] <= sum) return 0;
            }
        }

        return 1;
    }
}