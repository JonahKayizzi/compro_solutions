import java.util.Scanner;
import java.util.Math;

 class sampleQuestions{
    public static void main (String[]args){

        int x;
        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter your preferred integer: ");
        x = sc.nextInt();

        int nps = nextPerfectSquare(x);

        System.out.print("The next perfect square for: " + x + " is: " + nps);

    }

    public static int nextPerfectSquare(int n){
        
        double double_n = n; //convert int argument to double that is explected by the math methods

        double floor_sqrt_n = Math.floor(Math.sqrt(double_n)); //get the floor value of the sqrt of the argument

        double nps = (floor_sqrt_n + 1) * (floor_sqrt_n + 1); //increment by 1 and square

        int nps_int = (int)nps; //convert result back to integer ... to match return type for the methood

        return (nps_int);
    }
}