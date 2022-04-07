import java.util.Scanner;

public class maxOccurs{
    
    public static void main (String []args){
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int x = sc.nextInt();

        System.out.println("The maximum occurance number is: " + maxOccurs(x));

    }

   public static int maxOccurs(int n){
       int currentMaxCount = 0;
       int currentMaxDigit = 0;
       int currentMaxRepeatedCount = 0;

    if (n < 0) n = -n;
    while (n > 0){
        int m = n % 10;

        int x = n;
        int count = 0;
        while(x > 0){
            int y = x % 10;
            if (y == m) count ++;

            x = x / 10;
        }

        if (count > currentMaxCount){
            currentMaxCount = count;
            currentMaxDigit = m;
            
        }else if (count == currentMaxCount){
            currentMaxRepeatedCount = currentMaxCount;
        }

        n = n/10;

    }

    if(currentMaxRepeatedCount == currentMaxCount) return -1;
    return currentMaxDigit;
   }
}