import java.util.Scanner;

public class repericao_for {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double caso1 = 0;
		double caso2 = 0;
		double caso3 = 0;
		double result = 0;

		for (int i = 0; i < N; i += 1) {

			caso1 = sc.nextDouble();
			caso2 = sc.nextDouble();
			caso3 = sc.nextDouble();

			result = (caso1 * 2 + caso2 * 3 + caso3 * 5) / (2 + 3 + 5);

			System.out.printf("%.2f%n", result);
		}
		sc.close();
	}
}
