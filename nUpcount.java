import java.util.Scanner;

 class nUpcount{

    public static void main (String[]args){
        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter number of array values: ");
        int x = sc.nextInt(); // number of array elements

        System.out.print("Enter value of n: ");
        int n = sc.nextInt(); // value of n

        int arrayExample[] = new int[x]; //create the array

        for(int i = 0; i < x ; i++){

            System.out.print("Enter value number " + (i + 1 )+ ": ");
            arrayExample[i] = sc.nextInt();
        }

        System.out.println("Return result is: " + nupcount(arrayExample, n));

        }

        public static int nupcount (int [] a, int n){
            int partial_sum = 0;
            int partial_sum_count = 0;
            int prev_partial_sum = 0;
            
            for (int i = 0; i < a.length; i++){

                partial_sum = partial_sum + a[i];
                if(partial_sum > n){
                    
                    if(prev_partial_sum <= n){

                        partial_sum_count = partial_sum_count + 1;
                        
                    }
                              
                }
                prev_partial_sum = partial_sum;
            }
            return partial_sum_count;
        }
    }