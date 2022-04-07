import java.util.Scanner;
import java.util.Arrays;

 class SequencedArray{

    public static void main (String[]args){

        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter number of values: ");
        int x = sc.nextInt(); // number of array elements

        System.out.print("Enter value of m: ");
        int y = sc.nextInt(); // number of array elements

        System.out.print("Enter value of n: ");
        int z = sc.nextInt(); // number of array elements

        int arrayExample[] = new int[x]; //create the array

        for(int i = 0; i < x ; i++){

            System.out.print("Enter value number " + (i + 1 )+ ": ");
            arrayExample[i] = sc.nextInt();
        }

        System.out.println("Return result is: " + isSequencedArray(arrayExample, y, z));

    }

    public static int isSequencedArray(int [] a, int m, int n){
        boolean sequence_broken = false;
        if(a[0] != m || a[a.length - 1] != n) return 0;

        for (int i = 0; i < a.length ; i++){

            if(m <= n){
                
                if(a[i] != m){
                    
                    m += 1;
                    if(a[i] != m){
                        return 0;
                    }
                }

            }

           // m +1;
        }

        return 1;
    }
}

