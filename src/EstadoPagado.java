public class EstadoPagado implements EstadoPedido {
    @Override
    public void avanzar(Pedido pedido) {
        pedido.setEstado(new EstadoEntregado());
        System.out.println("Se esta entregando el pedido");
    }

}
