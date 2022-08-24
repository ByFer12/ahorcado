/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebas.codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tuxrex
 */
public class Ahorcado {
      static Scanner entr= new Scanner(System.in);
      
        static List<String> palabras=new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    
    
        public static void menu() {
        palabras.add("escoba");
        palabras.add("telefono");
        palabras.add("estrella");
        palabras.add("computadora");
        palabras.add("manzana");
        palabras.add("naranja");
        palabras.add("guitarra");
        int opcion;
        char desicion;
        do {
            System.out.println("Actualmente tiene: "+palabras.size()+" Palabras");

            do {
                System.out.println("Lista de Juegos");
                System.out.println("1-------Ingresar mas palabras");
                System.out.println("2-------Eliminar palabras");
                System.out.println("3-------Ver palabras");
                System.out.println("4-------Jugar");
                opcion = entr.nextInt();
            } while (opcion < 1 || opcion > 4);
            switch (opcion) {

                case 1:
                    ingresar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    ver();
                    break;
                case 4:
                    jugar();
                    break;
           

            }

            System.out.println("¿Esta seguro de que quiere salir?: \n S/si  N/no");
            desicion = entr.next().charAt(0);
            System.out.println("");

        } while (desicion == 'n' || desicion == 'N');

    }
    
    
    public static void ingresar(){       
        String palabra;
        System.out.print("Ingresa la nueva palabra: ");
        palabra=entr.next();
        palabras.add(palabra);
     
        }
    
    
    public static void eliminar(){
        
            int e=0,delete;
        for(String a: palabras){
            System.out.println((e)+"  "+a);
            e++;
        }
        
        System.out.print("Ingrese el numero que corresponda a la palabra que quiere eliminar: ");
        delete=entr.nextInt();
        palabras.remove(delete);
        
    }
    public static void ver(){
        
        int e=0;
         for(String a: palabras){
            System.out.println((e)+"  "+a);
            e++;
        }

    }
    
    public static void jugar(){
        int avance=0;
        int size=palabras.size();
        int index=(int)(Math.random()*size);
        String palabra=palabras.get(index);
        palabra.toLowerCase();
        int tamanioPalabra=palabra.length();
        int intentos=0, terminar=1;
        boolean correcto;
        
        char[] pal;
        char letra;
        pal=new char[tamanioPalabra];
        
           do {
            System.out.println("\nPalabra a adivinar: " + " Intentos " + intentos);
            for (int i = 0; i < pal.length; i++) {
                System.out.print(pal[i] + " - ");

            }
            intentos++;

            correcto = false;

            System.out.println("\nJugador: ingrese una letra de la palabra a adivinar");
            letra = entr.next().charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    pal[i] += letra;
                    correcto = true;
                }
            }
            
            String adivinada=String.valueOf(pal);
            
            if(adivinada.equalsIgnoreCase(palabra)){
                System.out.println("Haz adivinado la palabra oculta");
                
                terminar=0;
            }
            //comprueba si la letra ingresada no aparece en el arreglo imprime error
            
            if (correcto == false) {
                avance++;
                System.out.println("\nLetra incorrecta: ");
               
                
                if (avance == 1) {
                    System.out.println("Error 1");
                    ahorc1();
                }else if(avance==2){
                     System.out.println("Error 2");
                    ahorc2();
                }else if(avance==3){
                    System.out.println("Error 3");
                    ahorc3();
                }else if(avance==4){
                    System.out.println("Error 4");
                    ahorc4();
                }
                else if(avance==5){
                    System.out.println("Error 5");
                    ahorc5();
                }else if(avance==6){
                    System.out.println("Error 6");
                    ahorc6();
                }
                else if(avance==7){
                    System.out.println("Error 7");
                    ahorc7();
                }
                else if(avance==8){
                    System.out.println("Error 8");
                    ahorc8();
                }else if(avance==9){
                    System.out.println("Error 9");
                    ahorc9();
                }else if(avance==10){
                    System.out.println("Error 10");
                    ahorc10();
                    terminar=0;
                }
//                
            }

            //terminar--;

//            String nuevo = String.valueOf(pal);
//            if (nuevo.equalsIgnoreCase(palabra)) {
//                terminar = 0;
//
//                System.out.println("\nPalabra adivinada: " + " Terminar ");
//                for (int i = 0; i < pal.length; i++) {
//                    System.out.print(pal[i] + " - ");
//
//                }
//            }

        } while (terminar != 0);
        System.out.println("\nGracias por jugar, vuelva pronto");

        
    }
    
     public static void ahorc1(){
        System.out.println("*******************");
    }
     public static void ahorc2(){
        System.out.println("*******************");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc3(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc4(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc5(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("    |            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc6(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc7(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("    |            **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
        public static void ahorc8(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("    |_           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc9(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("   _|_           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
         public static void ahorc10(){
        System.out.println("*******************");
        System.out.println("    |            **");
        System.out.println("    |            **");
        System.out.println("    O            **");
        System.out.println("   /|l           **");
        System.out.println("   _|_           **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("  GAME OVER!     **");
        System.out.println("                 **");
        System.out.println("                 **");
        System.out.println("                 **");
    }
    
 }

    


