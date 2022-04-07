import java.util.Scanner;

public class isInertial{

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

        System.out.println("Return result is: " + isInertial(arrayExample));

        }

    public static int isInertial(int[]a){
        boolean oddExists = false;
        boolean evenMax = false;
        boolean oddsBiggerEvens = false;

        int largest = 0;
        int maximumEven = 0;
        int largestEven2 = 0;

        for (int i = 0; i < a.length; i++){
            
            if(a[i] % 2 == 1) {
                oddExists = true;
                System.out.println("Odd Exists");
                break;
                }
        }
        
        for (int i = 0; i < a.length; i++){
            
            if (a[i] > largest)largest = a[i];

        }

        if(largest % 2 == 0) {
            maximumEven = largest;
            evenMax = true;
            System.out.println("Maximum is even and value is: " + maximumEven);
        }

        int smallestOdd = largest;
        for(int i = 0; i < a.length; i ++){
            
            if((a[i] % 2 == 1) && (a[i] < smallestOdd)){
              smallestOdd = a[i];
              System.out.println("Smallest Odd is: " + smallestOdd);
            }

            if((a[i] % 2 == 0) && (a[i] > largestEven2) ){
                if(a[i] != maximumEven){
                    largestEven2 = a[i];
                    System.out.println("Second biggest even is: " + largestEven2);
                }
            }
           
        }

        if(smallestOdd > largestEven2) {
            oddsBiggerEvens = true;
            System.out.println("Odds are bigger than evens");
        }

       if(oddExists && evenMax && oddsBiggerEvens){
           return 1;
       }
       return 0;

    }

}

