import java.util.Scanner;

public class repeticao_while {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // O objeto vai receber o que for digitado e enviar esses dados para uma variavel

		int alcool = 0; // variavel do tipo INTEIRO declarada
		int gasolina = 0;
		int diesel = 0;
		int escolha = sc.nextInt(); // a variavel ira receber o valor INTEIRO que for digitado

		while (escolha != 4) { // enquanto o a condição dentro dos parenteses for verdadeira o comando dentro da função será repetido
			escolha = sc.nextInt(); // como o tipo da variavel ja foi declarado, não é necessário informar o tipo novamente

			if (escolha == 1) { // se a condição dentro dos parenteses for verdadeira, o comando que está dentro da função será executado
				alcool += 1;
			} else if (escolha == 2) {
				gasolina += 1;
			} else { // se não - caso os comando acima não forem verdadeiro, ele ira ser executado
				diesel += 1;
			}
		}
		System.out.println("FIM");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
