    //Nombre de la clase
class CuentaBancariaPOO_3_constructor {
    /*
    *  __________________
    * | CuentaBancaria  |
    * |_________________|
    * | numeroCuenta    |
    * | saldo           |
    * |_________________|
    * | transferir      |
    * | imprimirSaldo   |
    * ___________________
    *
    * */

    //atributos______________________________________________________________________
    private int numeroCuenta;
    private double saldo;

//3
    //constructor
    public CuentaBancariaPOO_3_constructor(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //métodos_______________________________________________________________________
    public void transferir(CuentaBancariaPOO_3_constructor destino, double monto) {
        // Verificar si hay suficiente saldo en la cuenta origen
        if (this.saldo >= monto) {
            // Realizar la transferencia de 'monto' euros
            this.saldo -= monto;
            destino.saldo += monto;
            System.out.println("Transferencia exitosa de " + monto + " € de la cuenta " +
                    this.numeroCuenta + " a la cuenta " + destino.numeroCuenta);
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia desde la cuenta " +
                    this.numeroCuenta);
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo de la cuenta " + this.numeroCuenta + ": " + this.saldo);
    }
}
