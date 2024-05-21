package org.maicol;
/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 14/05/2024
 * Detalle: La clase cuenta Ahorros permitira verificar ciertas condiciones
 * y asu vez hereda los metodos de la clase padre Cuenta
 * Version:1.1.0
 */

/*esta clase modela una cuenta de ahorros que es una sub clase de la Cuenta*/
public class CuentaAhorros extends Cuenta {

    /*Atributo que identifica si una cuenta esta activa: la cuenta esta activa si su saldo es superior a 10*/
    private boolean estado;

    /*Constructor de la clase cuentaAhorros
     * @Param saldo, parametro que defibe el saldo de la cuenta
     * @Param tasa Parametro que definee la tasa anual de interes de la cuentade ahorros*/
    public CuentaAhorros(float saldo, float tasaAnual){
        super(saldo,tasaAnual);
        // realizamos una condiucion para saber si la cuenta esta activa
        if(saldo <=10){
            // si desactiva la cuenta
            estado = false;
        } else {
            // caso contrario se actuiva la cuenta
            estado = true;
        }
    }

    // Creamos un metodo que que recibe una cantidad de dinero a depositar y actualizar el saldo de la cuenta
    //@Param cantidad, parametro que define la cantidad a retirar de una cuenta de ahorros
    public void depositar(float cantidad) {
        if (estado) {
            super.depositar(cantidad);
        } else {
            System.out.println("La cuenta de ahorros está inactiva. No se puede depositra dinero.");
        }
    }

    // Creamos un metodo que que recibe una cantidad de dinero a retirar y actualizar el saldo de la cuenta
    //@Param cantidad, parametro que define la cantidad a retirar de una cuenta de ahorros
    public void retirar(float cantidad) {
        //Si la cuenta esta activa se realiza el retiro
        if (estado) {
            //invocamos el metodo retirar de la clase padre
            super.retirar(cantidad);
        }
    }

    //creamos un metodo con una condicion para el numero de retiros
    public void extractoMensual() {
        if (numeroRetiro > 4){
            comisionMensual = comisionMensual+1;
            //comisionMensual += (numeroRetiro-4);
        }
        //invocamos al metodo para calcular el extracto mensual
        super.extractoMensual();
    }

    //creamos un metodo para imprimir los datos solicitados y a su vez
    //invocamos al metodo imprimir de la clase Cuenta
    public void imprimir(){
        System.out.println("-------------------------------------------");
        super.imprimir();
        System.out.println("El estado de la cuenta es:"+(estado? "Activa":"Inactiva"));
    }
}

