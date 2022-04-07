public class factorial {

    public static void main (String [] args){

       // System.out.println(Factorial(3));

        System.out.println(Factorial1(10));
    }

    public static int Factorial (int n){
        int fact = 1;

        if (n == 0) return 1;

        for (int i = n; i >= 1; i-- ){
            fact = fact * i; 
        }

        return fact;
    }


    public static int Factorial1 (int x){

        if (x == 0) return 1;

        return x * Factorial1(x - 1);

    }
}