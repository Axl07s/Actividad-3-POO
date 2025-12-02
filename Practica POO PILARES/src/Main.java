import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // La lista de tipo Pedido permite almacenar PedidoPizza y PedidoHamburguesa
        List<Pedido> pedidos = new ArrayList<>();

        // 1. Pedido de Pizza (con Delivery)
        pedidos.add(new PedidoPizza(
                "Carlos A. (Pizza Delivery)",
                "Av. Principal 123",
                15.99,
                true, // delivery: true
                "Grande",
                new String[]{"Pepperoni", "Champignones"}
        ));

        // 2. Pedido de Hamburguesa (sin Delivery)
        pedidos.add(new PedidoHamburguesa(
                "Sofia L. (Hamb. Local)",
                "Calle Secundaria 45",
                8.50,
                false, // delivery: false
                true, // combo completo
                3 // nivel picante
        ));

        // 3. Nuevo Pedido de Pizza (sin Delivery)
        pedidos.add(new PedidoPizza(
                "Juan P. (Pizza Local)",
                "Plaza Central",
                10.00,
                false, // delivery: false
                "Mediana",
                new String[]{"Extra Queso"}
        ));

        // 4. Nuevo Pedido de Hamburguesa (con Delivery)
        pedidos.add(new PedidoHamburguesa(
                "Ana V. (Hamb. Delivery)",
                "Los Robles 50",
                12.50,
                true, // delivery: true
                false, // combo incompleto
                0 // sin picante
        ));

        // Procesamiento Polimórfico: Itera sobre todos los pedidos,
        // independientemente de si son Pizza o Hamburguesa.
        for (Pedido p : pedidos) {

            // 1. Métodos comunes y abstractos (Polimorfismo)
            p.mostrarResumenPedido();
            p.mostrarDetallesEspeciales();

            // 2. Métodos de la Interfaz OperacionesPedido
            if (p instanceof OperacionesPedido) {
                OperacionesPedido op = (OperacionesPedido) p;

                System.out.println("Total: $" + String.format("%.2f", op.calcularCostoTotal()));
                System.out.println("Tiempo: " + op.estimarTiempoEntrega() + " min");
            }
            System.out.println("---------------------------");
        }
    }
}