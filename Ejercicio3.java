// Ejercicio 3: Producto y Venta (objeto como parámetro)
public class Ejercicio3 {

    // Clase Producto: guarda los datos del producto y controla su stock
    static class Producto {
        String nombre;
        double precio;
        int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        // Reduce el stock solo si hay suficiente. Devuelve true si se pudo.
        public boolean reducirStock(int cantidad) {
            if (stock >= cantidad) {
                stock = stock - cantidad;
                return true;
            } else {
                System.out.println("Stock insuficiente.");
                return false;
            }
        }

        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
        }
    }

    // Clase Venta: recibe un objeto Producto como parámetro
    static class Venta {
        int cantidad;

        public Venta(int cantidad) {
            this.cantidad = cantidad;
        }

        // Reduce el stock y muestra el total a pagar (solo si hubo stock)
        public void aplicar(Producto producto) {
            if (producto.reducirStock(cantidad)) {
                double total = producto.precio * cantidad;
                System.out.println("Venta realizada. Total a pagar: $" + total);
            }
        }
    }

    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 650.0, 5);
        laptop.mostrarProducto();

        // Venta válida
        System.out.println("\n--- Venta de 2 unidades ---");
        Venta venta1 = new Venta(2);
        venta1.aplicar(laptop);
        laptop.mostrarProducto();

        // Venta que falla: pide más de lo que hay
        System.out.println("\n--- Venta de 10 unidades ---");
        Venta venta2 = new Venta(10);
        venta2.aplicar(laptop);
        laptop.mostrarProducto();
    }
}
