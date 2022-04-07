import java.util.Scanner;

class IsPacked{

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

        System.out.println("Return result is: " + isPacked(arrayExample));

        }

        public static int isPacked (int [] a){
            
            for (int i = 0; i < a.length ; i ++){
                if(a[i] < 0) return 0;
               // if(a[i] = a[i+1]){
                int j;
                for(j = i; j < a[i]; j ++){
                    if(a[i] != a[j]) return 0;
                }

                i = j + 1;
                    
            }

            for (int i=0;i<a.length;i++) {
                int count=0;
                for (int j=0;j<a.length;j++) {
                    if(a[i]==a[j]) count++;
                }
                if (count!=a[i]) return 0;
            }

            return 1;
            
        }
    }