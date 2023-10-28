import java.util.Date;

import entities.Pedidos;
import entities.enums.OrderStatus;

public class Enumeracoes {
	
	public static void main(String[] args) {
		
	Pedidos pedido = new Pedidos(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
	
	System.out.println(pedido);
	
	// convertendo String para enum
	OrderStatus os1 = OrderStatus.valueOf("AGUARDANDO_PAGAMENTO"); // Passar o nome de tipo dentro do parenteses que o string vira enum
	
	System.out.println(os1);
	
		
	}
}
