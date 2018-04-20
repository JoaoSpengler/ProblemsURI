import java.util.Scanner;
import java.io.IOException;

public class ExercicioURI2582 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n3 = input.nextInt();

		int contador = 0;

		while (contador < n3) {
			int n1 = input.nextInt();
			int n2 = input.nextInt();

			int soma = n1 + n2;

			switch (soma) {
			case 0:
				System.out.println("PROXYCITY");
				contador = contador + 1;
				break;
			case 1:
				System.out.println("P.Y.N.G.");
				contador = contador + 1;
				break;
			case 2:
				System.out.println("DNSUEY!");
				contador = contador + 1;
				break;
			case 3:
				System.out.println("SERVERS");
				contador = contador + 1;
				break;
			case 4:
				System.out.println("HOST!");
				contador = contador + 1;
				break;
			case 5:
				System.out.println("CRIPTONIZE");
				contador = contador + 1;
				break;
			case 6:
				System.out.println("OFFLINE DAY");
				contador = contador + 1;
				break;
			case 7:
				System.out.println("SALT");
				contador = contador + 1;
				break;
			case 8:
				System.out.println("ANSWER!");
				contador = contador + 1;
				break;
			case 9:
				System.out.println("RAR?");
				contador = contador + 1;
				break;
			case 10:
				System.out.println("WIFI ANTENNAS");
				contador = contador + 1;
				break;
			default:
				System.out.println();
				contador = contador + 1;
				break;

			}
		}

	}

}