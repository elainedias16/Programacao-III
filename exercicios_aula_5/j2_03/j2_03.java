package j2_03;

import java.util.Scanner;
import java.lang.Character ;

public class j2_03 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String aux;   
		char c ;
		
		Cliente[] cli = new Cliente[10] ;
		int qtd = 0;
		while(true) {
		    aux = scan.nextLine();
			c = aux.charAt(0);
			
			if(c == '.') break;			
			else if(c == '+') {
				qtd++;
			
			}
			
			else if ( Character.isLetter(c)) {
				
				cli[qtd] = new Cliente();
				cli[qtd].setName(aux);
						
			}
			else {
				
				cli[qtd].setCPF(aux);
			}
		}
		
		for(byte i =0 ; i <= qtd ; i++) {
			System.out.printf(cli[i].getName());
			if(cli[i].getCPF() == null) {
				System.out.println(" ");
			}
			else {
				System.out.println( " " + cli[i].getCPF());	
			}
			
			
		}
		
	
	}
				
}
