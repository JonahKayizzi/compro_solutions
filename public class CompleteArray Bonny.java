public class CompleteArray {

	public static void main(String[] args) {
		
	System.out.println(isComplete(new int [] {2, 6, 3, 4}));
		
	}
	
	public static int isComplete(int [] a) {
		
		int min = 1;
		int max = 1;
		int evenNum = 0;	//counter for even numbers
		int allNum = 0;		//counter for all numbers btn minimum & maximum 
		int proven = 0;
		int complete = 0;
		
			for(int i = 0; i<a.length; i++) {				
				
					for (int k=0; k<a.length; k++) {
						
						if(a[i]%2==0 && min==1) {
							evenNum++;
							min = a[i];
						}
						else if(a[k]<min && a[k]%2==0) {
								min = a[k];
							}
								
							if(a[i]%2==0 && max==1) {
								max = a[i];
							}
							else if(a[k]>max && a[k]%2==0) {
								max = a[k];
							}
					}
					
			if(min==max) complete = 0;
					
			int m = min+1;
			while(m>min && m<max) {
						if((m)==a[i]) {
							allNum++;
						}
						else if(m>=max) break;
						m++;
			}
					
						if(((max-1)-min)==allNum) {
							proven = 1;
						}
						else proven = 0;
						
							if(evenNum>=1 && (min!=max) && proven==1) {
								complete = 1;
							}
							else complete = 0;
			}
			
			
		return complete;
	}
	
}
