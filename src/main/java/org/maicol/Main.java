package org.maicol;
/*
 * Nombre del programador: Michael Guaman
 * Materia: Lenguajes de Programacion 2
 * Fecha: 14/05/2024
 * Detalle: La clase main permite el ingreso de los datos mediante teclado
 * es decir el saldo inicial y la tasa anual
 * Version:1.1.0
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ingresamos los datos para la cuenta de ahorros mediante teclado
        System.out.print("Ingrese el saldo inicial de la cuenta de ahorros:");
        float saldo1 = sc.nextFloat();
        System.out.print("Ingrese la tasa anual de la cuenta de ahorros:");
        float tasa1 = sc.nextFloat();
        System.out.println("-------------------------------------------");
        // Creamos cuenta de ahorros con los datos ingresados
        CuentaAhorros cuentaAhorros = new CuentaAhorros(saldo1,tasa1);

        //  Ingresamos los datos para la cuenta corriente mediante teclado
        System.out.print("Ingrese el saldo inicial de la cuenta corriente:");
        float saldo2 = sc.nextFloat();
        System.out.print("Ingrese la tasa anual de la cuenta corriente:");
        float tasa2 = sc.nextFloat();
        System.out.println("-------------------------------------------");
        // Crear cuenta corriente con los datos ingresados
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldo2, tasa2);

        /*realizamos un menu para las opciones que deseamos como:
        * depositar
        * retirar
        * salir
        * */

        boolean salir = true;
        while (salir) {
            System.out.println("-------------------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Depositar en su Cuenta de Ahorros");
            System.out.println("2. Retirar de su Cuenta de Ahorros");
            System.out.println("3. Depositar en su Cuenta Corriente");
            System.out.println("4. Retirar de su Cuenta Corriente");
            System.out.println("5. Salir");
            System.out.println("-------------------------------------------");

            int op = sc.nextInt();

            switch (op) {
                //colocamos cada caso de acuerdo al menu principal
                case 1:
                    //imngresamos la cantidad a depositar en ahorros
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese la cantidad que desea depositar en su cuenta de ahorros:");
                    float deposito1 = sc.nextFloat();
                    //llamamos a los metodos de la clase cuenta
                    cuentaAhorros.depositar(deposito1);
                    cuentaAhorros.extractoMensual();
                    cuentaAhorros.imprimir();
                    System.out.println("-------------------------------------------");
                    break;
                case 2:
                    //imngresamos la cantidad a retirar en ahorros
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese la cantidad que desea retirar de su cuenta de ahorros:");
                    float retiro1 = sc.nextFloat();
                    //llamamos a los metodos de la clase cuenta
                    cuentaAhorros.retirar(retiro1);
                    cuentaAhorros.extractoMensual();
                    cuentaAhorros.imprimir();
                    System.out.println("-------------------------------------------");
                    break;
                case 3:
                    //imngresamos la cantidad a depositar en corriente
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese la cantidad que desea depositar en su cuenta corriente:");
                    float deposito2 = sc.nextFloat();
                    //llamamos a los metodos de la clase cuenta
                    cuentaCorriente.depositar(deposito2);
                    cuentaCorriente.extractoMensual();
                    cuentaCorriente.imprimir();
                    System.out.println("-------------------------------------------");
                    break;
                case 4:
                    //imngresamos la cantidad a retirar en corriente
                    System.out.println("-------------------------------------------");
                    System.out.print("Ingrese la cantidad que desea retirar de su cuenta corriente:");
                    float retiro2 = sc.nextFloat();
                    //llamamos a los metodos de la clase cuenta
                    cuentaCorriente.retirar(retiro2);
                    cuentaCorriente.extractoMensual();
                    cuentaCorriente.imprimir();
                    System.out.println("-------------------------------------------");
                    break;
                case 5:
                    //salimos
                    salir = false;
                    break;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("Ingrese una opción valida");
                    System.out.println("-------------------------------------------");
            }
        }

    }
}