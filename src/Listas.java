import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		// adicionar algo na lista
		lista.add("Maria");
		lista.add("Joao");
		lista.add("Pedro");
		lista.add("Miron");
		
		lista.add(2, "Tiago");
		
		// remover algo na lista
		lista.remove("Pedro");
		
		//tamanho da lista
		System.out.println(lista.size());
		
		//percorrer a lista
		for (String i : lista) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		//remover algo especifico da lista
		lista.removeIf(i -> i.charAt(0) == 'J');
		
		for (String i : lista) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		System.out.println("Index of Tiago: " + lista.indexOf("Tiago"));
		
		System.out.println("-----------------------");
		
		List<String> resultado = lista.stream().filter(i -> i.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String i : resultado) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		String nome = lista.stream().filter(i -> i.charAt(0) == 'M').findFirst().orElse(null);
		
		System.out.println(nome);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matriz = new int[n][m];
		
		for (int i = 0; i < n; i += 1) {
			for (int j = 0; j < n; j += 1) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal:");
		for (int i = 0; i < n; i += 1) {
				System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		
		int contagem = 0;
		
		for (int i = 0; i < n; i += 1) {
			for (int j = 0; j < n; j += 1) {
				if (matriz[i][j] > 0) {
					contagem += 1;
				}
			}
		}
		System.out.println("Numeros positivos: " + contagem);
		
		sc.close();
	}
}
