public class Fobanacci{

    public static void main(String [] args){

        System.out.println(isFobanacci(15));
    }

    public static int closestFobanacci (int x){
        int prev_fob = 1;
        int past_fob  = 0;
        int current_fob = 0;


        while (current_fob <= x){
            
            current_fob = prev_fob + past_fob;

            past_fob = prev_fob;

            prev_fob = current_fob;

            //System.out.println(current_fob + "," + prev_fob + " , " + past_fob );
        }

        return past_fob;
    }

    public static int isFobanacci (int y){

        int past_fob = 0;
        int prev_fob = 1;
        int current_fob = 0 ;

        while (current_fob < y){

            current_fob = prev_fob + past_fob;

            past_fob = prev_fob;

            prev_fob = current_fob;
        }

        if(prev_fob == y) return 1;

        return 0;
    }
}