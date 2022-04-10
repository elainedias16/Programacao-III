//Author : Elaine Dias Pires

import java.util.Scanner;

public class j10 {
	public static void main(String args[]){
		Scanner input = new Scanner( System.in );
		byte num = input.nextByte();
		int a =0;
		int b=1;
		int c;
		
		switch (num) {
		case 0:
			System.out.println();
			break;
		
		case 1:
			System.out.print("0 ");
			break;
			
		case 2:
			System.out.print("0 ");
			System.out.print("1 ");
			break;
			
		default:
			System.out.print("0 ");
			System.out.print("1 ");
			for(byte i=0; i<num -2  ; i++) {
				c = a + b;
				//System.out.println(c);
				System.out.print(c + " ");
				
				a = b;
				b = c;	
			}
			break;
		}
		
		input.close();
	}
}