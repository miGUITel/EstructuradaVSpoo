public class BancoMain_4 {
    public static void main(String[] args) {
        // Crear objetos de cuentas
        //1
        //Esto es una instanciación, es como crear una variable con un tipo de datos personalizado
        CuentaBancariaPOO_3_constructor cuentaOrigen = new CuentaBancariaPOO_3_constructor(123456, 500.0);
        //Compara con estructurada:
        //      int cuentaDestino = 789012;
        //      double saldoOrigen = 500.0;
        CuentaBancariaPOO_3_constructor cuentaDestino = new CuentaBancariaPOO_3_constructor(789012, 200.0);

        // Imprimir saldos después de la transferencia
        //2
        //Esto es un mensaje, la clase TransferenciaBancaria00 solicita el uso de
        //un método de la clase CuentaBancaria
        cuentaOrigen.imprimirSaldo();
        cuentaDestino.imprimirSaldo();

        // Realizar la transferencia
        cuentaOrigen.transferir(cuentaDestino, 100.0);

        // Imprimir saldos después de la transferencia
        cuentaOrigen.imprimirSaldo();
        cuentaDestino.imprimirSaldo();
    }
}