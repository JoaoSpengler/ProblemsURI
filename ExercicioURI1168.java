import java.util.Scanner;

public class ExercicioURI1168 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int teste = input.nextInt();
		int leds[] = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		int total = 0;

		for (int i = 0; i < teste; i++) {
			String numero = input.next();
			char[] z = numero.toCharArray();
			for (char v : z) {
				int valor = Integer.parseInt(String.valueOf(v));
				total += leds[valor];

			}
			System.out.println(total + " leds");
			total = 0;
		}
		
	}

}
