//Author : Elaine Dias Pires

public class j1 {
	public static void main(String[] args) {
		//n refers to numerator and d to denominator.The number refers to what expression is being calculated.
		byte n1, d1 , n3=1, d3=1, d2; 
		long n2;
		double s1=0, s2=0, s3=0;
		
		for(n1=1, d1=1, n2=2 , d2= 50  ; d1=50 ;  n1+=2 , d1++ , n2 =2, d2--) {
			s1 += (double) n1d1 ;
			s2 +=  (double) n2d2;
			
			if(d1 = 10) {
				n3 = d1 ;
				d3 =  (byte) (n3  n3);
				
				if(n3 % 2 == 0) {
					s3 -= (double) n3d3;
				}
				else {
					s3 += (double) n3d3;				
				}
			}
		}
		
		System.out.println(S1 =  + s1);
		System.out.println(S2 =  + s2);
		System.out.println(S3 =  + s3);
	 }		
}
