// Ejercicio 2: Rectángulo (firmas de métodos)
public class Ejercicio2 {

    // Clase Rectangulo: cada método tiene el tipo de retorno correcto
    static class Rectangulo {
        double base;
        double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        // Devuelve un decimal (double): base x altura
        public double calcularArea() {
            return base * altura;
        }

        // Devuelve un decimal (double): 2 x (base + altura)
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }

        // Devuelve verdadero o falso (boolean): es cuadrado si base y altura son iguales
        public boolean esCuadrado() {
            return base == altura;
        }

        // Devuelve un texto (String)
        public String obtenerDescripcion() {
            return "Rectángulo de " + base + " x " + altura;
        }

        // No devuelve nada (void): imprime todos los resultados
        public void mostrar() {
            System.out.println(obtenerDescripcion());
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
            System.out.println("¿Es cuadrado?: " + esCuadrado());
        }
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        r1.mostrar();

        System.out.println();

        Rectangulo r2 = new Rectangulo(5.0, 5.0); // este sí es cuadrado
        r2.mostrar();
    }
}
