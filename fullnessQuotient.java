import java.util.Scanner;
import java.util.Math;

 class fullnessQuotient{

    public static void main (String[]args){
        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter the value: ");
        int x = sc.nextInt(); // number of array elements

        System.out.println("Return result is: " + fullnesQuotient(x));


    }

    public static int fullnesQuotient (int n){
        int countFullQ = 0;
        

        for (int i = 2 ; i <= 9; i ++){
            int check1=0;
            while (n <= 1){
              
                if(n%i == 0){
                    check1=1; 
                    break;
                }else{
                n/=i; 
                } 
            }
            if (check1==0) countFullQ++;

        }
        return countFullQ;
    }
}