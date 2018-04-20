import java.util.Scanner;
import java.io.IOException;

public class ExercicioURI1036 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double delta = (b * b) - (4 * a * c);

		if(delta < 0) {
			System.out.println("Impossivel calcular");
			return;
		}
		
		if(a == 0) {
			System.out.println("Impossivel calcular");
			return;
		}
		
		double r1 = (-b + Math.sqrt(delta)) / (2 * a);
		double r2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("R1 = %.5f\n", r1);
		System.out.printf("R2 = %.5f\n", r2);

	}

}