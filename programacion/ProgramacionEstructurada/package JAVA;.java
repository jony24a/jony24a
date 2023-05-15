package JAVA;


import java.security.Principal;
import java.util.*;


public class proyecto {


    public static void main(String[] args) {
        Scanner sc =  new Scanner();
        double saldo = 0;
        String[] nombre = new String[50];
        int[] cedula = new int[50];
        double[] compra = new double[50];
        double descuento = 8;
        String[] nombres = new String[50];
        String[] cedulas = new String[50];
        String[] compras = new String[50];
        String[] total = new String[50];
        int opc;


        System.out.println("Digite su Saldo: ");
        saldo = sc.nextDouble();


     


        int numeroClientes = 0;


        Syste.out.print("Digite el numero de Clientes: ");
        numeroClientes = sc.nextInt();


        for (int i = 0; i <= numeroClientes; i++) {
            System.out.println("Digite su Nombre: ");
            nombre = sc.next();
   
            System.out.println("Digite su Cedula: ");
            cedula = sc.nextInt();


            System.out.println("menu");
            System.out.println("1.LG: \n 2.ASUS: \n 3.APPLE: \n 4/SAMSUNG: \n 5.LENOVO:");
            System.out.print("Digite la opcion que desea: ");
            opc = sc.nextInt();


            switch(opc){
               
                case 1:
                    system.out.println("LG = 500");
                    saldo = saldo -500;
                    if (saldo < 0 && saldo < 500 ){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    else {
                        compra += 500;
                    }  
                     
                case 2:
                    system.out.println("LG = 300");
                    saldo = saldo -300;
                    if (saldo < 0 && saldo < 300){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    else {
                        compra += 300;
                    }  
                case 3:
                    system.out.println("LG = 800");
                    saldo = saldo -800;
                    if (saldo < 0 && saldo < 800){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    else {
                        compra += 800;
                    }  
                case 4:
                    system.out.println("LG = 650");
                    saldo = saldo -650;
                    if (saldo < 0 && saldo < 650){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    else {
                        compra += 500;
                    }  
                case 5:
                    system.out.println("LG = 250");
                    saldo = saldo -250;
                    if (saldo < 0 && saldo < 250){
                        System.out.println("Saldo insuficiente");
                        break;
                    }
                    else {
                        compra += 250;
                    }  
                default:
                    System.out.println("opcion invalida");
                    break;      
            }
             
            nombres[i] = nomre;
            cedulas[i] = cedula;
            compras[i] = compras;
        }


        for (int a = 0; a <= numeroClientes; a++){
            saldo = saldo + ((compra[i] + cedula[i]) / 3) / numeroClientes;
        }


        System.out.println("El saldo es: " + saldo);
        sc.close();
    }
}

