public class PedidoHamburguesa extends Pedido implements OperacionesPedido {
    private boolean comboCompleto; // combo del pedido
    private int nivelPicante; // Escala de 0 a 5 del picante
    private static final double COSTO_DELIVERY = 2.80;
    private static final int TIEMPO_BASE = 15;
    private static final int TIEMPO_DELIVERY_ADICIONAL = 10;

    public PedidoHamburguesa(String cliente, String direccion, double precioBase, boolean delivery,
                             boolean comboCompleto, int nivelPicante) {
        super(cliente, direccion, precioBase, TipoComida.HAMBURGUESA, delivery);
        this.comboCompleto = comboCompleto;
        this.nivelPicante = nivelPicante;
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
        System.out.println("Detalles Especiales (Hamburguesa):");
        System.out.println("  Combo Completo: " + (comboCompleto ? "Sí" : "No"));
        System.out.println("  Nivel Picante: " + nivelPicante + "/5");
    }
}
