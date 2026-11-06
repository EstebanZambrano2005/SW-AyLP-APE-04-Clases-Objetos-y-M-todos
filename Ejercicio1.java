// Ejercicio 1: Libro y Autor (objeto como atributo)
public class Ejercicio1 {

    // Clase Autor: representa a la persona que escribe un libro
    static class Autor {
        String nombre;
        String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
    }

    // Clase Libro: tiene un objeto de tipo Autor como atributo
    static class Libro {
        String titulo;
        int anio;
        Autor autor; // objeto como atributo

        public Libro(String titulo, int anio, Autor autor) {
            this.titulo = titulo;
            this.anio = anio;
            this.autor = autor;
        }

        // Imprime el título, el año y el nombre del autor
        public void mostrarInformacion() {
            System.out.println("Título: " + titulo);
            System.out.println("Año: " + anio);
            System.out.println("Autor: " + autor.nombre);
        }
    }

    public static void main(String[] args) {
        // Se crean los autores
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Jorge Icaza", "Ecuatoriana");

        // Se crean 2 libros
        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("Huasipungo", 1934, autor2);

        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
    }
}
