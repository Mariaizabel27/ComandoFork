
/*Números de 1 a N: Peça um número N ao usuário e imprima todos os números de 1 até N, 
 * informando se cada número é par ou ímpar.
 */
/*Desenvolvido por:Maria Izabel e Camila Morais*/
import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número N");
		int N = scanner.nextInt();

		if (N % 2 == 0) {
			System.out.println("O número digitado é par");
		}

		else {
			System.out.println(" O número digitado é ímpar");
		}

		scanner.close();

	}

}
