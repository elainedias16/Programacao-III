//Author : Elaine Dias Pires

import java.util.Scanner;

public class j3 {
	
	public static void main(String args[]){		
		Scanner input = new Scanner( System.in );
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int aux;
	
		while(true) {
			if(n1 == n2) {    
				System.out.println(n1);
				break;
			}
			else if(n1 == 0 || n2 ==0) {
				if(n1==0) System.out.println(n2);
				else      System.out.println(n1);
				break;
			}
			else if(n1 == n2+1  || n2 == n1+1) {
				System.out.println("1");
				break;
			}
			else if(n1 > n2){
				if(n1 % n2 ==0) {
					System.out.println(n2);
					break;
				}
				else n1 = n1 - n2;	
			}
			else {//n2 > n1
				aux = n2;
				n2 = n1;
				n1 = aux;
			}
		}
		input.close();
	}
}
