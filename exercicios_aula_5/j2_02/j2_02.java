package j2_02;

public class j2_02 {
public static void main(String[] args) {
		
		Aleatorio[] rand = new Aleatorio[5];
		for(byte i = 0 ; i < 5 ; i++) {
			rand[i] = new Aleatorio();
			rand[i].getAleatorio();
			System.out.printf(rand[i].getAleatorio() + " ");	
		}
		
		for(byte i = 0 ; i < 5 ; i++) {
			rand[i].renovarAleatorio();
			System.out.printf(rand[i].getAleatorio() + " ");	
		}
		System.out.println();
		
		
	}
}
