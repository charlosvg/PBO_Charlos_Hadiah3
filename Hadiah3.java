import java.util.Scanner;
public class Hadiah3 {
	public static void main (String [] args) {
		float panjang,luas,lebar ;
		Scanner input = new Scanner (System.in);
		System.out.print("Input panjang = ");
		panjang = input.nextInt ();
		System.out.print("Input lebar = ");
		lebar = input.nextInt ();
		
		luas = panjang*lebar;
		System.out.println("Luas = "+luas);
	} 
}