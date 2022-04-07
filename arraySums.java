import java.util.Scanner;

 class arraySums{

    public static void main (String[]args){
        Scanner sc;

        sc = new Scanner (System.in);

        System.out.print("Enter number of array values: ");
        int x = sc.nextInt(); // number of array elements
            
        int arrayExample[] = new int[x]; //create the array

        for(int i = 0; i < x ; i++){

            System.out.print("Enter value number " + (i + 1 )+ ": ");
            arrayExample[i] = sc.nextInt();
        }

        System.out.println("Return result is: " + arraySum(arrayExample));

        }

        public static int arraySum (int [] a){
            int sum_even = 0;

            int sum_odd = 0;

            for (int i = 0; i < a.length; i ++){
                if((a[i] % 2) == 0){
                    sum_even = sum_even + a[i];
                }else{
                    sum_odd = sum_odd + a[i];
                }
            }

            return sum_odd - sum_even;
        }
    }