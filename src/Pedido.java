import java.util.ArrayList;

public class Pedido {

    private EstadoPedido estado;
    private ArrayList<Cake> cakeOrder;
    private boolean sePago;

    public Pedido(ArrayList<Cake> cakeOrder) {
        this.cakeOrder = cakeOrder;
        this.estado = new EstadoPendiente();
        this.sePago = false;
    }

    public void siguienteEstado() throws Exception {
        estado.avanzar(this);
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void pagar() throws Exception {
        this.sePago = true;
        siguienteEstado();
    }

    public void notificarPago() {
        System.out.println("Se esta pagando el pedido.");
    }

    public boolean getPago() {
        return sePago;
    }
}
