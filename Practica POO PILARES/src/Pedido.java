
        public abstract class Pedido {
            // Atributos encapsulados
            private String cliente;
            private String direccion;
            private double precioBase;
            private TipoComida tipo;
            private boolean delivery;

            // Constructor
            public Pedido(String cliente, String direccion, double precioBase, TipoComida tipo, boolean delivery) {
                this.cliente = cliente;
                this.direccion = direccion;
                this.precioBase = precioBase;
                this.tipo = tipo;
                this.delivery = delivery;
            }

            // Método abstracto
            public abstract void mostrarDetallesEspeciales();

            // Implementación del resumen de pedido (común)
            public void mostrarResumenPedido() {
                System.out.println("\n--- Resumen del Pedido ---");
                System.out.println("Cliente: " + this.cliente);
                System.out.println("Dirección: " + this.direccion);
                System.out.println("Tipo de Comida: " + this.tipo);
                System.out.println("Precio Base: $" + String.format("%.2f", this.precioBase));
                System.out.println("Requiere Delivery: " + (this.delivery ? "Sí" : "No"));
            }

            // Getters y Setters

            public String getCliente() {
                return cliente;
            }

            public void setCliente(String cliente) {
                this.cliente = cliente;
            }

            public String getDireccion() {
                return direccion;
            }

            public void setDireccion(String direccion) {
                this.direccion = direccion;
            }

            public double getPrecioBase() {
                return precioBase;
            }

            public void setPrecioBase(double precioBase) {
                this.precioBase = precioBase;
            }

            public TipoComida getTipo() {
                return tipo;
            }

            public void setTipo(TipoComida tipo) {
                this.tipo = tipo;
            }

            public boolean isDelivery() {
                return delivery;
            }

            public void setDelivery(boolean delivery) {
                this.delivery = delivery;
            }
        }