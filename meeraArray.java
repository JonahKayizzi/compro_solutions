import java.util.Scanner;
import java.util.Math;

public class meeraArray{

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

        System.out.println("Return result is: " + isMeeraArray(arrayExample));

        }

        public static int isMeeraArray(int [] a){

            for(int i = 0; i < a.length ; i ++){
                for (int j = 0; j < a.length ; j++){
                    if(a[i] == -a[j]) return 0;
                }
            }
            return 1;
        }
    }