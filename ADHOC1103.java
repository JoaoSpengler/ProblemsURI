import java.util.Scanner;

public class ADHOC1103 {

	int h1, m1;
	int h2, m2;

	public ADHOC1103() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			h1 = scanner.nextInt();
			m1 = scanner.nextInt();
			h2 = scanner.nextInt();
			m2 = scanner.nextInt();
			
			if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0)
				break;

			int minutosComeco = m1 + (h1 * 60);
			int minutosTermino = m2 + (h2 * 60);
			int minutosDescanco = 0;
			int ponteiroMin = minutosComeco;

			do {
				ponteiroMin++;

				if (ponteiroMin == (24 * 60)) {
					ponteiroMin = 0;
				}

				minutosDescanco++;
			} while(ponteiroMin != minutosTermino);

			System.out.println(minutosDescanco);
		}

	}

	public static void main(String[] args) {
		new ADHOC1103();
	}

}
