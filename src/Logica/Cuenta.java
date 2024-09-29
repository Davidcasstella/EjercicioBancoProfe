//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Logica;

public class Cuenta {
    private static int contadorCuentas = 100001;
    private int numeroCuenta;
    private String cedula;
    private double saldo;
    private double interesAnual;

    public Cuenta() {
        this.numeroCuenta = contadorCuentas++;
        this.cedula = "";
        this.saldo = 0.0;
        this.interesAnual = 0.0;
    }

    public Cuenta(String cedula, double saldo, double interesAnual) {
        this.numeroCuenta = contadorCuentas++;
        this.cedula = cedula;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return this.interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public void actualizarSaldo() {
        double interesDiario = this.interesAnual / 365.0;
        this.saldo += this.saldo * (interesDiario / 100.0);
    }

    public String ingresar(double cantidad) {
        if (cantidad > 0.0) {
            this.saldo += cantidad;
            return "Saldo ingresado correctamente";
        } else {
            return "La cantidad a ingresar debe ser positiva.";
        }
    }

    public String retirar(double cantidad) {
        if (cantidad > 0.0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            return "Cantidad retirada exitosamente";
        } else {
            return "Saldo insuficiente o cantidad no válida.";
        }
    }

    public String mostrarDatos() {
        return "Número de Cuenta: " + this.numeroCuenta + "\nCédula de Identidad: " + this.cedula + "\nSaldo Actual: " + this.saldo + "\nInterés Anual: " + this.interesAnual + "%";
    }
}
