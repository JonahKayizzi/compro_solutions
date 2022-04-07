import java.util.Scanner;
import java.util.Math;

 class countSquarePair{

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

        System.out.println("Return result is: " + countSquarePairs(arrayExample));

        }

    public static boolean perfectSquare(int x){
        double x_double = x;

        if((Math.sqrt(x_double) - Math.floor(Math.sqrt(x_double)) == 0)) return true;
        return false; 
    }

    public static int countSquarePairs (int[] a){
        int numberOfPSquares = 0;

        for (int i = 0; i < a.length; i ++){

            if(a[i] > 0){

                for(int j = 0; j < a.length; j ++){

                    if(a[j] > 0 && a[j] > a[i]){

                       if(perfectSquare(a[i] + a[j])) numberOfPSquares += 1;
                    }
                }
            }
        }

        return numberOfPSquares;
    }
}

    