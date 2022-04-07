import java.util.Scanner;
import java.util.Math;

public class bunkerArray{

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

        System.out.println("Return result is: " + isBunkerArray(arrayExample));

        }

        public static int isBunkerArray(int [] a){
            for(int i = 0; i < a.length - 1; i++){
                if((i%2 == 1) && (a[i+1] == a[i] * a[i])) return 1; 
            }

            return 0;
        }
    }