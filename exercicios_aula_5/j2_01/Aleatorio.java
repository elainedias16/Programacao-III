package j2_01;

import  java.util.Random;
import java.util.Scanner;

class Aleatorio {
	private static Random rand;  //creating a variable that it will point to an object.
	private static final int MAX = 100 ;    
	private int numAleatorio;
	
	static {
		Scanner scan = new Scanner(System.in);
		long seed = scan.nextLong(); //reading the value from keyboard, it will be the max size sometimes.
		rand = new Random(seed);  //Creating an object that points to Random's class.
		scan.close();
		}
	 
	//public Aleatorio() {   //Constructor 1   
		 //numAleatorio = rand.nextInt(MAX); //We will use default here
	//}
	 
	public Aleatorio(int max) { //Constructor 2   
		 numAleatorio = rand.nextInt(max);  //Here, we'll use the keybord's value.
	}
	
	public Aleatorio() {
		this(MAX);
	}
	
	public int getAleatorio() {
		return numAleatorio;
	}
}

