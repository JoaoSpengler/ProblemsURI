package Mathematics;

import java.io.IOException;
import java.util.Scanner;

public class Mathematics1805 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		long primeiroNumero = sc.nextInt();
		long segundoNumero = sc.nextInt();	
		
		long acumulo = 0;
		
		for ( long i = primeiroNumero ; i <= segundoNumero ; i++ ) {
			
			acumulo += i ;
		
		}
	
		System.out.println(acumulo);
		
	}
	
}
