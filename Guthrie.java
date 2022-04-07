import java.util.Scanner;

public class Guthrie{

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

        System.out.println("Return result is: " + isGuthrieSquence(arrayExample));

    }

    public static int isGuthrieSquence (int [] a){
        if(a[a.length - 1] != 1) return 0;

        for(int i = 0; i < a.length - 1; i++){
            
            if(a[i] % 2 == 1){
                if(a[i+1] != (a[i] * 3) + 1) return 0;
            }else{
                if(a[i+1] != a[i] / 2) return 0;
            }
            
        }

        return 1;
    }
}