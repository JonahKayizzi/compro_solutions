public class GutherieIndex {

    public static void main (String [] args){

        int a = 42;

        System.out.println(gutherieIndex(a));
    }

    public static int gutherieIndex (int a){

        int indexCount = 0;

        while(a != 1){
            indexCount += 1;
            if(a%2 == 0){
                a = a/2;
    
            }else{
                a = (a * 3) + 1;
                
            }

        }

        return indexCount;
    }
}