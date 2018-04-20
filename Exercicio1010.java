import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
				
		int cod1 = 0;
		int numpc1 = 0;
		float vlunit1 = 0;
		int cod2 = 0;
		int numpc2 = 0;
		float vlunit2 = 0;
		float total = 0;
		
		
		
		cod1 = scanner.nextInt();
		numpc1 = scanner.nextInt();
		vlunit1 = Float.parseFloat(scanner.next());
		
		cod2 = scanner.nextInt();
		numpc2 = scanner.nextInt();
		vlunit2 = Float.parseFloat(scanner.next());
		
		total += (numpc1 * vlunit1);
		
		total += (numpc2 * vlunit2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
	
	}

}