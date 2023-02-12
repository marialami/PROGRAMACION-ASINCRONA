import java.util.concurrent.*;

public class EstadoPendiente implements EstadoPedido {

    @Override
    public void avanzar(Pedido pedido) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<String> future = executor
                .submit(() -> {
                    Thread.sleep(5000);
                    if (pedido.getPago()) {
                        pedido.setEstado(new EstadoPagado());
                        return "Pago completado! :)";
                    } else {
                        return "No se pudo realizar el pago :(";
                    }

                });

        while (!future.isDone()) {
            System.out.println("Se esta realizando el pago.");
            Thread.sleep(1000);
        }

        System.out.println(future.get());

        executor.shutdown();
    }

}
