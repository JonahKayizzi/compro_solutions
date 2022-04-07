import java.util.Scanner;
import java.util.Math;

 class CenteredArray{

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

        if((x%2) == 0){
            System.out.println("Your array elements are: ");
            for(int i = 0; i <  x ; i++){
                System.out.print(arrayExample[i] + " ");
            }
            System.out.println("The array is not centered "); 

        }else{

            int mid_point = (int)Math.floor(x/2); // mid point of the array
            boolean mid_point_bigger  = true;
            System.out.println("Your array elements are: ");

            for(int i = 0; i <  x ; i++){
                System.out.print(arrayExample[i] + " ");
                if((i != mid_point) && (arrayExample[i] < arrayExample[mid_point])){
                            mid_point_bigger = false;
                    }
                
            }

            if(mid_point_bigger){

                System.out.println("The array is centered ");
            }else{

                System.out.println("The array is not centered ");
            }
        }

        

        

        }
    
    }
