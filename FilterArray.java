import java.util.Scanner;
import java.util.Arrays;

public class FilterArray{

    public static void main (String[]args){

        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter number of values: ");
        int x = sc.nextInt(); // number of array elements

        System.out.print("Enter number for the filter: ");
        int y = sc.nextInt(); // number of array elements

        int arrayExample[] = new int[x]; //create the array

        for(int i = 0; i < x ; i++){

            System.out.print("Enter value number " + (i + 1 )+ ": ");
            arrayExample[i] = sc.nextInt();
        }

        System.out.println("Return result is: " + Arrays.toString(filterArray(arrayExample, y)));

    }

    public static int[] filterArray(int [] a, int n){
        int count = 0;
        int filter_size = 0;
        int m = n;

        while (n > 0){

            if (n%2 != 0) count ++;

            filter_size ++;
            n = n/2;
        }

        int filterResult[] = new int[count];

        if(a.length < filter_size) return null;

        int i = 0;
        int j = 0;

        while (m > 0){

            if (m%2 != 0) {
                filterResult[j] = a[i];
                j++;
            }

            m = m/2;
            i++;
        }
        
        return filterResult;
        
    }
}