//Author : Elaine Dias Pires

public class j2 {
	public static void main(String[] args) {
		short num;
		byte n1, n2;
		short resul;
		
		for(num = 1000; num <= 9999; num++) {
			n1 = (byte) ( num/100 );
			n2 = (byte) (num % 100);
			resul =  (short) (n1 + n2)  ;
			resul *= resul ;
			if(num == resul) {
				 System.out.println(resul);
			}					 
		 } 		 
	 }		
			
}
