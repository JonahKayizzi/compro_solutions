import java.lib.Math;

public class Vesuvian{

    public static void main (String[]args){

        System.out.println(isVesuvian(65));
    }

    public static int isVesuvian (int x){
       // boolean first_sqr_pair_exists = false;
        //boolean second_sqr_pair_exists = false;

        
            for (int i = 0; i <= x; i++){
m
                if(isPerfectSquare(i)){
                    for(int j = 0; j <= x; j ++ ){
                        if(isPerfectSquare(j)){
                            if(i + j == x) {
                                System.out.println("i is" + i + " , and j is " + j);
                                
                                for (int k = i+1; k < x; k++){

                                    if(isPerfectSquare(k)){
                                        for(int l = 0; l <= x; l ++ ){
                                            if(isPerfectSquare(l)){
                                                if(k + l == x) {
                                                    System.out.println("k is " + k + " , and l is " + l);
                                                    if (i != l) return 1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        

        return 0;

    }

    public static boolean isPerfectSquare (int y){

        if (y < 1) return false;
        
        if (Math.sqrt(y) % 1 == 0 ) return true;

        return false;
    }
}