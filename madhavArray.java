import java.util.Scanner;
import java.util.Math;

public class madhavArray{

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

        System.out.println("Return result is: " + isMadhavArray(arrayExample));

        }

        public static int isMadhavArray(int [] a){
            int arraySum = 0;
            boolean sumIsMadhav = false;
            
            if(isTriangular(a.length)){
                for(int i = 0; i < a.length; i ++){

                    arraySum = arraySum + a[i];
                    if(isTriangular(i + 1)){
                        if(arraySum == a[0]) {
                            sumIsMadhav = true;
                            arraySum = 0;
                        }else{
                            sumIsMadhav = false; 
                        }
                    }
                }

                if(sumIsMadhav) return 1;
            }
            
            return 0;
        }  

        public static boolean isTriangular (int x){   // n * (n + 1)/2 equals a triangular number - quadratic equation n2 + n - 2x = 0
            double x_dobule =  x;

            double n = ((Math.sqrt(1 + (8 * x_dobule)))- 1)/2;

            if(n - Math.floor(n) == 0)return true;

            return false;
            
        }
}