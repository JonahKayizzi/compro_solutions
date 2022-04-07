import java.util.Scanner;

 public class RailRoadTie{

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

        System.out.println("Return result is: " + isRailRoadTie(arrayExample));

        }

        public static int isRailRoadTie (int [] a){

            if(a[0]== 0 || a[a.length - 1] == 0) return 0;
            
            for(int i = 1; i < a.length - 1 ; i++){
                if(a[i] == 0 ){
                    if (a[i-1] == 0 || a[i + 1] == 0) return 0;
                }else{
                    if(((a[i-1] == 0) && (a[i + 1] == 0)) || ((a[i-1] != 0) && (a[i+1] != 0))) return 0;
                }
            }

            return 1;
        }
    }