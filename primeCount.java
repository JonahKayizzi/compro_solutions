import java.util.Scanner;

 class primeNoCount{

    public static void main (String[]args){
        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter start value: ");
        int start_v = sc.nextInt();
        System.out.print("Enter end value: ");
        int end_v = sc.nextInt();

        System.out.print("The number of prime numbers is: " + primeCount(start_v, end_v));

    }

    public static int primeCount(int start, int end){
        int primeNoCnt = 0;
        
        for(int i = start; i <= end; i ++){

                if(isPrime(i)){
                    System.out.print("The prime is: " + i);
                    primeNoCnt +=1 ;
                }                      
        
        }

        return primeNoCnt;
    }

    public static boolean isPrime (int x){
      
        if(x < 2) return false;

        for (int i = 2; i <= Math.sqrt(x);i ++){
            if(x%i == 0) return false;
        }
        return true;
    }
}