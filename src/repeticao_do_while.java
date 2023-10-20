import java.util.Scanner;

public class repeticao_do_while {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // o objeto vai receber o valor que for digitado e enviar para uma variavel 
		
		double celsius; //double é um tipo que aceita a inclusão de numeros com casas decimais
		double fahrenheit;
		char opcao; // char é um tipo que aceita a inclusão de apenas um caractere
		
		do { // primeiro se executa o comando dentro da função e depois a condição, então o comando dentro dessa função vai ser executado pelo menos uma vez
			System.out.print("Digite uma temperatura em Celsius: ");
			celsius = sc.nextDouble(); // declarar que a variavel vai receber o valor double
			fahrenheit = 9 * celsius / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit); //quando se tem uma variavel de tipo double se usa o printf para poder dizer quantas casas decimais serão exibidas
			System.out.print("Deseja continuar [s/n]? "); //print sozinho não tem quebra de linha
			opcao = sc.next().charAt(0);
			} while (opcao != 'n'); // enquanto essa condição for verdadeira o comando acima dele ira se repetir
		
		sc.close(); // para fechar a classe Scanner
	}

}
