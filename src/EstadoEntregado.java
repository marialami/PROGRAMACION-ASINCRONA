public class EstadoEntregado implements EstadoPedido {
    @Override
    public void avanzar(Pedido pedido) {
        System.out.println("Ya se entrego el pedido, no hay mas por hacer");
    }
}
