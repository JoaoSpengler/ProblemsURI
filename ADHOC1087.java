import java.util.Scanner;

public class ADHOC1087 {
	
	int x1, x2;
	int y1, y2;
	
	public ADHOC1087() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			
			if(x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0)
				break;
			
			// se forem as mesmas coordenadas
			if(x1 == x2 && y1 == y2) {
				System.out.println(0);
			}
			
			// se alguma das colunas forem a mesma, ou se for na mesma diagonal
			else if(x1 == x2 || y1 == y2 || ((x2 - x1) % (y2 - y1) == 0) && compareIgnoreSignal(x2 - x1, y2 - y1)) {
				System.out.println(1);
			}
			
			else {
				System.out.println(2);
			}
			
		}
	}
	
	boolean compareIgnoreSignal(int a, int b) {
		if(a == b || (a * -1) == b || a == (b * -1))
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		new ADHOC1087();
	}
}
