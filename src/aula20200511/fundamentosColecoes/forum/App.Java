package fundamentosColecoes;

public class App {

	public static void main(String[] args) {
		Produto pepsi = new Produto("Pepsi");
		Produto doritos = new Produto("Doritos");
		Produto feijao = new Produto("Feijão");
		
		ItemPedido itemUm = new ItemPedido(pepsi, 1, 1);
		ItemPedido itemDois = new ItemPedido(doritos, 1.5, 6.2);
		
		Pedido pedidoUm = new Pedido(1);
		pedidoUm.adicionarItem(itemUm);
		pedidoUm.adicionarItem(itemDois);

		for (int i = 0; i < pedidoUm.getItensPedido().size(); i++) {
			ItemPedido e = pedidoUm.getItensPedido().get(i);
			System.out.println("Pedido " + (i+1) + 
					   ", produto: " + e.getProduto().getNome() + 
					   ", quantidade: "+ e.getQuantidade() +
					   ", valor: R$" + e.getPreco());
		}
	}

}
