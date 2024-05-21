package org.maicol;
/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 14/05/2024
 * Detalle: La clase cuenta Corriente permitira verificar ciertas condiciones
 * y asu vez hereda los metodos de la clase padre Cuenta
 * Version:1.1.0
 */

/*esta clase modela una cuenta corrinte que es una sub clase de la Cuenta*/
public class CuentaCorriente extends Cuenta{

    //creamos un atributo para el sobregiro
    private float sobregiro;

    /*Constructor de la clase cuentaCorriente
     * @Param saldo, parametro que defibe el saldo de la cuenta
     * @Param tasa Parametro que definee la tasa anual de interes de la cuentade ahorros*/
    public CuentaCorriente(float saldo, float tasaAnual){
        super(saldo,tasaAnual);
        this.sobregiro=0;
    }

    // Creamos un metodo que que retire el dinero superior al saldo que se adeuda como sobregiro
    //@Param saldo, parametro que define la cantidad a retirar de una cuenta corriente
    public void retirar(float cantidad) {

        /*
        * if(cantidad >= saldo){
        * super.retirar(cantidad);
        * }
        * else {
        * float
        * }        * */

        //colocamos una condicion para verificar si existe un sobregiro
        if (cantidad >= saldo + sobregiro) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                sobregiro -= (cantidad - saldo);
                saldo = 0;
            }
            numeroRetiro= numeroRetiro+1;
        }
    }

    //Creamos un metodo que permita depositra un nuevo valor para cargar el sobregiro
    public void depositar(float cantidad) {
        //invocamos al metodo depositar de la clase Cuenta

        /*if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                cantidad -= sobregiro;
                sobregiro = 0;
                super.depositar(cantidad);

            }
        } else {
            super.depositar(cantidad);
        }
    }*/

        super.depositar(cantidad);
        if (sobregiro < 0) {
            if (cantidad >= sobregiro) {
                sobregiro += cantidad;
            } else {
                sobregiro = 0;
            }
        }
        else {
            sobregiro=0;
        }
    }

    //creamos un metodo para imprimir los datos solicitados y a su vez
    //invocamos al metodo imprimir de la clase Cuenta
    //y tambien se debe imprimir el valor del sobregiro
    public void imprimir() {
        System.out.println("-------------------------------------------");
        super.imprimir();
        System.out.println("Tiene un sobregiro de: " + sobregiro +" $");
    }
}
