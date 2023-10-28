import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraPorContrato;
import entities.funcionario;
import entities.enums.Nivel;

public class empresa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departamento = sc.next();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String nome = sc.next();
		System.out.print("Level: ");
		String nivel = sc.next();
		System.out.print("Base salary: ");
		double salario = sc.nextDouble();
		
		funcionario func = new funcionario(nome, Nivel.valueOf(nivel), salario, new Departamento(departamento));
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		
		for (int i=0; i<n; i ++) {
			System.out.println("Enter contract #" + (i +1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			int valor = sc.nextInt();
			System.out.print("Duration (hours): ");
			int horas = sc.nextInt();
			HoraPorContrato contrato = new HoraPorContrato(data, valor, horas);
			func.addContrato(contrato);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String meseano = sc.next();
		int mes = Integer.parseInt(meseano.substring(0,2));
		int ano = Integer.parseInt(meseano.substring(3));
		System.out.println("Name: " + func.getNome());
		System.out.println("Departamento" + func.getDepartamento().getNome());
		System.out.println("Income for " + meseano +  ", R$" + String.format("%.2f", func.renda(ano, mes)));
		
	}
}
