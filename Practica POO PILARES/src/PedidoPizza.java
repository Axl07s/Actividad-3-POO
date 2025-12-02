public class PedidoPizza extends Pedido implements OperacionesPedido {
    private String tamanio;
    private String[] ingredientesExtras;
    private static final double COSTO_DELIVERY = 3.50;
    private static final int TIEMPO_BASE = 25;
    private static final int TIEMPO_DELIVERY_ADICIONAL = 10;

    public PedidoPizza(String cliente, String direccion, double precioBase, boolean delivery,
                       String tamanio, String[] ingredientesExtras) {
        // Llama al constructor de la clase abstracta Pedido
        super(cliente, direccion, precioBase, TipoComida.PIZZA, delivery);
        this.tamanio = tamanio;
        this.ingredientesExtras = ingredientesExtras;
    }

    @Override
    public double calcularCostoTotal() {
        double costo = getPrecioBase();
        if (isDelivery()) {
            costo += COSTO_DELIVERY;
        }
        return costo;
    }

    @Override
    public int estimarTiempoEntrega() {
        int tiempo = TIEMPO_BASE;
        if (isDelivery()) {
            tiempo += TIEMPO_DELIVERY_ADICIONAL;
        }
        return tiempo;
    }

    @Override
    public void mostrarDetallesEspeciales() {
        System.out.println("Detalles Especiales (Pizza):");
        System.out.println("  Tamaño: " + tamanio);
        System.out.print("  Ingredientes Extras: ");
        if (ingredientesExtras != null && ingredientesExtras.length > 0) {
            System.out.println(String.join(", ", ingredientesExtras));
        } else {
            System.out.println("Ninguno");
        }
    }
}
