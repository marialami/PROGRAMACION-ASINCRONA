import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<Cake> miPedidoCakes = new ArrayList<>();
        miPedidoCakes.add(new CarrotCake());
        miPedidoCakes.add(new VanillaCake());
        miPedidoCakes.add(new ChocolateCake());

        Pedido miPedido = new Pedido(miPedidoCakes);

        miPedido.siguienteEstado();
        miPedido.pagar();
        miPedido.siguienteEstado();
        miPedido.siguienteEstado();
    }
}