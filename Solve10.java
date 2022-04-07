public class Solve10{

    public static void main (String [] args){

        int [] arraySolution  = solve10();

        System.out.println("Value of x is: " + arraySolution[0] + " and Value of y is: " + arraySolution[1]);

    }

    public static int [] solve10 (){
        int x;
        int y;

        for (int i = 0; i <= 10; i ++){

            for (int j = 0; j <= 10; j ++){

                if( factorial(i) + factorial(j) == factorial(10)){

                    x = i;
                    y = j;

                    break;
                }
            }
        }

        int [] xy = {x,y};

        return xy;
    }

    public static int factorial(int n){
        if (n == 0) return 1;

        return n * factorial (n - 1);
    }
}