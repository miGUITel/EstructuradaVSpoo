public class TransferenciaBancariaOO {
    public static void main(String[] args) {
        // Crear objetos de cuentas
        CuentaBancaria cuentaOrigen = new CuentaBancaria(123456, 500.0);
        CuentaBancaria cuentaDestino = new CuentaBancaria(789012, 200.0);

        // Imprimir saldos después de la transferencia
        cuentaOrigen.imprimirSaldo();
        cuentaDestino.imprimirSaldo();

        // Realizar la transferencia
        cuentaOrigen.transferir(cuentaDestino, 100.0);

        // Imprimir saldos después de la transferencia
        cuentaOrigen.imprimirSaldo();
        cuentaDestino.imprimirSaldo();
    }
}