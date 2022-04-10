package j2_01;

public class j2_01 {
public static void main(String[] args) {
		
		for(byte i = 0 ; i < 10 ; i++) {
			Aleatorio rand = new Aleatorio();
			rand.getAleatorio();
			System.out.printf(rand.getAleatorio() + " ");
			
		}
		System.out.println();
	}
}

/*123
2019
9223372036854775807
Exemplos de saída: 82 50 76 89 95 57 34 37 85 53
20 30 15 21 31 84 77 12 12 26
13 25 79 39 4 38 77 78 65 31
*/