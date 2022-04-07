public class isTrivalent{

    public static void main (String[]args){

        //int arrayExample[] = {22, 19, 10, 10, 19, 22, 22, 10};
        //int arrayExample[] = {1, 2, 2, 2, 2, 2, 2};
        //int arrayExample[] = {2, 2, 3, 3, 3, 3, 2, 41, 65};
        //int arrayExample[] = {-1, 0, 1, 0, 0, 0};
        //int arrayExample[] = {};
        int arrayExample[] = { 2147483647, -1, -1, -2147483648};

       System.out.println("Return result is: " + iStrivalent(arrayExample));

        }

    public static int iStrivalent (int[] a){
        
        if (a.length < 3) return 0;

        int first_value = a[0];
        boolean number_change1 = false;
        boolean number_change2 = false;  
        int second_value = 0;
        int third_value = 0;

        for (int x = 1; x < a.length; x ++){

            if(number_change2){
                if (a[x] != first_value && a[x] != second_value && a[x] != third_value){
                    return 0; 
                }
            } else if(number_change1){

                if (a[x] != first_value && a[x] != second_value){
                    third_value = a[x] ;
                    number_change2 = true; 
                    System.out.println("second number change detected at position " + x);
                }
            } else if( a[x] != first_value) {
                second_value = a[x] ;
                number_change1 = true;
                System.out.println("first number change detected at position " + x);
            
              } 

        }

        return 1;

   }

}

