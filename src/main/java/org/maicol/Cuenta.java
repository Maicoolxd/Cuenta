package org.maicol;
/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 14/05/2024
 * Detalle: La clase cuenta permitira el ingreso y calculo en los diferentes metodos
 * y tambien permitira heredar sus metodos a sus clases hijas: clase CuentaAhorros
 * y clase CuentaCorriente
 * Ademas sus atributos cuentan con un acceso protegido
 * Version:1.1.0
 */
/*

 * Esta clase de denomina
 * cuenta modelo una cuenta bancaria con los atributps, saldos, numeros de consignacion
 * numero de retiros, tasa anual del interes y
 * camision mensual
 * */

public class Cuenta {

    //atributos que define el sueldo
    //de una cuenta bancaria
    protected float saldo;

    // atributo que define el numero
    // de consignaciones realizadas en una cuenta bancaria
    protected int numeroConsignacion = 0;

    /*Atributo que define el numero de retiros
     * de una cuenta bancaria*/
    protected int numeroRetiro = 0;

    /*Atributos que definen la tasa anual de intereses
    de unacuenta bancaria*/
    protected float tasaAnual;

    /*Atrubuto que define la comision
     * mensaul que se cobra a una cuenta bancaria*/
    protected float comisionMensual = 0;

    /*Constructor de la clase cuenta
     * @param saldo Parametro que define el saldo de la cuenta
     * @param tasaAnual parametro que define la
     * tasa anual de interes de la cuenta*/
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    /* Metodo que recibe una cantidad de dinero a depositar y actualiza el saldo de la cuenta
     * @Param saldo Párametro que define la cantidad de dinero a depositar en la cuenta*/
    public void depositar(float cantidad) {
        /*Se actuaaliza el saldo con la cantidad depositada*/
        saldo = saldo + cantidad;
        numeroConsignacion = numeroConsignacion + 1; //se genera un contador
    }

    //creamos el metodo retirar
    /*Metodo que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
     * @param saldo parametro que define la cantidad de dinero a retirar de la cuenta*/
    public void retirar(float cantidad) {
        //float nuevoSaldo = saldo - cantidad;
        if (cantidad <= saldo) {
         saldo -= cantidad;
           numeroRetiro++;
        /*si la cantidad a retirar supera el saldo el retiro no se puede realizar*/

        // enviamos una condicion donde podemos retirar o no
        //if (nuevoSaldo <= 0) {
          //  saldo -= cantidad;
            //saldo = saldo-cantidad;
            //numeroRetiro = numeroRetiro + 1;

        } else {
            System.out.println("La cantidad que desea retirar excede su saldo actual");
        }
    }

    /*metodo que calcuele el valor del interes mensual de la cuenta a partir de la tasa anual aplicada*/
    public void calcularInteres() {
        // convertimos la tasa anual en tasa mensual
        float tasaMensual = (tasaAnual / 12)/100;
        // convertimos a dinero el interes
        float interesMensual = saldo * tasaMensual;
        //actualizamos el saldo aplicando el interes mensual
        saldo += interesMensual;
    }

    //Creamos un nuevo metodo donde genera un extracto aplicado al saldo actual una comision y calculado su interes
    public void extractoMensual() {
        saldo -= comisionMensual;
        //invocamos al metodo que calcula el interes
        calcularInteres();
    }

    //creamos un metodo que permita imprimir los atributos calculados
    public void imprimir() {
        System.out.println("-------------------------------------------");
        System.out.println("Su saldo es: " + saldo +" $");
        System.out.println("La comisión mensual: " + comisionMensual +" $");
        System.out.println("Número de transacciones que ha realizado: " + (numeroConsignacion + numeroRetiro));
    }
}






