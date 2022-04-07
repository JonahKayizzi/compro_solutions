import java.util.Scanner;
import java.lang.annotation.Target;
import java.util.Math;

public class porcupineNumber {

    public static void main (String[]args){
        Scanner sc;  
        sc = new Scanner (System.in);

        System.out.print("Enter the start point: ");
        int x = sc.nextInt();

        System.out.print("The next porcupine number is: " + nextPorcupine(x));

    }

    public static int nextPorcupine(int n){
        Boolean pocupineFound = false;
        int pocupineValue = 0;
        n = n + 1;
        
        while(n < Integer.MAX_VALUE){

            if(pocupineFound){
                if((isPrime(n)) && (n %10 == 9)){
                    break;
                }else if((isPrime(n)) && (n %10 != 9)){
                    pocupineFound = false;
                }

            }else{
                if((isPrime(n)) && (n %10 == 9)) {
                    pocupineFound = true;
                    pocupineValue = n;
                  
                }
            }
            n++;
        }

       return pocupineValue;

         
    } 

    public static boolean isPrime(int a){
        if(a< 2) return false;
        if(a > 2){
          for(int i = 2; i <= Math.sqrt(a); i++ ){
              if(a % i == 0) return false;
          }  
        }

        return true;
    }

   /* public static boolean isPorcupine (int z){
        if((isPrime(z)) && (z%10 == 9)) {
            //System.out.println( z + " is porcupine");
            return true;
        
        }
        return false;
    }   */
}