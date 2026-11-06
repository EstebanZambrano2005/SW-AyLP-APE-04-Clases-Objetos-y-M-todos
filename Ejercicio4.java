// Ejercicio 4: Transferencias (objeto como parámetro)
public class Ejercicio4 {

    // Clase Cuenta: cuenta bancaria con titular y saldo
    static class Cuenta {
        String titular;
        double saldo;

        public Cuenta(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        // Transfiere dinero a otra cuenta (objeto como parámetro) solo si hay fondos
        public void transferir(Cuenta destino, double monto) {
            if (saldo >= monto) {
                saldo = saldo - monto;                  // se retira de esta cuenta
                destino.saldo = destino.saldo + monto;  // se deposita en la cuenta destino
                System.out.println("Transferencia exitosa de $" + monto
                        + " de " + titular + " a " + destino.titular);
            } else {
                System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de " + titular);
            }
        }

        public void mostrarCuenta() {
            System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
        }
    }

    public static void main(String[] args) {
        // Se crean 2 cuentas
        Cuenta cuenta1 = new Cuenta("Ana", 500.0);
        Cuenta cuenta2 = new Cuenta("Luis", 100.0);

        System.out.println("--- Saldos iniciales ---");
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

        // Transferencia válida: Ana tiene 500 y envía 200
        System.out.println("\n--- Transferencia válida ---");
        cuenta1.transferir(cuenta2, 200.0);
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

        // Transferencia que falla: Ana tiene 300 y quiere enviar 1000
        System.out.println("\n--- Transferencia que falla ---");
        cuenta1.transferir(cuenta2, 1000.0);
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}
