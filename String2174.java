import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class String2174 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		ArrayList<String> pokemons = new ArrayList<String>();

		int numPoke = input.nextInt();

		for (int i = 0; i < numPoke; i++) {
			String pokemon = input.next();
			if (!pokemons.contains(pokemon)) {
				pokemons.add(pokemon);

			}
		}
		int faltam = 151 - pokemons.size();
		
		System.out.println("Falta(m) " + faltam +   " pomekon(s).");
	}

}