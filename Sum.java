
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double valueNote1;
		double valueNote2;
		double valueNote3;
		double valueNote4;

		System.out.println("informe o primeiro valor: ");
		valueNote1 = input.nextDouble();

		System.out.println("informe o segundo valor: ");
		valueNote2 = input.nextDouble();

		System.out.println("informe o valor da terceira nota: ");
		valueNote3 = input.nextDouble();

		System.out.println("informe o quarto valor: ");
		valueNote4 = input.nextDouble();

		System.out.println("Soma das notas: " + (valueNote1 + valueNote2 + valueNote3 + valueNote4));

		System.exit(0);
	}
}
