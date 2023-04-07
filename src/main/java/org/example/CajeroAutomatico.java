package org.example;

import java.util.Scanner;

public class CajeroAutomatico {
    static int saldo = 3000, retirar, deposito;
    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {
        int opc;
        do {
            opc = menu();
            switch(opc){
                case 1:
                    retirarSaldo();
                    break;
                case 2:
                    depositarSaldo();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                default:
                    salir();
            }
        }while(opc !=4);
    }
    public static int menu(){
        int opc = 0;
        System.out.println("Bienvenido al cajero automático");
        System.out.println("----------------------------------");
        System.out.println("Presione 1 para retirar su saldo");
        System.out.println("Presione 2 para depositar su saldo");
        System.out.println("Presione 3 para consultar su saldo");
        System.out.println("Presione 4 para salir");
        System.out.println("----------------------------------");
        System.out.println("Por favor seleccione la operación que desea realizar: ");
        opc = s.nextInt();
        return opc;
    }

    public static void retirarSaldo(){
        System.out.println("\nIngrese la cantidad que desea retirar: $");
        retirar = s.nextInt();
        if(saldo >= retirar){
            saldo = saldo - retirar;
            System.out.println("\nDinero retirado exitosamente");
        }else{
            System.out.println("\nBalance insuficiente para esta operación");
        }
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }

    public static void depositarSaldo(){
        System.out.println("\nIngrese la cantidad que desea depositar: $");
        deposito = s.nextInt();
        saldo = saldo + deposito;

        System.out.println("\nSu dinero ha sido depositado exitosamente");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }

    public static void consultarSaldo(){
        System.out.println("Saldo: $"+saldo);
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
    }

    public static void salir(){
        System.out.println("Gracias por utilizar este cajero automático!");
        System.exit(0);
    }
}