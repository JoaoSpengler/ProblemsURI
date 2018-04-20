import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio1008 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        float moneyPerHour = Float.parseFloat(scanner.nextLine());
        
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f", (moneyPerHour * hours));
        System.out.println();
        
    }
 
}