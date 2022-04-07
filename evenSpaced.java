import java.util.Scanner;
import java.util.Math;

public class evenSpaced{

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

        System.out.println("Return result is: " + isEvenSpaced(arrayExample));

        }

        public static int isEvenSpaced(int [] a){
            int largest_value = Integer.MIN_VALUE;
            int smallest_value = Integer.MAX_VALUE;

            if(a.length < 2) return 0;
            for(int i = 0; i < a.length ; i++){
                if(a[i] > largest_value) largest_value = a[i];
                if(a[i] < smallest_value) smallest_value = a[i];
            }

            System.out.println("Largest value is " + largest_value);
            System.out.println("Smallest value is " + smallest_value);
            if((largest_value - smallest_value)% 2 == 0 ) return 1;
            return 0;

        }
    }