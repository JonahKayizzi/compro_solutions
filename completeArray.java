import java.util.Scanner;
import java.util.Math;

public class completeArray{

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

        System.out.println("Return result is: " + isComplete(arrayExample));

        }

        public static int isComplete(int [] a){
            boolean evenExists = false;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            for(int i = 0; i < a.length; i++){
                if(i%2 == 0) {
                    evenExists = true;

                    if (i < min) min = i;
                    if (i > min) max = i;
                }
            }

            if(!(evenExists)) return 0;

            
        }
    }