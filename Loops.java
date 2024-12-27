package day6;

public class Loops {
	public static void main(String[]args ) {
		for(int i=50; i>=1; i--){
		System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("");
		
		
		int n=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				continue;
				
				
			}
			else { 
				n=n+i;
			}
			
		}
		System.out.println(n);
		
		
		System.out.println("");
		
		int r=0;
		
		for(int i=1; i<=30; i++) {
			if(i%3==0) {
				System.out.println(i);
				r=r+i;
			}
			
		}
		System.out.println(r);
	}

}
