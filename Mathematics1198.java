import java.io.IOException;
import java.util.Scanner;

public class Mathematics1198 {
	
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			long soldadosAliados = sc.nextLong();
			long soldadosInimigos = sc.nextLong();

			long soldadosRestantes = 0;

			if (soldadosAliados < soldadosInimigos) {
				soldadosRestantes = soldadosInimigos - soldadosAliados;
			} else {
				soldadosRestantes = soldadosAliados - soldadosInimigos;
			}
			
			System.out.printf("%d\n", soldadosRestantes);
			
		} while(sc.hasNext());
		
	}
}
