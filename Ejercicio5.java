// Ejercicio 5: Biblioteca (colaboración entre clases)
public class Ejercicio5 {

    // Clase Usuario: persona que pide libros prestados
    static class Usuario {
        String nombre;
        String cedula;

        public Usuario(String nombre, String cedula) {
            this.nombre = nombre;
            this.cedula = cedula;
        }
    }

    // Clase Libro: sabe si está disponible o prestado
    static class Libro {
        String titulo;
        boolean disponible;

        public Libro(String titulo) {
            this.titulo = titulo;
            this.disponible = true; // todo libro nuevo empieza disponible
        }

        // Intenta prestar el libro. Devuelve true si estaba disponible.
        public boolean prestar() {
            if (disponible) {
                disponible = false;
                return true;
            }
            return false;
        }

        // Devuelve el libro: vuelve a estar disponible
        public void devolver() {
            disponible = true;
        }
    }

    // Clase Prestamo: une a un Usuario con un Libro
    static class Prestamo {
        Usuario usuario;
        Libro libro;

        public Prestamo(Usuario usuario, Libro libro) {
            this.usuario = usuario;
            this.libro = libro;
        }

        // Intenta prestar el libro y muestra un mensaje según el resultado
        public void registrar() {
            if (libro.prestar()) {
                System.out.println("Préstamo exitoso: " + usuario.nombre
                        + " (C.I. " + usuario.cedula + ") se llevó \"" + libro.titulo + "\".");
            } else {
                System.out.println("No se pudo prestar: \"" + libro.titulo
                        + "\" ya está prestado. Usuario: " + usuario.nombre + ".");
            }
        }
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Don Quijote de la Mancha");
        Usuario usuario1 = new Usuario("María Pérez", "1801234567");
        Usuario usuario2 = new Usuario("Carlos Gómez", "1807654321");

        // Los dos usuarios intentan pedir el mismo libro
        Prestamo prestamo1 = new Prestamo(usuario1, libro);
        Prestamo prestamo2 = new Prestamo(usuario2, libro);

        prestamo1.registrar(); // el primero lo consigue
        prestamo2.registrar(); // el segundo no puede
    }
}
