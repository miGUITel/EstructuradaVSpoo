public class TransferenciaBancariaEstructurada_0 {
    public static void main(String[] args) {
        // Definir datos de cuentas
        int cuentaOrigen = 123456;
        int cuentaDestino = 789012;
        double saldoOrigen = 500.0;
        double saldoDestino = 200.0;

        // Imprimir saldos antes de la transferencia
        System.out.println("Saldo de la cuenta origen nº: " + cuentaOrigen + " = " + saldoOrigen);
        System.out.println("Saldo de la cuenta destino nº: " + cuentaDestino + " = " + saldoDestino);

        // Realizar la transferencia
        System.out.println("Transferencia exitosa de 100 €");
        saldoOrigen -= 100.0;
        saldoDestino += 100.0;

        // Imprimir saldos después de la transferencia
        System.out.println("Saldo de la cuenta origen nº: " + cuentaOrigen + " = " + saldoOrigen);
        System.out.println("Saldo de la cuenta destino nº: " + cuentaDestino + " = " + saldoDestino);
    }
}