public interface OperacionesPedido {
    // Calcula el costo total del pedido.
    double calcularCostoTotal();

    // Muestra un resumen general del pedido.
    void mostrarResumenPedido();

    // Estima el tiempo de entrega en minutos.
    int estimarTiempoEntrega();
}
