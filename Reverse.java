package day7;

public class Reverse {
	public static void main(String[]args ) {
		String name= "Renu";
		String rs="";
		
		for (int i=3;i>=0;i--) {
		rs += name.charAt(i);
		}
		System.out.println(rs.toUpperCase());
		
		
		byte b= 127;
		int i= b;
		System.out.println(i);
		
		int j= 127;
		byte c= (byte)j;
		System.out.println(c);
		
		
		String fruits[]= {"apple","orange","mango"};
		for(int k=0; k<fruits.length; k++) {
			System.out.println(fruits[1]);
		}
	}

}
